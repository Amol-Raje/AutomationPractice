


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementPractice {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver =new ChromeDriver();
		
		//banking domain= PhonePe 
		
		//hit the URL:
		driver.get("https://phonepe.force.com/login?locale=us");
		
		//to verify exact url is available on browser:
		
//		String urlActual = driver.getCurrentUrl();
//		String urlExpected = "https://phonepe.force.com/login?locale=us";
		
//		if(urlActual.equalsIgnoreCase(urlExpected)) {
//			
//			System.out.println("URL is Verified");
//			
//		}else {
//			
//			System.out.println("Please check for current URL");
//			
//		}
		
		//WebElements:
		//1)sendKeys=To pass the data in the element.
		
		WebElement userid = driver.findElement(By.xpath("//input [@id='username']"));
		WebElement userpass= driver.findElement(By.xpath("//input [@id='password']"));
		 userid.sendKeys(JsUtils.FetchData(0));
		 userpass.sendKeys(JsUtils.FetchData(1));
		
//		userid.sendKeys("nko re");
//		userpass.sendKeys("pal re");
		
//		driver.findElement(By.xpath("//input [@id='username']")).sendKeys("9876543210");  //this is onather way to use send Key but its not a good practice for code maintainace.
		
		//2)click()= used to click a button tag into the web element 
		
//		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
//		login.click();
		
		//* To check WebElement Status
		//1)isEnabled()= it will check the nature of the element which is active/passive element
		
//		WebElement uname= driver.findElement(By.xpath("//input [@id='username']"));
//		System.out.println("Check the status of uname field is "+ uname.isEnabled());
		
		//we can validate web element :
		
//		if(uname.isEnabled()==true) {
//			
//			uname.sendKeys("ahm nahi");
//			
//		}else {
//			System.out.println("uname field is disabled");
//		}
//		
//		//2) isdisplayed()= that element displaying that text or not
//		
//		WebElement logo = driver.findElement(By.xpath("//img[@id='logo']"));
//		
//		if(logo.isDisplayed()==true) {
//			System.out.println("PhonePe logo is displayed");
//		}else {
//			System.out.println("PhonePe logo is not displayed");
//		}
		
		//3)isSelected()==> used with radio buttons and check box
		
//		WebElement rememberCheck = driver.findElement(By.xpath("//input[@id='rememberUn']"));
//		
//		if(rememberCheck.isSelected()==false) {
//			
//			System.out.println("option is selected");
//			rememberCheck.click();
//		}else {
//			
//			System.out.println("option is selected");
//		}
		
		//4)getText==> 
		
//		WebElement text = driver.findElement(By.xpath("//div[@id='footer']"));
//		System.out.println(text.getText());
//		
//		String ActualText = text.getText();
//		String ExpectedText = "© 2022 salesforce.com. All rights reserved.";
//		
//		if(ActualText.equals(ExpectedText)) {
//			 System.out.println("Test Case pass for sign up text verification");
//		 }else {
//			 System.out.println("Test Case fail for sign up text verification");
//		 }
//		
//		//5)getAttribute==>
//		
//		String attributehref = driver.findElement(By.xpath("//input[@id='Login']")).getAttribute("type");
//		System.out.println(attributehref);
		
       
     
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
