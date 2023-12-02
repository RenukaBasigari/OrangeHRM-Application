package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	
	WebDriver renuka;
	
String ApplicationURLAddress="https://www.tsrtconline.com";

   public void ApplicationLaunch()
{
	   System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		

	  renuka = new ChromeDriver();
		renuka.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		renuka.get(ApplicationURLAddress);
		 
	   
	renuka.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
}
   public void applicationClose()
   {
	   renuka.quit();
   }

}
