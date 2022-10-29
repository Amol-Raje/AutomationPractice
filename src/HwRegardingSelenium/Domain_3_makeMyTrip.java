package HwRegardingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domain_3_makeMyTrip {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// Travel Domain - Make My Trip
		
//        driver.get("https://www.makemytrip.com/");
		driver.navigate().to("https://www.makemytrip.com/");
		driver.navigate().forward();
		
	
		
		
		
		
		// Regular Locators
		
		// 1.ID
//		driver.findElement(By.id("username"));
		
		// 2.Name
//		driver.findElement(By.name("username"));
////		
//		// 3.ClassName
//		driver.findElement(By.className("font14 fullWidth"));
//		
//		// 4.Tagname
//		driver.findElement(By.tagName("button"));
//		
//		// 5.LinkText
//		driver.findElement(By.linkText("Login for great deals and offers"));
//		
//		// 6.Partial Link Text ==> if link name is too long.
//		driver.findElement(By.partialLinkText("great deals and offers"));
				
		
		
		
		
		
	}

}
