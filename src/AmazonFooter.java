import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooter {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement>footerLinks=driver.findElements(By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']/div/div/ul/li/a"));
		
		System.out.println(footerLinks.size());
		
		for(int i=0;i<footerLinks.size();i++) {
			
		WebElement footerlink = footerLinks.get(i);	
		String Ftext = footerlink.getText();
		System.out.println(i+"=>"+Ftext);	
		}
		
		
		
	}

}
