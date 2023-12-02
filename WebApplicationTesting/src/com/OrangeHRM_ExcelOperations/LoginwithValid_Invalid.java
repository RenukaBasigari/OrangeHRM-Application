package com.OrangeHRM_ExcelOperations;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginwithValid_Invalid {


public static void main(String[] args) throws IOException {




WebDriver renuka;

String applicationUrlAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");

renuka = new ChromeDriver();

renuka.get(applicationUrlAddress);

renuka.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


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

WebElement userName=renuka.findElement(userNameProperty);

userName.sendKeys(userNameTestData);



Row testDataRowpassword=testDataSheet.getRow(rowindex);


Cell testDataCellpassword=testDataRow.getCell(1);

String passwordTestData=testDataCellpassword.getStringCellValue();

// <input name="txtPassword" autocomplete="off" type="password">


By passwordProperty=By.name("txtPassword");
WebElement password=renuka.findElement(passwordProperty);
password.sendKeys(passwordTestData);



// <input type="submit"  class="button"  value="LOGIN">

            By loginButtonProperty=By.className("button");

            WebElement loginButton=renuka.findElement(loginButtonProperty);
               loginButton.click();




String expected_OrangeHRMApplicationHomePageText="Admin";
System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

try
{
// id="welcome" - Property of WelCome Admin Element
By welComeAdminProperty=By.id("welcome");
WebElement welComeAdmin=renuka.findElement(welComeAdminProperty);



String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);
   



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


welComeAdmin.click();

By logOutProperty=By.linkText("Logout");

WebElement logOut=renuka.findElement(logOutProperty);
logOut.click();
}
catch (Exception e)
{
// TODO: handle exception
}
}



renuka.quit();


}


}

