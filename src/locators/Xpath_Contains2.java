package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains2 {
	public static void main(String[] args) {
		
	
	String key = "webdriver.chrome.driver";
	String value ="C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
	
	System.setProperty(key, value);
	
	String url ="https://www.google.com/";
	
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	driver.get(url);
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Selenium"+Keys.ENTER);
	
	//1-Selenium
	//Contains-xPath by text function
	//tagname[contains(text(),"text_value")]
	driver.findElement(By.xpath("(//h3[contains(text(),\"Selenium\")])[1]")).click();
	
	//2-Amazon
	
	
		
	}
}
