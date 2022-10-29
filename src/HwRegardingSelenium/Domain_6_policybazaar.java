package HwRegardingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Domain_6_policybazaar {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		// Health-care Domain - policybazaar 
		
		driver.get("https://www.policybazaar.com");
		
		// Regular Locators
				
		// 1.ID
		driver.findElement(By.id("regUser"));
				
		// 2.Name
		driver.findElement(By.name("loginsubmit"));
				
		// 3.ClassName
		driver.findElement(By.className("prd-links"));
				
		// 4.LinkText
		driver.findElement(By.linkText("Return of premium"));
				
		// 5.Partial Link Text ==> if link name is too long.
		driver.findElement(By.partialLinkText("Sanjeevani"));
				
		//6)tagName:
		//it will locate the tag of attribute;
				
		driver.findElements(By.tagName("a"));
		driver.findElement(By.tagName("input"));
				
		
	}

}
