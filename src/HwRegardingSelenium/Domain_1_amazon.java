package HwRegardingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domain_1_amazon {
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		//e-Commerce Domain: amazon 
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();  //to maximize the web page
				
		//RegularLocators:
				
		//1)id-
				
		driver.findElement(By.id("twotabsearchtextbox"));  //Search box
		driver.findElement(By.id("nav-search-submit-button")); 
		driver.findElement(By.id("searchDropdownBox"));  //Dropdown button
				
		//2)name-
				
		driver.findElement(By.name("Jockey Men's Cotton T-Shirt")).click(); 
		driver.findElement(By.name("pass"));  //password  
		driver.findElement(By.name("login")); //log in button
				
		//3)linkedText
				
		driver.findElement(By.linkText("Jockey Men's Cotton T-Shirt"));  //link with full text.
				
		//4)PartialLinkedText
				
		driver.findElement(By.partialLinkText("Neck Half Sleev…"));  //partial link text.
				
		//5)className 
				
		driver.findElement(By.className("a-icon a-icon-next-rounded"));
				
		//6)tagName:
		//it will locate the tag of attribute;
				
		driver.findElements(By.tagName("a"));
		driver.findElement(By.tagName("input"));
		
		//Customized  xpath; 1) xpath 2) css locators
		
		//a)Basic Xpath==> //Tagname [ @ Attribute='value']
		
		driver.findElement(By.xpath("//input [ @id='twotabsearchtextbox']"));  //search box
		driver.findElement(By.xpath("//a [ @aria-label='Amazon']"));
		
		//b)xpath by text-function==> //Tagname [ text()='value']
		
		driver.findElement(By.xpath("//a [@text()='Returns']"));
		
		//c)xpath by contains function==> (if attribute value is large then we consider part of that value)
		//Tagname [ contains (@attribute, 'value')]
		
		driver.findElement(By.xpath("//a [contains(@ class,'a-link-normal')]"));
		
		//d)xpath by starts with==> (if attribute value is large then we consider starting part of that value)
		//Tagname [ contains (@attribute, 'starting part of value')]
		
		driver.findElement(By.xpath("//a [contains(@ alt,'Up to 70% off')]"));
		
		//e)xpath by using logical operators==> 1)and operator 2) or operator
		// tagname [@attibute1='value' and attribute2='value'] 
		// tagname [@attibute1='value' or attribute2='value'] ==> to locate dynamic operators which value changes after refreshing 
		
		driver.findElement(By.xpath("//a [@aria-label='Amazon App' and @class='nav-imageHref']"));
		driver.findElement(By.xpath("//input [@id='unifiedLocation1ClickAddress' and @ name='dropdown-selection']"));
		
		driver.findElement(By.xpath("//input [@id='nav-global-location-popover-link' or @ name='dropdown-selection']"));
		driver.findElement(By.xpath("//input [@id='isscrid' or @name='glow-validation-token']"));
		
		
		//**css Selectors:
		//when webpage is made with angular==>locating the element with css component
		
		//a)Tag & Id:
//		driver.findElement(By.cssSelector("input#email")).sendKeys("9561550421");
//		driver.findElement(By.cssSelector("#email")).sendKeys("98755662225");
		
		//b)Tag & class:
//		driver.findElement(By.cssSelector("input.inputtext"));
		driver.findElement(By.cssSelector(".inputtext"));
		
		//c)Tag & attribute:
//		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("xyz");
//		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("Amol@");
//		driver.findElement(By.cssSelector("button[name=login]")).click();
		
		//d)Tag, Class & Attribute:
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Amol@1234");
		
		
	}

}
