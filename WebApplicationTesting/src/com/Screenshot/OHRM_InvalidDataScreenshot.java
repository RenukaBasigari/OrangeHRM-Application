package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_InvalidDataScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		
		ChromeDriver renuka = new ChromeDriver();
		
		renuka.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		//Validating OrangeHRM Application Login Page
		//Identifying the Properties of UserName Element-by inspecting
		//<div id="divUsername" class="textInputContainer">
        //<input name="txtUsername" id="txtUsername" type="text">
		//id=Locator
		//txtUsername-Selector
		
		renuka.findElement(By.id("txtUsername")).sendKeys("devi");
		
		//Identifying the properties of Password Element
		//<div id="divPassword" class="textInputContainer">
        //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">         <span class="form-hint" style="display: none;">Password</span>
  
		String passwordTestData="1234";
		
		By passwordProperty=By.name("txtPassword"); 
		WebElement password=renuka.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		//Identifying the Properties of Login 
		
		//<div id="divLoginButton">
       // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">UTTONProperty
                
		By loginButtonProperty=By.className("button"); 
		WebElement LoginButton=renuka.findElement(loginButtonProperty);
		LoginButton.click();
		
		File Invalidcredentials=((TakesScreenshot)renuka).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Invalidcredentials, new File("./Screenshot/Renuka.png"));
		
	}
}