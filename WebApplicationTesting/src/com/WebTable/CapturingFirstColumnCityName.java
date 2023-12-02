package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CapturingFirstColumnCityName extends BaseTest {
	
	public void capturingFirstCoumncityName()
	{
		
		//first Row of first cell
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		//Locator=XPath
		//Selector=Xpath Expression
		
	By	CityNameProperty=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
	WebElement CityName=renuka.findElement(CityNameProperty);
	String CityNameText=CityName.getText();
	
	System.out.println(CityNameText);
		
	}
	public static void main(String[] args) {
		
		CapturingFirstColumnCityName getCityName=new CapturingFirstColumnCityName();
		getCityName.ApplicationLaunch();
		getCityName.capturingFirstCoumncityName();
		getCityName.ApplicationClose();
		
	}
	
	

}
