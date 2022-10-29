import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//set the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//hit the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		//1)Border around the webelement 
//		driver.switchTo().frame("iframeResult");
//		WebElement tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;  //casting javaScript into driver
//		js.executeScript("arguments[0].style.border='3px solid red'", tryitbtn);  //when we have to take action on webelement then we have to give two arguments for web element 
//		JsUtils.BorderByJs(driver, tryitbtn);
//		Thread.sleep(50000);
		JsUtils.GetScreenShot(driver);
		
		//2)capture the title of the webpage
//		JavascriptExecutor js=(JavascriptExecutor)driver;  //Typecasting javaScript into driver
//		String Title = js.executeScript("return document.title").toString();
//		System.out.println(Title);
		
		//3)Click on element;
//		driver.switchTo().frame("iframeResult");
//		WebElement tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", tryitbtn );
		
		//4)Generate an alert
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("alert('Welcome Amol');");
		
		//5)Refresh the page;
//		Thread.sleep(5000);
//		js.executeScript("history.go(0)");
		
		//6)Scrolling of the webpage;
		//a)Scroll down
//		driver.get("https://www.w3schools.com/java/#gsc.tab=0");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("scroll(0, 1000)");
		
		//b)Scroll up
//		js.executeScript("scroll(0, 1000)");
//		Thread.sleep(5000);
//		js.executeScript("scroll(0,-500)");
		
		//c)Scroll into view;
		//when web page length is too large and complex web elements are present inside the webpage then it will take wxtra time to load 
		//to over come this issue we use scroll into veiw which gets an scrolling upto that element after that locator will adress that element
//		driver.get("https://www.w3schools.com/java/#gsc.tab=0");
//		WebElement sql = driver.findElement(By.xpath("//a[text()='SQL Tutorial']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",sql );
//		sql.click();
	
	}
	
}
