package com.WebTable;

import org.apache.poi.hpbf.model.MainContents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CapturingFirstRow_LastRowNames extends BaseTest {
	
	public void capturingFirstRow_LastRowNames()

	{
		//FirstRow-FirstCellXpathExpression
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		//LastRow-FirstCellXpathExpression
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		//The Xpath divided into 2 parts
		//Part1=html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[
		//part2=1]/td[1]
		
		String xpathExpressionPart1="html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xpathExpressionPart2="]/td[1]";
		
		for(int tablerowindex=1;tablerowindex<=36;tablerowindex++)
		{
		//	for(int rowofCellindex=1;rowofCellindex<=8;rowofCellindex++)
			{
			By CityNameProperty=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+tablerowindex+"]/td[1]");
		//By CityNameProperty=By.xpath(xpathExpressionPart1+rowindex+xpathExpressionPart2);
			
		WebElement cityName=renuka.findElement(CityNameProperty);
		
		String cityNameText=cityName.getText();
		
		System.out.println(cityNameText);
			}
		}
			
		
		
	}
public static void main(String[] args) {

	CapturingFirstRow_LastRowNames  getcityName=new CapturingFirstRow_LastRowNames();
	getcityName.ApplicationLaunch();
	getcityName.capturingFirstRow_LastRowNames();
	//getcityName.ApplicationClose();
	
	
}

	}

