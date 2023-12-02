package com.OrangeHRMSignInTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyAdmin {
	
	public static void main(String[]arg) {
		
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		
		
		ChromeDriver renuka=new ChromeDriver();
		
		//Where we are Using Implicit wait
		//It is a smart wait
		//Intelligent wait
		
		
		renuka.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		renuka.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		By userNameProperty=By.id("txtUsername");
	
		WebElement userName=renuka.findElement(userNameProperty);
		
		
		userName.sendKeys("Renuka");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		By passwordProperty=By.id("txtPassword");
		WebElement password=renuka.findElement(passwordProperty);
		
		password.sendKeys("Renuka@123");
		
		
		
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By loginProperty=By.id("btnLogin");
		WebElement login=renuka.findElement(loginProperty);
		login.click();
		
		
		String expectedWelcomeAdminLinkText="Admin";
		System.out.println("The Expected Name of WelcomeAdmin Text is ="+expectedWelcomeAdminLinkText);
		
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		
		By welcomeAdminProperty=By.linkText("Welcome Admin");
		
		WebElement welcomeadminlink=renuka.findElement(welcomeAdminProperty);
		
		welcomeadminlink.click();
		
		String actualWelComeAdminText=welcomeadminlink.getText();
		
		System.out.println("The Actual Name of WelcomeAdmin Text is ="+actualWelComeAdminText);
		
		if(actualWelComeAdminText.contains(expectedWelcomeAdminLinkText))
		{
			System.out.println("The Expected WelcomeAdmin text Contain in ActualWelcomeAdmin Text = Pass");
		}
		else
		{
			System.out.println("The Expected WeccomeAdmin text does NOT Contain in ActualWelcomeAdmin Text = Fail");
		}
		
		
		//<li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>
		
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		
	//	By logoutProperty=By.linkText("Logout");
	//	WebElement logout=renuka.findElement(logoutProperty);
		//logout.click();
		
		By logoutProperty=By.linkText("Logout");
	WebElement logout=renuka.findElement(logoutProperty);
		logout.click();
		
		
		
		
		
		
		
	
		
		
			}

}
