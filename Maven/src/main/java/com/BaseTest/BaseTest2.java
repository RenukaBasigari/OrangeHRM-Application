package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest2 {
	

		WebDriver driver;
		String applicationUrlAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		@BeforeTest
		public void setup()
		{

		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		driver=new ChromeDriver();
        driver.get(applicationUrlAddress);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

	
		}
		@AfterTest
		public void teardown()
		{
			driver.quit();
		}
}
		


