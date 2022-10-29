package PraWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvLocatorsXPATH {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	//Absolute xpath:
//	WebElement userId = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
//	userId.sendKeys("Amol@gmail.com");
//	WebElement Pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"));
//	Pass.sendKeys("Amol@1234");
//	WebElement signIn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]"));
//	signIn.click();
	
	//Relative xpath options :
    // 1)Basic xpath;	
//	WebElement userId =driver.findElement(By.xpath("//input[@name='email']"));
//	userId.sendKeys("ADighe123@");
//	
//	WebElement Pass =driver.findElement(By.xpath("//input[@name='pass']"));
//	Pass.sendKeys("Amol@1234");
    
	// 2) using text();
	
//	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
//	driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
	
	// 3) contains();
	//tagname[contains(@ attribute,'value')]==> the value should not be full. shot form / part of attribute value.
    //When the web element contains dynamic attribute value then we should go to contains method
	//example:if web element can shows Start and End then id='start'..>id='stop'==> //input[contains(@id='st')]
	WebElement pass = driver.findElement(By.xpath("//input[contains(@aria-label,'word')]"));
	pass.sendKeys("Amol@123");
	
//	WebElement forgotpass = driver.findElement(By.xpath("//a[contains(@href, 'recover')]"));
//	forgotpass.click();
	
	//4)starts-with(); it also help to locate the dynamic webelement but the starting part of the web element
	
	WebElement phone = driver.findElement(By.xpath("//input[starts-with(@data-testid, 'royal')]"));
	phone.sendKeys("9568878894");
	
	//5)chained xpath; xpath folowed by another xpath
	
	WebElement login= driver.findElement(By.xpath("//div[@class='_6ltg']//button[@type='submit']"));
	login.click();
	
	//6)Logical operators; and , or	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}
}
