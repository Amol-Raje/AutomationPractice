import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement country = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		Select dropdown = new Select(country);
		List<WebElement> allopt = dropdown.getOptions();
		
		for(WebElement opt:allopt) {
			
			if(opt.getText().equals("India")) {
				opt.click();
				break;
			}
		}
		
		
	}

}
