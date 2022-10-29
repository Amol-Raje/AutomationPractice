package PraWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancementInExcel {
	static FileInputStream file;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ArrayList<String> al = new ArrayList<String>();
		//Read the data
		for(int i=0;i<2;i++) {
			file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\NextCO.xlsx");
		    String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			al.add(value);	
		}
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		for(int j=0;j<al.size();j++) {
			driver.get(al.get(j));
			String Title = driver.getTitle();
			WebElement text = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));	
			System.out.println(Title+"==>"+text.getText());
			
		}
	}
}
