package PraWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizationPra {
	
	public static WebDriver driver;
	public static void getscreenshot() throws IOException {
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date d=new Date();
    System.out.println(d);
    String filename = d.toString().replace(" ", "_").replace(":", "_")+".png";
    File des = new File("C:\\Users\\Administrator\\Desktop\\Selenium\\ScreenShots\\Facebook\\"+filename);
    FileUtils.copyFile(src, des);
    System.out.println(filename);
    
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\Book1.xlsx\\");
		String user = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(user);
		
		FileInputStream file1= new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\Book1.xlsx\\");
		String pass = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(pass);
		
		WebElement Username = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		Username.sendKeys(user);
		
		WebElement Password = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		Password.sendKeys(pass);

		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		Thread.sleep(10000);
		getscreenshot();
		
	}
	
}
