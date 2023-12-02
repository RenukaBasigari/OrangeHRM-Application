package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperation {
	
	public static void main(String[] args) throws IOException {
		
			FileInputStream testDataFile = new FileInputStream("./src/com/ExcelOperations/SingleTestData.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(testDataFile);
			
			XSSFSheet testDataSheet = workbook.getSheet("Sheet1");
			
			Row sheetofNewRowCreated =testDataSheet.createRow(5);
			
			Cell newRowofcellCreated=sheetofNewRowCreated.createCell(4);
			
			newRowofcellCreated.setCellValue("RenukaDevi");
			
			FileOutputStream testResultFile=new FileOutputStream("./src/com/ExcelOperations/SingleTestData.xlsx");
			
	            workbook.write(testResultFile);
	
	            
	            
	}		

	}
