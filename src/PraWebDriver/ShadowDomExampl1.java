package PraWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomExampl1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Books");  //By using basic xpath NoSuchElementException Error 
//		driver.findElement(By.cssSelector("input#input")).sendKeys("Books");   //By using css Selector NoSuchElementException Error
		
		
		
	}

}
