package PraWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import HwRegardingSelenium.ExcelData;

public class ChildDivisionPopup {
	static Set<String> window;
	static Iterator<String> itr;
	static FileInputStream file;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

//		//setup browser;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		//Hit the Facebook log in URL;
//		driver.get("https://www.facebook.com/");
//		
//		//First Window
//		window = driver.getWindowHandles();  //returns the id of that window which is unique for each page
//		itr = window.iterator();  //iterates the page 
//		String firstwind = itr.next();
//		System.out.println(firstwind);
		
		//Second Window
//		driver.findElement(By.xpath("//a[text()='Facebook Pay']")).click();
//		window = driver.getWindowHandles();
//		itr = window.iterator();
//		itr.next();  //first window
//		String secondwind = itr.next(); 
//		System.out.println(secondwind);
//		
//		//switch selenium focus to second window
//		driver.switchTo().window(secondwind);
//		driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
//		
//		//Third Window;
//		window = driver.getWindowHandles();
//		itr = window.iterator();
//		itr.next();  //first window
//		itr.next();  //second window
//		String thirdwind = itr.next();
//		System.out.println(thirdwind);
//		
//		//Switch selenium focus to third window
//		driver.switchTo().window(thirdwind);
//		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
//		
//		//Switch to first window
//		driver.switchTo().window(firstwind);
//		
//		//Log In to FaceBook;
//		file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\Book1.xlsx");
//		String uname = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\Book1.xlsx");
//		String pass = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		ExcelData.ExcelFB();
		String mob = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String pass = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement Login = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys(mob);
		password.sendKeys(pass);
		Login.click();
		driver.findElement(By.xpath("//div[@class='om3e55n1 alzwoclg']")).click();
		driver.findElement(By.xpath("//html//body//div//div[1]//div[2]//div")).click();
		
		//TO close all open tabs;
//		driver.quit();
	}
}
