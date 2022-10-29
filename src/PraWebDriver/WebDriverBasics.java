package PraWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	public static void main(String[] args) {
		//To launch browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//To hit the URL--> using get()		
		
		driver.get("https://web.whatsapp.com/");
		//driver.get("https://www.epfindia.gov.in/site_en/index.php");
		
		//To close the browser -- close()
		
		//driver.close();
		//driver.quit();
		
		
	}

}
