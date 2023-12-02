package com.WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	
	WebDriver renuka;
String	ApplicationUrlAddress="https://www.timeanddate.com/worldclock";
 
public void ApplicationLaunch()
{
	System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
	renuka =new ChromeDriver();
	
	System.out.println("ChromeBrowser Started Sucessfully");
	
	renuka.get(ApplicationUrlAddress);
	
	System.out.println("Successfully Navigated Time and Date Application");
	
}

public void ApplicationClose()
{
	renuka.quit();

	
}

}
