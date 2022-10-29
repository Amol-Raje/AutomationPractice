package PraWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWebEle {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select s = new Select(country);
		
//		s.selectByIndex(5);
//		s.selectByValue("BARBADOS");
//		s.selectByVisibleText("INDIA");
		
		List<WebElement> cntr=s.getOptions();
		System.out.println("Total no of countrys: "+cntr.size());
		
		for(int i=0; i<cntr.size();i++) {
			
			String Allcntrys = cntr.get(i).getText();
			System.out.println(i+"-->"+Allcntrys);
		}
		
		String Defaultopt = s.getFirstSelectedOption().getText();
		System.out.println("Default Options: "+Defaultopt);
		
        if(s.isMultiple()) {
			
			System.out.println("Multi Element Selection");
			
		}else {
			System.out.println("Multiple Selection not prsent");
		}
		
		
		driver.close();
	}
	
}
