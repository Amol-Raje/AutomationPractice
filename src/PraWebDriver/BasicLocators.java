package PraWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//e-Commerce Domain: amazon 
		
		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();  //to maximize the web page
		
		//RegularLocators:
		
		//1)id-
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirts");  //Search box
//		driver.findElement(By.id("nav-search-submit-button")).click();  //
//		driver.findElement(By.id("searchDropdownBox")).click();  //Dropdown button
		
		//2)name-
		
//		driver.findElement(By.name("Jockey Men's Cotton T-Shirt")).click(); 
//		driver.findElement(By.name("pass"));  //password  
//		driver.findElement(By.name("login")); //log in button
		
		//3)linkedText
		
//		driver.findElement(By.linkText("Jockey Men's Cotton T-Shirt")).click();  //link with full text.
		
		//4)PartialLinkedText
		
//		driver.findElement(By.partialLinkText("Neck Half Sleev…")).click();  //partial link text.
		
		//5)className 
		//if u have to find slides present inside that page use findElements method for more than one attributes.
		
//		int sliders = driver.findElements(By.className("a-icon a-icon-next-rounded")).size();
//		System.out.println(sliders);
		
		//6)tagName:
		//it will locatr the tag of attribute;
		//total links present into the web page
		
//	    int links = driver.findElements(By.tagName("a")).size();
//		System.out.println(links);
		
		//total inputes present into the web page 
		
		int inputvalue = driver.findElements(By.tagName("input")).size();
		System.out.println(inputvalue);
		
		
		
	}
	
	
	
}
