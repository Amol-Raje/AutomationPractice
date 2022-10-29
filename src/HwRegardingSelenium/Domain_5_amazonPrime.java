package HwRegardingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domain_5_amazonPrime {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		// Entertainment Domain - Amazon Prime
		
        driver.get("https://www.primevideo.com/");
		
		// Regular Locators
		
		// 1.ID
		driver.findElement(By.id("pv-search-nav"));
		
		// 2.Name
		driver.findElement(By.name("phrase"));
		
		// 3.ClassName
		driver.findElement(By.className("pv-nav-search-query"));
		
		// 4.LinkText
		driver.findElement(By.linkText("Welcome to Prime Video"));
		
		// 5.Partial Link Text ==> if link name is too long.
		driver.findElement(By.partialLinkText("Prime Video"));
				
		//6.tagname
		
		driver.findElement(By.tagName("button"));      
		driver.findElements(By.tagName("a"));
		
	
		
	}

}
