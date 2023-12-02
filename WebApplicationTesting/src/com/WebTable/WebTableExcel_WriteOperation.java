package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExcel_WriteOperation{
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream testDataFile=new FileInputStream("./src/com/ExcelOperations/SingleTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(testDataFile);
		
		XSSFSheet testDataSheet=workbook.getSheet("testDataSheet");
		
		//Create particualar Row in the Sheet
		
	try
	{
		
   Row SheetofNewRowCreated=testDataSheet.createRow(1);
		
		//Create Particular Row of Cell 
		
	Cell	newRowofCellCreated=SheetofNewRowCreated.createCell(0);
	
	newRowofCellCreated.setCellValue("");

		
	
	FileOutputStream testResultFile=new FileOutputStream("/src/com/ExcelOperations/testDataSheet.xlsx");
	workbook.write(testResultFile);
	}
	catch(Exception IOException)
	{
		System.out.println();
	}
	
	WebDriver renuka;
	String	ApplicationUrlAddress="https://www.timeanddate.com/worldclock";
	
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		renuka =new ChromeDriver();
		
		System.out.println("ChromeBrowser Started Sucessfully");
		
		renuka.get(ApplicationUrlAddress);
		
		System.out.println("Successfully Navigated Time and Date Application");
		
		String xpathExpressionPart1="html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xpathExpressionPart2="]/td[1]";
		
		for(int tablerowindex=1;tablerowindex<=36;tablerowindex++)
		{
			for(int rowofCellindex=1;rowofCellindex<=8;rowofCellindex++)
			{
			By tableDataProperty=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+tablerowindex+"]/td["+rowofCellindex+"]");
		
		//By CityNameProperty=By.xpath(xpathExpressionPart1+rowindex+xpathExpressionPart2);
			
		WebElement cityName=renuka.findElement(tableDataProperty);
		
		String tableDataText=cityName.getText();
	
		CopyAction("./src/com/ExcelOperations/SingleTestData.xlsx\"");
		System.out.println(tableDataText + "| ");
			}
		}
			
		
		
		
	}

	private static void CopyAction(String string) {
		// TODO Auto-generated method stub
		
	}
		

		
		
	}


