package com.TestNG_OHRMvalid_Invalid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Employee_List extends BaseTest2 {
	@Test(priority = 1)
	public void Login()
	{
		//UserNameProperty
		By userNameProperty=By.id("txtUsername");

		WebElement userName=driver.findElement(userNameProperty);

		userName.sendKeys("Renuka");
		
		//PasswordProperty
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys("Renuka@123");
		
		//LoginProperty
		 By loginButtonProperty=By.className("button");

         WebElement loginButton=driver.findElement(loginButtonProperty);
            loginButton.click();

	}
	@Test(priority = 2)
	public void PIM()
	{
		
		//<b>PIM</b>
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
				By PIMProperty=By.linkText("PIM");
	//By	PIMProperty=By.id("menu_pim_viewPimModule");
				
				WebElement PIMLink=driver.findElement(PIMProperty);
				
			PIMLink.click();
		
		//Employee-List
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>
		By EmployeeListProperty=By.id("menu_pim_viewEmployeeList");
	WebElement	EmpList=driver.findElement(EmployeeListProperty);
	EmpList.click();
	
	
	///html/body/div[1]/div[3]/div[2]/div/form
	
	
	By WebTableProperty=By.xpath("html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody");
	WebElement  WebTable=driver.findElement(WebTableProperty);
	By	rowProperty=By.tagName("tr");
	
	      List<WebElement>rows=WebTable.findElements(rowProperty);
	      
	      for(int rowindex=0;rowindex<rows.size();rowindex++)
	      {
	 WebElement   webTableRow= rows.get(rowindex);
	 
	By rowofCellProperty= By.tagName("td");
	 List <WebElement >rowofCells =WebTable.findElements(rowofCellProperty);
	 
	 
	 for(int rowofCellindex=0;rowofCellindex<rowofCells.size();rowofCellindex++)
	 {
	WebElement rowofCell =rowofCells.get(rowofCellindex);
	
	String data=rowofCell.getText();
	System.out.println(data+ " | ");
	System.out.println();
	

	 }
	 //WelcomeAdmin
	// id="welcome" - Property of WelCome Admin Element
			By welComeAdminProperty=By.id("welcome");
			WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
			welComeAdmin.click();
    //LogOut
			By logOutProperty=By.linkText("Logout");

			WebElement logOut=driver.findElement(logOutProperty);
			logOut.click();
	 

	
	
	      }
		
	}



		

		

		
		
	
	
      
	

    		   
                               




}

