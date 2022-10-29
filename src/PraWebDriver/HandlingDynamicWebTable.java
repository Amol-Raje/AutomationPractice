package PraWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebTable {
	public static void main(String[] args) {
		
		//Initiate the chrome browser;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Hit the url;
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//To get total no. of row;	
		int row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println(row);
		
		//To get total no. col;
		int col=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println(col);
		
		//to fetch value from the column;
		for(int r=1;r<=row;r++) {
			for(int c=1;c<=col;c++) {
				
				String value = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+"--");
			}
			System.out.println();
		}
		driver.close();
	}
}
