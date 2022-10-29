package HwRegardingSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PraWebDriver.UtilityFiles;

public class CheckTheMethods {
	public static void main(String[] args) throws IOException, InterruptedException {
		//Set Chrome browser;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//1)get screen shot;
//		UtilityFiles.GetFullScreen(driver);
		
		//2)fetch data
		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		userid.sendKeys(UtilityFiles.Fetch("Sheet1", 0, 0));
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(UtilityFiles.Fetch("Sheet1", 1, 0));
//		UtilityFiles.GetElementScreenshot(driver, userid );
//		UtilityFiles.GetElementScreenshot(driver, pass);
		
		//3)Border by Js
//		UtilityFiles.BorderByJs(driver, userid);
//		Thread.sleep(5000);
//		UtilityFiles.GetElementScreenshot(driver, userid);
		
		//4)Click by js 
		WebElement loginbtn = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		UtilityFiles.ClickByJs(driver, loginbtn);
		
		//5)Tiltle by js;
		System.out.println(UtilityFiles.TitleByJs(driver));
		
		//6)Alert by js;
		UtilityFiles.AlertByJs(driver, "Welcome to facebook");
		
		//7)Scrollup by js;
//		UtilityFiles.ScrollingByJs(driver, 0, 800);
		
		//8)Scroll into view;
//		UtilityFiles.ScrollIntoView(driver, loginbtn)
		
		Thread.sleep(10000);
		
		driver.close();
		
	}

}
