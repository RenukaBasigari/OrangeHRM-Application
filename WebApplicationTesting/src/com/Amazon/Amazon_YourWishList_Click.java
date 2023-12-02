package com.Amazon;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_YourWishList_Click {
	
	
	WebDriver renuka;
	String ApplicationUrlAddress="http://amazon.in";
	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Desktop\\web Application Testing\\WebApplicationTesting\\browserFiles\\chromedriver.exe");
		
	renuka=new ChromeDriver();
	renuka.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	System.out.println("******Sucessfully Launched ChromeBrowser****");
	
	renuka.get(ApplicationUrlAddress);
	System.out.println("Navigated to Amazon Application HomePage");
	
	}
	//Hello Signin Element -Which is a Mouse Hover Operation
	public void hellosignin()
	{
		//<span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span>
		//<span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span>
		 By hellosigninproperty=By.id("nav-linkaccount-List");
		WebElement hellosignin =renuka.findElement(hellosigninproperty);
		//Actions -it is a class of selenium used to perform operations related to either mouse or keyboard
		Actions hellosigninMouseHover=new Actions(renuka);
		hellosigninMouseHover.moveToElement(hellosignin).build().perform();
		
	
	}
	
	public void YourWishListClick()
	{
	//<span class="nav-text">Your Wish List</span>
	//Locater=linkText
	//selector=YourWishList
		
	By YourWishListProperty=By.linkText("Your Wish List");
	
	WebElement YourWishList=renuka.findElement(YourWishListProperty);
	
	YourWishList.click();
	
	String Currentwebpage=renuka.getTitle();
	System.out.println("The Title of the Current WebPage is-");
	
	
	}
	
	public static void main(String[] args) {
		Amazon_YourWishList_Click amazon=new Amazon_YourWishList_Click();
		amazon.applicationLaunch();
		amazon.hellosignin();
		amazon.YourWishListClick();
		
	}
	
	
}
