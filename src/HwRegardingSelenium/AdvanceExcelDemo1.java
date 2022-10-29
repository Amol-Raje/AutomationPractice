package HwRegardingSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceExcelDemo1 {

	static FileInputStream file;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\NextCO.xlsx");
		int row = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();

		file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\NextCO.xlsx");
		int col = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<=row;i++) {
			file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\NextCO.xlsx");
		    String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(col).getStringCellValue();
			al.add(value);
		}
		for(int j=0;j<al.size();j++) {
			driver.get(al.get(j));
			String title = driver.getTitle();
			WebElement text = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
			System.out.println(title+"==>"+text.getText());	
		}
	}
}
