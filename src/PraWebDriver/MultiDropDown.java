package PraWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jsbin.com/osebed/2 ");
		driver.manage().window().maximize();
		
		WebElement multi = driver.findElement(By.xpath("//select[@ id='fruits']"));
		
		Select s = new Select(multi);
		
		s.selectByIndex(2);
		s.selectByVisibleText("Grape");
		s.selectByValue("banana");
		
		//To ensure multi element Selection in dropDown 
		if(s.isMultiple()) {
			
			System.out.println("Multi Element Selection");
			
		}else {
			System.out.println("Multiple Selection not prsent");
		}
		
	}
}
