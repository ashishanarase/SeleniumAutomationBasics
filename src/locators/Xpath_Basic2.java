package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Basic2 {
	public static void main(String[] args) {
		
	
	String key = "webdriver.chrome.driver";
	String value ="C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
	
	System.setProperty(key, value);
	
	String url ="https://www.amazon.in";
	//String url ="https://www.facebook.com";
	
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	driver.get(url);
	driver.manage().window().maximize();
	
	//Basic-xPath by Text Function
	//tagname[text()="text_value"]
	//1-Amazon
	//driver.findElement(By.xpath("(//a[text()=\"Customer Service\"])[1]")).click();
	driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();

	
	//2-Facebook
	//WebElement click_on=driver.findElement(By.xpath("(//a[text()=\"Forgotten password?\"]"));
	//click_on.click();
	
	}
}
