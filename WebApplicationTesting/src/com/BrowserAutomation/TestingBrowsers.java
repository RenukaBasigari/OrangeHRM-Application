package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestingBrowsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Desktop\\web Application Testing\\WebApplicationTesting\\browserFiles\\chromedriver.exe");
		
		
		
		ChromeDriver renuka = new ChromeDriver();
		
	renuka.get("http://google.com");
	
		

	}

}
