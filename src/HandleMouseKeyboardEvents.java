import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseKeyboardEvents {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//1)Hover on the element;
//		driver.get("https://www.next.co.uk/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		//close hiddenDivision popup 
//		WebElement closepopup = driver.findElement(By.xpath("//button[@aria-label='Close']"));
//		closepopup.click();
//		
//		//capture all header elements
//		List<WebElement> links = driver.findElements(By.xpath("//ul[@id='snail-trail-container']/li/a"));
//		for(int i=0;i<10;i++) {
//			WebElement link = links.get(i);
//			Actions action=new Actions(driver);
//			action.moveToElement(link);
//			action.build().perform();
//			System.out.println(link.getText());
//			Thread.sleep(5000);
//		}
		
		//2) How to handle resizable items
//		driver.get("https://jqueryui.com/resizable/");	
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//		Actions action=new Actions(driver);
//		action.dragAndDropBy(resize, 80, 90).build().perform();
		
		//3)Drop and drag 
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement Draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement Droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
//		Thread.sleep(5000);
//		
//		Actions action=new Actions(driver);
//		action.dragAndDrop(Draggable, Droppable).build().perform();
		
		//4) Draaggable 
//		driver.get("https://jqueryui.com/draggable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement Draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(Draggable, 100, 90).build().perform();
		
		//5) right click 
//		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebElement img = driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
//		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//		action.contextClick(img).build().perform();
		
		//6) Send keys by using action 
		
		
		
		
		
		
	}
	   

}
