package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extra_mocks {
	public static void main(String[] args) {
		
	
	String key ="webdriver.chrome.driver";
	String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

	System.setProperty(key, value);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	String url = "https://www.google.com";
	driver.get(url);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Selenium"+Keys.ENTER);
	
	driver.findElement(By.xpath("(//h3[contains(text(),\"Selenium\")])[1]")).click();
		
	
	}
}
