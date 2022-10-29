import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownButton {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Signup.click();
		Thread.sleep(2000);
		// identify the listbox which needs to be handled.
//		WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		// create the object of select class and pass  the respective element
//		Select s = new Select(birthday);
		
		// To  handle the values use any method.
		// s.selectByIndex(index);   //0==> n-1
		//s.selectByValue(arg0);     // string
		//s.selectByVisibleText(arg0);  // string
		
		//s.selectByIndex(18);
		//s.selectByValue("19");
//		s.selectByVisibleText("19");
		// get all the elements available in dropdown menu.
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s = new Select (year);
		List<WebElement> years=s.getOptions();
		
		System.out.println("Total years in the list: "+years.size());
		
		for(int i=0;i<years.size();i++) {
			String yrs = years.get(i).getText();
			System.out.println(i+"-->"+yrs);
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
