package ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice2 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream testDatafile=new FileInputStream("./src/com/ExcelOperations/SingleTestData.xlsx");
		
		XSSFWorkbook Workbook=new XSSFWorkbook(testDatafile);
		
		XSSFSheet testDataSheet=Workbook.getSheet("Sheet2");
		
		Row testDataSheetRow=testDataSheet.getRow(3);
		
		
		Cell testDataSheetofcell=testDataSheetRow.getCell(1);
		
	
		String testData=testDataSheetofcell.getStringCellValue();
		
		System.out.println(testData);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

