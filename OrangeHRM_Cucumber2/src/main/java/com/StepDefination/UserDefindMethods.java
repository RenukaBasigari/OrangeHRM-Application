package com.StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserDefindMethods {
	
	
	public static WebDriver driver;
	String applicationUrlAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	
	@Given("^User should Open ChromeBrowser in the System$")
	public void user_should_Open_ChromeBrowser_in_the_System() 
	{
		//automate the ChromeBrowser
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		driver = new ChromeDriver();
		// Log.info("Sucessfully Launched Chromebrowser");
	   
	}

	@When("^User enters OrangeHRM Application url Address$")
	public void user_enters_OrangeHRM_Application_url_Address() 
	{
		 driver.get(applicationUrlAddress);
		    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  // Log.info("Sucessfully Launched Chromebrowser");
	   
	    
	}

	
	@Then("^User should be navigated to OrangeHRM Application Login WebPage$")
	public void user_should_be_navigated_to_OrangeHRM_Application_Login_WebPage() 
	{
	    
		//"id=LoginPanelHeading"
		
	By loginpanelTextproperty=By.id("LoginPanelHeading");
	
	WebElement LoginPanel=driver.findElement(loginpanelTextproperty);
	
	String	expected_OrangeHRMApplicationLoginPageText="LOGIN Panel";
	
	//Log.info("The expected text of the OHRM Application Login Page is -"+expected_OrangeHRMApplicationLoginPageText);
		
	String actual_OrangeHRMApplicationLoginPageText=LoginPanel.getText();
	
	//Log.info("The actual text of the OHRM Application Login Page is -"+actual_OrangeHRMApplicationLoginPageText);
	
	if(actual_OrangeHRMApplicationLoginPageText.equals(expected_OrangeHRMApplicationLoginPageText))
	{
		//Log.info("OrangeHRMApplication LoginPageTextValidation Sucessfull-PASS");
	}
	else
	{
		//Log.info("OrangeHRMApplication LoginPageTextValidation UNSucessfull-FAIL");
	}
	
	}
	
	

	@Then("^User should close the OrangeHRM Application along with the Browser$")
	public void user_should_close_the_OrangeHRM_Application_along_with_the_Browser()
	{
		
		driver.quit();
	//	Log.info("ChromeBrowser along with OrangeHRM Application Closed Sucessfully ");
			
	    
	    
	}


	
	
	



}
