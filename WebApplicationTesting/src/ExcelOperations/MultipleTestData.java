package ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleTestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//identify the file(Excel File)of the System
		FileInputStream testDataFile=new FileInputStream("./src/com/ExcelOperations/SingleTestData.xlsx");
		
	XSSFWorkbook workbook=new XSSFWorkbook(testDataFile);
	
	XSSFSheet testDataSheet=workbook.getSheet("Sheet1");
	
	//identify the number rows in the Sheet
	
	int rowCount=testDataSheet.getLastRowNum();
	
	//for going to every active row in the sheet
	
	for(int rowindex=0;rowindex<=rowCount;rowindex++)
	{
		//going to a particular Row
		Row testDataRow=testDataSheet.getRow(rowindex);
		
		//In the current row -Finding the Number of Active cells
		int rowofcellsCount=testDataRow.getLastCellNum();
		
		//To goto Every Active Row of All the Active Cells
		for(int rowofcell=0;rowofcell<rowofcellsCount;rowofcell++)
		{
			//going to an Active Row of ActiveCell
			Cell testDataRowofActivecell=testDataRow.getCell(rowofcell);
			
			//getting the data from the Active Row of an Active Cell
      String testData=testDataRowofActivecell.getStringCellValue();
      
      //print the data
      
      System.out.println(testData+"");
      
      System.err.println();
		
		}
		
		
		
		
	}
	

	}

}
