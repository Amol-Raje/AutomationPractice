package HwRegardingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domain_4_FB {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//Social media domain-FB
		
		driver.get("https://www.facebook.com/");
		
		//Regular Locators
		
		//1. id
		
		driver.findElement(By.id("email"));   
		driver.findElement(By.id("pass"));    
		
		//2. name
		
		driver.findElement(By.name("email"));  // username 
		driver.findElement(By.name("pass"));   // password
		
		//3. linked text.
		
		driver.findElement(By.linkText("Forgotten password?")); 
		
		//4. partial link text.  
		
		driver.findElement(By.partialLinkText("password?"));    
		
		// 5. classname.
		
		driver.findElement(By.className("inputtext _55r1 _6luy"));   
		driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));  
		
		//6.tagname
		
		driver.findElement(By.tagName("button"));      
		driver.findElements(By.tagName("a"));          
	
		
	}

}
