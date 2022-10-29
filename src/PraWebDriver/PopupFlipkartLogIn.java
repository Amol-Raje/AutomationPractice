package PraWebDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupFlipkartLogIn {
	static FileInputStream file;
	static String mob;
	static String pass;
	public static void Excel() throws EncryptedDocumentException, IOException{
		file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\Book1.xlsx");
		mob = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\Book1.xlsx");
		pass = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(mob+"--"+pass);
	}
	
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		Excel();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.get("https://www.flipkart.com/");
//		
//		//UsernameField
//		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//		username.sendKeys(mob);
//		
//		//PasswordField;
//		WebElement Pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
//		Pass.sendKeys(pass);
//		
//		//LoginBtn;
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();	
//	}
}
