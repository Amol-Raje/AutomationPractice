package HwRegardingSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	//1) Get Screen shot:Takes Screen shot is an interface.Remote web driver is an implementation class for an following interfaces a)Webdriver, b)JavaScriptExecutor, c)Takes ScreenShot;
	
	public static void GetScreenShot(WebDriver driver) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   //type-casting of Webdriver interface into TakesScreenshot interface
		    //getScreenshotas is a method which accepts the file as an argument
		Date d=new Date();                               //to get an unique name
		String filename=d.toString().replace(" ", "_").replace(":", "_")+".png";
		File dest = new File("C:\\Users\\Administrator\\Desktop\\Selenium\\ScreenShots\\"+filename);
		FileUtils.copyFile(src, dest);
	}

}
