import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsUtils {
	//1)To fetch data from single column of excel;
	public static String FetchData(int i) throws EncryptedDocumentException, IOException {
		while(i>=0) {
			FileInputStream file = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\Book1.xlsx");
		    String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			return value;
	}
		return null;
	}
	
	//2)Get Screen Shot
	public static void GetScreenShot(WebDriver driver) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		 String filename = d.toString().replace(" ", "_").replace(":", "_")+".png";
		    File des = new File("C:\\Users\\Administrator\\Desktop\\Selenium\\ScreenShots\\ScreenShot\\"+filename);
		    FileUtils.copyFile(src, des);
	}

	//3)For border to the web element 
	public static void BorderByJs(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	//4)Title by JS
	public static String TitleByJs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String Title = js.executeScript("return document.title").toString();
		return Title;
	}
	//5)click by JS
	public static void ClickByJs(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);	
    }
	//6)Alert by JS
	public static void AlertByJs(WebDriver driver, String massage) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('"+massage+"')");
    }
	//7)Referesh the page
	public static void RefreshByJs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	//8)For Scrolling the page
	public static void ScrollByJs (WebDriver driver,int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll("+x+","+y+")");    //
	
	//7)
	
}
    }
