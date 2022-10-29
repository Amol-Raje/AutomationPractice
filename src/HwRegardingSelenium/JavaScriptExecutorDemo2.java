package HwRegardingSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo2 {
	static WebDriver driver;
	static JavascriptExecutor js;  //Why not gettting result while declaring on class level?? 
	
	public static void main(String[] args) throws InterruptedException {
		
		//Set driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//hit the url
		driver.get("https://www.facebook.com/login/");
		
		//1)Drawing the border around the element;
		WebElement login = driver.findElement(By.xpath("//input[@id='email']"));
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", login);
		Thread.sleep(5000);
		
		//2)Capture the title of the web pge;
		js = (JavascriptExecutor)driver;
		String titlebyJS = js.executeScript("return document.title").toString();
		System.out.println("Title of login page of fb: "+titlebyJS);
		
		//3)Click on some element;
		WebElement loginbtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginbtn);
		
		//4)Generating an alert massage on a web page;
		js = (JavascriptExecutor)driver;
		js.executeScript("alert('"+"Welcome to fb"+"')");
		
		
		//5)Refreshing the webpage;
		js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("history.go(0)");
		
		//6)Scrolling of the webpage;
		//a)Scroll-down;
		js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,3000)");
		
		//b)Scroll-up;
		js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,1000)");
		Thread.sleep(5000);
		js.executeScript("scroll(0,-500)");
		
		//c)Scroll into view
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    WebElement corInfo = driver.findElement(By.xpath("//a[text()='Corporate Information']"));
	    js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", corInfo);
		corInfo.click();
		
	}

}
