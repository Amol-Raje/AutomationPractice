import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwRegardingScreenShot {
	
	public static WebDriver driver;
	public static void getscreenshot() throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d= new Date();
		System.out.println(d);
		String filename = d.toString().replace(" ", "_").replace(":", "_")+".png";
		File dest = new File("C:\\Users\\Administrator\\Desktop\\Selenium\\ScreenShots\\Facebook_\\"+filename);
		FileUtils.copyFile(src, dest);
		System.out.println(filename);
	
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement SignIn = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		SignIn.sendKeys("9561550421");
		
		WebElement Pass= driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		Pass.sendKeys("Amol@123");
		
		WebElement LogIn= driver.findElement(By.xpath("//button[@name='login']"));
		LogIn.click();
		
		Thread.sleep(10000);
		
		getscreenshot();
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//		
//		Thread.sleep(5000);
//		getscreenshot();
//		
		driver.close();
		
	}
	}
