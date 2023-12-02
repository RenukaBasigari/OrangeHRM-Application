package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tsrtc_HandlingAlert extends BaseTest {
	
	public void checkAvailabilityTest()
	{
		//id=searchBtn
	By	checkAvailabilityProperty=By.id("searchBtn");
WebElement	checkAvailability=renuka.findElement(checkAvailabilityProperty);

       checkAvailability.click();
	}
	
        public void handlingAlert() throws InterruptedException
       {
        
        
    //  Thread.sleep(5000);
        	
      Alert alertWindow=renuka.switchTo().alert();
 
    String expected_AlertText="Please select start place";
    
    System.out.println("The Expected Text of the Alert Window is -"+expected_AlertText);
    
   String  actual_AlertText=alertWindow.getText();
   
   System.out.println("The Actual Text of the Alert Window is -"+actual_AlertText);
   
   if(actual_AlertText.equals(expected_AlertText))
   {
	   System.out.println("Navigated to Alert Window -PASS");
   }
   else
   {
	   System.out.println("Failed to Navigated Alert Window -FAIL");
   
   }
   alertWindow.accept();
        	}
       

       public static void main(String[] args) throws InterruptedException {
    	   
    	   Tsrtc_HandlingAlert alertHandling=new Tsrtc_HandlingAlert();
    	   alertHandling.ApplicationLaunch();
    	   alertHandling.handlingAlert();
         	   
	
}
}
