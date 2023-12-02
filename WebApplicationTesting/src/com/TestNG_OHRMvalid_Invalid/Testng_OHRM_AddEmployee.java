package com.TestNG_OHRMvalid_Invalid;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testng_OHRM_AddEmployee extends BaseTest2 {
	
	@Test(priority = 1)
	public void AddEmployee() throws IOException
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
		
	//	String actualWelComeAdminText=welcomeadminlink.getText();
		
	//	System.out.println("The Actual Name of WelcomeAdmin Text is ="+actualWelComeAdminText);
		
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	
	By AddEmployeeProperty=By.id("menu_pim_addEmployee");
	WebElement AddEmployeeLink=driver.findElement(AddEmployeeProperty);
	AddEmployeeLink.click();
	
	FileInputStream testDataFile = new FileInputStream("./src/com/ExcelOperations/test.xlsx");

	XSSFWorkbook workbook = new XSSFWorkbook(testDataFile);

	XSSFSheet testData =workbook.getSheet("Sheet2");


	for(int rowindex=1;rowindex<=4;rowindex++)
	{

	Row testDataRow=testData.getRow(rowindex);


	Cell testDataCell=testDataRow.getCell(0);

	String userNameTestData=testDataCell.getStringCellValue();

     
     //Add- AddEmployeeLink FirstName
     //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	
        By FirstNameProperty=By.id("firstName");
		WebElement FirstName=driver.findElement(FirstNameProperty);
		FirstName.sendKeys("Renuka");
		
		
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
		    
		
		 FileOutputStream testdataresult=new FileOutputStream("./src/com/ExcelOperations/test.xlsx");
	      workbook.write(testdataresult);
		
		//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0022" id="employeeId">
	    By	EmpidProperty=By.id("employeeId");
     WebElement	EMPid=driver.findElement(EmpidProperty);
     String expected_applicationEmpid=EMPid.getAttribute("value");
     System.out.println("The Expected Employeeid is -" +expected_applicationEmpid);
     
     
    // FileOutputStream testdataresult=new FileOutputStream("./src/com/ExcelOperations/test.xlsx");
    //  workbook.write(testdataresult);
	
		
			//Click on SaveButton
			//<input type="button" class="" id="btnSave" value="Save">
			
     By SaveButtonClickProperty=By.id("btnSave");
WebElement SaveButton=driver.findElement(SaveButtonClickProperty);
			SaveButton.click();
			
			driver.navigate().back();
	//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		//	FileOutputStream testdataresult=new FileOutputStream("./src/com/ExcelOperations/test.xlsx");

		//	workbook.write(testdataresult);
	}
	}
	@Test(priority = 3)
	public void WelcomeAdmin()
	{

	try
	{
	
	By welcomeAdminProperty=By.linkText("Welcome Admin");
	
	WebElement welcomeadminlink=driver.findElement(welcomeAdminProperty);
	
	welcomeadminlink.click();
	
	String actualWelComeAdminText=welcomeadminlink.getText();
	
	System.out.println("The Actual Name of WelcomeAdmin Text is ="+actualWelComeAdminText);
	
	if(actualWelComeAdminText.contains(actualWelComeAdminText))
	{
		System.out.println("The Expected WelcomeAdmin text Contain in ActualWelcomeAdmin Text = Pass");
	}
	else
	{
		System.out.println("The Expected WelcomeAdmin text does NOT Contain in ActualWelcomeAdmin Text = Fail");
	}
	
	
	//<li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>
	
	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	
//	By logoutProperty=By.linkText("Logout");
//	WebElement logout=renuka.findElement(logoutProperty);
	//logout.click();
	
	By logoutProperty=By.linkText("Logout");
     WebElement logout=driver.findElement(logoutProperty);
	logout.click();
	
	
		
	
}
	catch (Exception e)
	{
	// TODO: handle exception


}

}


			
	}

	


