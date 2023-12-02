package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingHomePage_ScreenShot {
	
	WebDriver renuka;
	String applicationUrlAddress="http://bing.com";
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Desktop\\web Application Testing\\WebApplicationTesting\\browserFiles\\chromedriver.exe");
		renuka=new ChromeDriver();
		renuka.get(applicationUrlAddress);
	}
	public void CapturingScreenShot() throws IOException {
		File bingScreenShot=((TakesScreenshot)renuka).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bingScreenShot, new File("./Screenshot/suresh.png"));
		renuka.quit();
	}
	
	public static void main(String[] args) throws IOException {
		BingHomePage_ScreenShot screenshot=new BingHomePage_ScreenShot();
		screenshot.applicationLaunch();
		screenshot.CapturingScreenShot();
		
	}
	
}
