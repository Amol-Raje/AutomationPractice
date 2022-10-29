package PraWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityFiles {
	//0)Take a ScreenShot;
	public static void GetFullScreen (WebDriver driver) throws IOException {
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 Date d = new Date();
	 String filename=d.toString().replace(" ", "_").replace(":", "_")+".png";
	 File dest=new File("C:\\Users\\Administrator\\Desktop\\Selenium\\ScreenShots\\ScreenShot\\"+filename);
	 FileUtils.copyFile(src, dest);
		
	}
	//a)Get Screenshot of an specific Section;
	public static void GetSpecificScreen(WebDriver driver, WebElement element) throws IOException {
	//onwords selenium 4 it will directally implemented getScreenshot() method from a WebElement  
		File src = element.getScreenshotAs(OutputType.FILE);  //For a specific Section ScreenShot we dont need to type cast the TakesScreenshot() inteface into webdriver interface
		Date d= new Date();                                                      
		String filename = d.toString().replace(" ","_").replace(":", "_")+".png";
		File file=new File("C:\\Users\\Administrator\\Desktop\\Selenium\\ScreenShots\\Section Screenshot\\"+filename);
		FileUtils.copyFile(src, file);
	}
	//b)Get screenshot of an webelement;
	public static void GetElementScreenshot(WebDriver driver, WebElement ele) throws IOException {
		File src = ele.getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String filename = d.toString().replace(" ", "_").replace(":", "_")+".png";
		File file=new File("C:\\Users\\Administrator\\Desktop\\Selenium\\ScreenShots\\Section Screenshot\\"+filename);
		FileUtils.copyFile(src, file);
		
	}
	//1)To fetch data from the excel 
	public static String Fetch(String sheet,int i, int j) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream ("C:\\Users\\Administrator\\Desktop\\Selenium\\Excel file\\Book1.xlsx");
	    String value = WorkbookFactory.create(file).getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
	    return value; 
	}
	//2)To draw the border of the web element 
	public static void BorderByJs(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	//3)Title by Js;
	public static String TitleByJs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title").toString();
		return title;
	}
	//4)Click by js;
	public static void ClickByJs(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	//5)Alert by Js;
	public static void AlertByJs(WebDriver driver, String massage) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('"+massage+"')");
	}
	//6)Refresh the page;
	public static void RefreshByJs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go (0)");
	}
	//7)For Scrolling the page;
	public static void ScrollingByJs(WebDriver driver,int x,int y) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll("+x+","+y+")");
	}
	//8)Scroll into view;
	public static void ScrollIntoView(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(true);", element);
	}
	
}


