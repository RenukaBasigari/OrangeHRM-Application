package Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderBlock_Click {
	
	public static void main(String[]args) {
		
System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		

		ChromeDriver  renuka = new ChromeDriver();
		
		renuka.get("http://tsrtconline.com");
		
		
		//Identify  Headerblock of the WebPage
		//
		
		// <div class="menu-wrap">
		
		
		By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		
		WebElement tsrtc_HeaderBlock=renuka.findElement(tsrtc_HeaderBlockProperty);
		
		
		//Identify Properties of the Elements of the Headerblock 
		
		
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		//Home</a>
		//<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		
		renuka.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By headerBlockLinksProperty=By.tagName("a");
		
		List<WebElement>tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(headerBlockLinksProperty);
		
		//identifying the number of elements stored in the ArrayList(tsrtc_HeaderBlockLinks)
		
		int tsrtc_HeaderBlockLinks_Count=tsrtc_HeaderBlockLinks.size();
		
		System.out.println("The Number of Links in the Header Block of TSRTC Aplication are-" +tsrtc_HeaderBlockLinks_Count);
		
		//getting the names of HeaderBlockElements
		
		for(int linksindex=0;linksindex<tsrtc_HeaderBlockLinks_Count;linksindex=linksindex+1)
		{
			String tsrtc_HeaderBlockLinkName=tsrtc_HeaderBlockLinks.get(linksindex).getText();
			
			System.out.println(linksindex +  tsrtc_HeaderBlockLinkName);
			
			//Performing click Operation on the elements of Headerblock
			tsrtc_HeaderBlockLinks.get(linksindex).click();
			 String actual_Linkpagetitle=renuka.getTitle();
			String  actual_LinkpageCurrentUrlAddress=renuka.getCurrentUrl();
			
			System.out.println(actual_Linkpagetitle);
			System.out.println(actual_LinkpageCurrentUrlAddress);
			
		if(actual_LinkpageCurrentUrlAddress.equals(actual_LinkpageCurrentUrlAddress))
			{
				System.out.println("Url Address Matched-Sucessfully Navigated to Expected Link Webpage-PASS");
			}
	else
	{
				System.out.println("Url Address NOT Matched-Failed to Navigated to Expected Link Webpage-FAIL");
			}
			tsrtc_HeaderBlock=renuka.findElement(tsrtc_HeaderBlockProperty);
			tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(headerBlockLinksProperty);
			
			
		}
	
		}
		
}
	



	


