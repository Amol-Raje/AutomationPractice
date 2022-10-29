package HwRegardingSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ParameterizationPratice {
	static WebDriver driver;
	static FileInputStream file;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	for(int i=0;i<5;i++) {	
	file= new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\NextCO.xlsx");
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
	System.out.println(data);	
		
	}
	}
}
