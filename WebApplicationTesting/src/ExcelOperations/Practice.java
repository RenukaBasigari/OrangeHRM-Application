package ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream testDatafile=new FileInputStream("./src/com/ExcelOperations/SingleTestData.xlsx");		
		
		XSSFWorkbook Workbook=new XSSFWorkbook(testDatafile);
		
		XSSFSheet testDataSheet=Workbook.getSheet("Sheet3");
		
		Row testDataSheetRow=testDataSheet.getRow(2);
	
		Cell testDataSheetRowOfCell=testDataSheetRow.getCell(2);
		
		
	String testData=testDataSheetRowOfCell.getStringCellValue();
	
	System.out.println(testData);
		
		
		
		
		
	}

}
