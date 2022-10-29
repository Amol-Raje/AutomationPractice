package PraWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic1 {
	public static void main(String[] args) {
		// to launch browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		//How to hit the URL ==> get()
		
		driver.get("https://www.epfindia.gov.in/site_en/index.php");
		
		//How to close the browser==> close()		
		//driver.close();  //used to close the single tab
		
		driver.quit();  //used to close all tabs at a time 
		
		//how to get the url from the current browser
		
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		
		
		
		
		
		
	}

}
