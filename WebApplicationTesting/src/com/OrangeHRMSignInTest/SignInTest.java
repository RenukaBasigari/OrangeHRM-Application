package com.OrangeHRMSignInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Desktop\\web Application Testing\\WebApplicationTesting\\browserFiles\\chromedriver.exe");
		
		ChromeDriver renuka = new ChromeDriver();
		
		renuka.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		//Validating OrangeHRM Application Login Page
		//Identifying the Properties of UserName Element-by inspecting
		//<div id="divUsername" class="textInputContainer">
        //<input name="txtUsername" id="txtUsername" type="text">
		//id=Locator
		//txtUsername-Selector
		
		renuka.findElement(By.id("txtUsername")).sendKeys("Renuka");
		
		//Identifying the properties of Password Element
		//<div id="divPassword" class="textInputContainer">
        //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">         <span class="form-hint" style="display: none;">Password</span>
  
		String passwordTestData="Renuka@123";
		
		By passwordProperty=By.name("txtPassword"); 
		WebElement password=renuka.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		//Identifying the Properties of Login 
		
		//<div id="divLoginButton">
       // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">UTTONProperty
                
		By loginButtonProperty=By.className("button"); 
		WebElement LoginButton=renuka.findElement(loginButtonProperty);
		LoginButton.click();
		
	
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static void findElement(Object passwordProperty) {
		// TODO Auto-generated method stub
		
	}

}
