package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains1 {
	public static void main(String[] args) {
		
	
	String key = "webdriver.chrome.driver";
	String value ="C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
	
	System.setProperty(key, value);
	
	String url ="https://www.facebook.com/";
	
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	driver.get(url);
	driver.manage().window().maximize();
	
	//Contains-xPath by atrribute 
	//tagname[contains(@attribute,"value")]
	driver.findElement(By.xpath("//a[contains(@id,\"u_0_2\")]")).click();
	
	}
}
