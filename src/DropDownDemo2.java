import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement dropCountry = driver.findElement(By.xpath("//select[@id='input-country']"));
		
		Select s = new Select(dropCountry);
		
//		s.selectByVisibleText("Australia");
//		s.selectByValue("12");
//		s.selectByValue("99");
//		s.selectByIndex(5);
	
		
		//Selecting options from drop down without using methods 
		
		List<WebElement> allctry=s.getOptions();
		
		for(WebElement option:allctry) {
			
			if(option.getText().equals("India")) {
				option.click();
				break;
			}	
		}
		
		
		
		
		
		
	}
	

}
