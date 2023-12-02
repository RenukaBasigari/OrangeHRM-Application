package com.OsmaniaUniversity;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OsmaniaUniversitySelectLanguageScreenshots {
	 public static void main(String[] args) throws IOException {

		   WebDriver renuka;
		    String applicationUrlAddress="http://www.osmania.ac.in/";

		// Automating the Chrome Browser
		   System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		     renuka = new ChromeDriver();
renuka.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		            renuka.get(applicationUrlAddress);

		
		      By SelectLanguageDropDownProperty=By.id("gtranslate_selector");
		   WebElement selectLanguageDropDown=renuka.findElement(SelectLanguageDropDownProperty);
		   
		   //<select onchange="doGTranslate(this);" class="notranslate" id="gtranslate_selector" aria-label="Website Language Selector" align="right" style="position:relative; z-index:1000"><option value="">Select Language</option><option value="en|hi">Hindi</option><option value="en|fr">French</option><option value="en|de">German</option><option value="en|es">Spanish</option><option value="en|el">Greek</option><option value="en|en">English</option><option value="en|te">Telugu</option><option value="en|ml">Malayalam</option><option value="en|ur">Urdu</option><option value="en|nl">Dutch</option><option value="en|ar">Arabic</option><option value="en|zh-Hans">Chinese (Simplified)</option><option value="en|ru">Russian</option><option value="en|ta">Tamil</option><option value="en|sa">Sanskrit</option><option value="en|fa">Persian (Farsi)</option><option value="en|ne">Nepali</option><option value="en|mr">Marathi</option><option value="en|mn">Mangolian	</option><option value="en|la">Latin</option><option value="en|kn">Kannada</option><option value="en|ja">Japanese</option><option value="en|it">Italian	</option><option value="en|gu">Gujarati	</option><option value="en|hu">Hungarian</option><option value="en|id ,in">Indonesian</option><option value="en|ga">Irish	</option><option value="en|th">Thai</option></select>

		selectLanguageDropDown.click();
		
		//SelectLanguageSelection=new Select(selectLanguageDropDown);
		
		//go to Select Languagedropdown
	By	linkstagproperty=By.tagName("option");
	
	 List<WebElement>SelectLanguage=renuka.findElements(linkstagproperty);
	
	
		// List<WebElement>SelectLanguage=selectLanguageDropDown.findElements(SelectLanguageDropDownProperty);
	int	OsmaniaUniversitySelectLanguages =SelectLanguage.size();
	
	//getting the Names of SelectLanguge in Osmania University Application
	
	for(int index=1;index<OsmaniaUniversitySelectLanguages;index=index+1)
	{
		
	String 	SelectLangugeNames=SelectLanguage.get(index).getText();
	System.out.println(index+""+SelectLangugeNames);
	//SelectLanguage.get(OsmaniaUniversitySelectLanguages).click();
	
	}
//Click Operation on Select Language
	
	SelectLanguage.get(OsmaniaUniversitySelectLanguages).click();

		    


		 File OsmaniaUniversityLangugesScreenshot=((TakesScreenshot)renuka).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile( OsmaniaUniversityLangugesScreenshot, new File("./Screenshot/Laxmi.png"));





		}



}
