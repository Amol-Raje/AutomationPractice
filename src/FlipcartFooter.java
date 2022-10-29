import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartFooter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		List <WebElement> Footer=driver.findElements(By.xpath("//div[@class='_2WErco row']/div/a"));
		
	    System.out.println(Footer.size());
	    
	    for(int i =0;i<Footer.size();i++) {
	    	
	    	WebElement footerlinks = Footer.get(i);
	    	 String FooterText = footerlinks.getText();
	    	 
	    	 System.out.println(FooterText);
	    	
	    }
	    
		
		
		
	}

}
