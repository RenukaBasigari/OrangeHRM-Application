package ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {
	
	public static void main(String[]args) throws IOException {
		
		//
		
		
		FileInputStream testdataFile = new FileInputStream("./src/com/ExcelOperations/SingleTestData.xlsx");
	
		XSSFWorkbook workbook = new XSSFWorkbook(testdataFile);
		
		XSSFSheet testDataSheet =workbook.getSheet("Sheet1");
	
		Row testDataRow=testDataSheet.getRow(0);
		
		
		Cell testDataRowOfCell=testDataRow.getCell(0);
		
		String testData=testDataRowOfCell.getStringCellValue();
		
		System.out.println(testData);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
