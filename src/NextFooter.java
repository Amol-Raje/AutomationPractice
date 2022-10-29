import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextFooter {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.next.co.uk/");
		
		//get multiple elementts;
		
		List<WebElement> footer=driver.findElements(By.xpath("//ul[@class='components__MainList-sc-1br2y2p-0 kWSAFv']/li/a"));
		System.out.println(footer.size());
		
		for(int i=0;i<footer.size();i++) {
			
			WebElement footerlinks = footer.get(i);
			String FooterText = footerlinks.getAttribute("data-testid");
			System.out.println(i+"=>"+FooterText);
		}
		
		
		
		
	}

}
