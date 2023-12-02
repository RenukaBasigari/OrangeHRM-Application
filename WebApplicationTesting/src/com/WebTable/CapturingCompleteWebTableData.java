package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CapturingCompleteWebTableData extends BaseTest{
	
	public void capturingCompleteWebTableData() throws IOException
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
				
				for(int tablerowindex=1;tablerowindex<36;tablerowindex++)
				{
					for(int rowofCellindex=1;rowofCellindex<8;rowofCellindex++)
					{
					By CountryProperty=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+tablerowindex+"]/td["+rowofCellindex+"]");
				//By CityNameProperty=By.xpath(xpathExpressionPart1+rowindex+xpathExpressionPart2);
					
				WebElement testdatanames=renuka.findElement( CountryProperty);
				
				String names=testdatanames.getText();
				
				System.out.println(testdatanames + "| ");
				
				
			FileInputStream	testdataFile=new FileInputStream("./src/com/ExcelOperations/testDataSheet.xlsx");
			
	XSSFWorkbook workbook=new XSSFWorkbook(testdataFile);
	
XSSFSheet	testDataSheet=workbook.getSheet("testDatsSheet");

  Row  testdataofrow=testDataSheet.getRow(tablerowindex);
  
       Cell rowofcellvalue=testdataofrow.createCell(rowofCellindex);
       
       rowofcellvalue.setCellValue(names);
       
       
  FileOutputStream   W  =new FileOutputStream("./src/com/ExcelOperations/testDataSheet.xlsx");
  workbook.write(W);
					}
				}
				System.out.println();
					
				
				
			}
		public static void main(String[] args) throws IOException {

			CapturingCompleteWebTableData gettableData=new CapturingCompleteWebTableData();
			gettableData.ApplicationLaunch();
			gettableData.capturingCompleteWebTableData();
			gettableData.ApplicationClose();
			
			
		}

			}



