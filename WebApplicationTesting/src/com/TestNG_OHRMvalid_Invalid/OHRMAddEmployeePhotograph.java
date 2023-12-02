package com.TestNG_OHRMvalid_Invalid;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OHRMAddEmployeePhotograph  extends BaseTest2{
	
	@Test(priority = 1)
	public void Login() throws IOException
	{
		
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		By userNameProperty=By.id("txtUsername");
	
		WebElement userName=driver.findElement(userNameProperty);
		
		
		userName.sendKeys("Renuka");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		By passwordProperty=By.id("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		
		password.sendKeys("Renuka@123");
		
		
		
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By loginProperty=By.id("btnLogin");
		WebElement login=driver.findElement(loginProperty);
		login.click();

		String expectedWelcomeAdminLinkText="Admin";
		System.out.println("The Expected Name of WelcomeAdmin Text is ="+expectedWelcomeAdminLinkText);
	}

	@Test(priority = 2)
		public void PIM() throws IOException
		{
		//<b>PIM</b>
		By PIMProperty=By.linkText("PIM");
		
		WebElement PIMLink=driver.findElement(PIMProperty);
		
	PIMLink.click();
		}
		
      @Test(priority = 3)
      public void AddEmployee() throws IOException, InterruptedException
      {
	//FileInputStream testDataFile = new FileInputStream("./src/com/ExcelOperations/test.xlsx");

	//XSSFWorkbook workbook = new XSSFWorkbook(testDataFile);

	//XSSFSheet testData =workbook.getSheet("Sheet2");


	//for(int rowindex=1;rowindex<=4;rowindex++)
	//{

	//Row testDataRow=testData.getRow(rowindex);
     try
     {

	//Cell testDataCell=testDataRow.getCell(0);

	//String userNameTestData=testDataCell.getStringCellValue();

     
	
    By AddEmployeeProperty=By.id("menu_pim_addEmployee");
    WebElement AddEmployeeLink=driver.findElement(AddEmployeeProperty);
	AddEmployeeLink.click();
	
	
    	     //Add- AddEmployeeLink FirstName
    	     //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	
    	     By FirstNameProperty=By.id("firstName");
    			WebElement FirstName=driver.findElement(FirstNameProperty);
    			FirstName.sendKeys("Renuka");
    			
    			//Actions Class-is used to perform operations related to both Mouse and KeyBoard
    			//Performing the "TAB" Operation
    			
    			//Actions keyBoardActions=new Actions(driver);
    			//keyBoardActions.sendKeys(Keys.TAB).build().perform();
    			
    			//keyBoardActions.sendKeys(Keys.TAB).build().perform();
    			//Add-AddEmployee Link MiddleName
    			//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
    			 By MiddleNameProperty=By.id("middleName");
    				WebElement MiddleName=driver.findElement(MiddleNameProperty);
    				MiddleName.sendKeys("Devi");
    				
    				//Add-AddEmployee Link LastName
    				//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
    				
    				By LastNameProperty=By.id("lastName");
    				WebElement LastName=driver.findElement(LastNameProperty);
    			     LastName.sendKeys("Basigari");
    			     
    			   Actions keyBoardActions=new Actions(driver);
    	    			keyBoardActions.sendKeys(Keys.TAB).build().perform();
    	    			
    	    			//keyBoardActions.sendKeys(Keys.TAB).build().perform();
    	    			
    	    			keyBoardActions.sendKeys(Keys.TAB).build().perform();
    	    			keyBoardActions.sendKeys(Keys.ENTER).build().perform();
    	    			
    	    			
    	    			
    	 java.lang.Runtime.getRuntime().exec("C:\\Users\\Mahesh\\Desktop\\web Application Testing\\WebApplicationTesting\\src\\AutoitScript\\AutoScript123.au3");
     //Click on SaveButton
		//<input type="button" class="" id="btnSave" value="Save">
		
     By SaveButtonClickProperty=By.id("btnSave");
    WebElement SaveButton=driver.findElement(SaveButtonClickProperty);
		SaveButton.click();
     }
 	    			
    	    			
    	    			catch (Exception e) {
							// TODO: handle exception
						}
  
    	    			
    			
    			
    			
    			
    			
    			
    			
    			
	
	
	
}



      }

