package com.TestNG_OHRMvalid_Invalid;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Log;



public class OHRM_ValidInValidLogin extends BaseTest2{
	
	@Test
	public void ORMvalidinvalidlogin() throws IOException
	{
		

		FileInputStream testDataFile = new FileInputStream("./src/com/Login_Valid_Invalid/test.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(testDataFile);

		XSSFSheet testDataSheet =workbook.getSheet("Sheet1");


		for(int rowindex=1;rowindex<=4;rowindex++)
		{

		Row testDataRow=testDataSheet.getRow(rowindex);


		Cell testDataCell=testDataRow.getCell(0);

		String userNameTestData=testDataCell.getStringCellValue();

		// <input name="txtUsername" id="txtUsername" type="text">

		By userNameProperty=By.id("txtUsername");

		WebElement userName=driver.findElement(userNameProperty);

		userName.sendKeys(userNameTestData);

      Log.info("The user name test data is successfull");

		Row testDataRowpassword=testDataSheet.getRow(rowindex);


		Cell testDataCellpassword=testDataRow.getCell(1);

		String passwordTestData=testDataCellpassword.getStringCellValue();

		// <input name="txtPassword" autocomplete="off" type="password">


		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		//Log.info("The Password TestData is Successfull");


		// <input type="submit"  class="button"  value="LOGIN">

		By loginButtonProperty=By.className("button");

		WebElement loginButton=driver.findElement(loginButtonProperty);
		loginButton.click();




		String expected_OrangeHRMApplicationHomePageText="Admin";
		
		System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);
   Log.info("The Expected Text of OrangeHRM Application HomePage is:-"+expected_OrangeHRMApplicationHomePageText);
		try
		{
		// id="welcome" - Property of WelCome Admin Element
		By welComeAdminProperty=By.id("welcome");
		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		welComeAdmin.click();



		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);
		   
    Log.info("The actual text of orangeHRM Application Home Page is:-"+actual_OrangeHRMApplicationHomePageText);


		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		System.out.println(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
		Cell testDataCellResult=testDataRow.createCell(2);

		testDataCellResult.setCellValue(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");


		}
		else
		{
		System.out.println(" Failed to Navigat to OrangeHRM Application HomePage - FAIL");

		Cell logInTestResultRowOfCell=testDataRow.createCell(2);
		logInTestResultRowOfCell.setCellValue("Failed to Navigat to OrangeHRM Application HomePage - FAIL");

		}

		FileOutputStream testdataresult=new FileOutputStream("./src/com/Login_Valid_Invalid/test.xlsx");

		workbook.write(testdataresult);


		/////welComeAdmin.click();

		By logOutProperty=By.linkText("Logout");

		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();
		}
		catch (Exception e)
		{
		// TODO: handle exception
		}
		}

}
}