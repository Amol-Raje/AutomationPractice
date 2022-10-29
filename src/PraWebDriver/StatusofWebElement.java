package PraWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusofWebElement {
	
	public static void main(String[] args) {
		//Manage browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//hit the url;
		driver.get("https://demo.nopcommerce.com/register");
		
		//To check the status : a)isDesplayed():WebElement is displayed on website or not, it  returns the boolean value
		//                      b)isEnambed():WebElement is allowing to pass the value or not, it returns the boolean value
	
		WebElement searchstore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status: "+searchstore.isDisplayed());  //true
		System.out.println("Is enabled Status: "+searchstore.isEnabled()); //true
		
		//To check the by default selection of radio button, check boxes : isSelected();
		WebElement radioMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement radiofeMale = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(radioMale.isSelected() ); //its not selected -false
		System.out.println(radiofeMale.isSelected()); //false
		
		
		
		
		
		
		
		
		
		
	}

}
