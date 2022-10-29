package PraWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvLocatorsCSS {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//CSS (Cascadin Style Sheets);
		//a)Tag & Id:
//		driver.findElement(By.cssSelector("input#email")).sendKeys("9561550421");
//		driver.findElement(By.cssSelector("#email")).sendKeys("98755662225");
		
		//b)Tag & class:
//		driver.findElement(By.cssSelector("input.inputtext"));
		driver.findElement(By.cssSelector(".inputtext"));
		
		//c)Tag & attribute:
//		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("xyz");
//		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("Amol@");
//		driver.findElement(By.cssSelector("button[name=login]")).click();
		
		//d)Tag, Class & Attribute:
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Amol@1234");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Amol@1234");
		
		
		
	}
}
