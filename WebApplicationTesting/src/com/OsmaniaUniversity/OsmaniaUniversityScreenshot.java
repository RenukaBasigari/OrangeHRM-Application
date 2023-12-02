package com.OsmaniaUniversity;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OsmaniaUniversityScreenshot {
	

		WebDriver renuka;
		
		String applicationUrlAddress="http://www.osmania.ac.in/";
	
		
		public void applicationLaunch()
		{
			//System.setProperty("webdriver.chrome.driver","./newbrowser/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
			

			//ChromeDriver  renuka = new ChromeDriver();
			renuka=new ChromeDriver();
			
			renuka.get(applicationUrlAddress);
			
		
		}
		public void CapturingScreenShot() throws IOException {
			
			File OsmaniaUniversityScreenshot=((TakesScreenshot)renuka).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(OsmaniaUniversityScreenshot, new File("./Screenshot/Renu.png"));
			//renuka.quit();
		}
		
		public static void main(String[] args) throws IOException {
			
			OsmaniaUniversityScreenshot screenshot=new OsmaniaUniversityScreenshot();
			screenshot.applicationLaunch();
			screenshot.CapturingScreenShot();
			
			
		}
			
		
		
	}


