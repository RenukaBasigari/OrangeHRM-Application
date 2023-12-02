package Arrays;


import java.util.List;

import org.apache.poi.poifs.storage.HeaderBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TSRTCHomePageLinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Desktop\\web Application Testing\\WebApplicationTesting\\browserFiles\\chromedriver.exe");
		

		ChromeDriver  renuka = new ChromeDriver();
		
		renuka.get("http://tsrtconline.com");
		
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		//Locater=title
		//Selector=Enquiry
		
    // By enquiryProperty=By.linkText("Enquiry");
	//   WebElement enquiry=renuka.findElement(enquiryProperty);
	//enquiry.click();
	
	//To Find the Number of Links in the Current Webpage
	
	//<a class="tabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
	//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>	
	//<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>	
	//<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
	//The Common Property of group of Similar Type of elements-Links is anchor tag("a")
	
	By HomePageLinksCommonProperty=By.tagName("a");
	
	List<WebElement>HomePageLinks=renuka.findElements(HomePageLinksCommonProperty);
	
	int tsrtc_HomepageLinksCount =HomePageLinks.size();
	
	System.out.println("The number of Links on the TSRTC Application HomePage are-"+tsrtc_HomepageLinksCount);
	
	
	
	//getting all names of the Links in Current HomePage
	
	for(int linksindex=0;linksindex<tsrtc_HomepageLinksCount;linksindex=linksindex+1)
		
	{
		String tsrtc_HomePageLinksText=HomePageLinks.get(linksindex).getText();
		
		System.out.println(linksindex+""+"-"+tsrtc_HomePageLinksText);
	}




	}
	

}
