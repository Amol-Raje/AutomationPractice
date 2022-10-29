package HwRegardingSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
//	String mob;
//	String pass;
	
	public static void ExcelFB() throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\Book1.xlsx");
		String mob = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\Book1.xlsx");
		String pass = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(mob+"--"+pass);
		
	}
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		ExcelFB();
//	}

	
}

