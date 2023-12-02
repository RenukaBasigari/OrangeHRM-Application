package com.OrangeHRMSignInTest;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class OHRM_AddEmployee {
		
		public static void main(String[]arg) {
			
			System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
			
			
			ChromeDriver renuka=new ChromeDriver();
			
			//Here we are Using Implicit wait
			//It is a smart wait
			//Intelligent wait
			
			
			renuka.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			renuka.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
			
			//<input name="txtUsername" id="txtUsername" type="text">
			
			By userNameProperty=By.id("txtUsername");
		
			WebElement userName=renuka.findElement(userNameProperty);
			
			
			userName.sendKeys("Renuka");
			
			//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
			
			By passwordProperty=By.id("txtPassword");
			WebElement password=renuka.findElement(passwordProperty);
			
			password.sendKeys("Renuka@123");
			
			
			
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			By loginProperty=By.id("btnLogin");
			WebElement login=renuka.findElement(loginProperty);
			login.click();

			String expectedWelcomeAdminLinkText="Admin";
			System.out.println("The Expected Name of WelcomeAdmin Text is ="+expectedWelcomeAdminLinkText);
			
			//<b>PIM</b>
			By PIMProperty=By.linkText("PIM");
			
			WebElement PIMLink=renuka.findElement(PIMProperty);
			
		PIMLink.click();
			
		//	String actualWelComeAdminText=welcomeadminlink.getText();
			
		//	System.out.println("The Actual Name of WelcomeAdmin Text is ="+actualWelComeAdminText);
			
			
			//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
			//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		
		By AddEmployeeProperty=By.id("menu_pim_addEmployee");
		WebElement AddEmployeeLink=renuka.findElement(AddEmployeeProperty);
		AddEmployeeLink.click();
	     
	     //Add- AddEmployeeLink FirstName
	     //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	     By FirstNameProperty=By.id("firstName");
			WebElement FirstName=renuka.findElement(FirstNameProperty);
			FirstName.sendKeys("Renuka");
			
			
			//Add-AddEmployee Link MiddleName
			//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
			 By MiddleNameProperty=By.id("middleName");
				WebElement MiddleName=renuka.findElement(MiddleNameProperty);
				MiddleName.sendKeys("Devi");
				
				//Add-AddEmployee Link LastName
				//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
				
				By LastNameProperty=By.id("lastName");
				WebElement LastName=renuka.findElement(LastNameProperty);
			LastName.sendKeys("Basigari");
			
				//Click on SaveButton
				//<input type="button" class="" id="btnSave" value="Save">
				
         By SaveButtonClickProperty=By.id("btnSave");
	WebElement SaveButton=renuka.findElement(SaveButtonClickProperty);
				SaveButton.click();
				
				renuka.navigate().back();
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
				
				
				By welcomeAdminProperty=By.linkText("Welcome Admin");
				
				WebElement welcomeadminlink=renuka.findElement(welcomeAdminProperty);
				
				welcomeadminlink.click();
				
				String actualWelComeAdminText=welcomeadminlink.getText();
				
				System.out.println("The Actual Name of WelcomeAdmin Text is ="+actualWelComeAdminText);
				
				if(actualWelComeAdminText.contains(expectedWelcomeAdminLinkText))
				{
					System.out.println("The Expected WelcomeAdmin text Contain in ActualWelcomeAdmin Text = Pass");
				}
				else
				{
					System.out.println("The Expected WeccomeAdmin text does NOT Contain in ActualWelcomeAdmin Text = Fail");
				}
				
				
				//<li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>
				
				
				//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
				
			//	By logoutProperty=By.linkText("Logout");
			//	WebElement logout=renuka.findElement(logoutProperty);
				//logout.click();
				
				By logoutProperty=By.linkText("Logout");
			WebElement logout=renuka.findElement(logoutProperty);
				logout.click();
				
				
				
		}
}
