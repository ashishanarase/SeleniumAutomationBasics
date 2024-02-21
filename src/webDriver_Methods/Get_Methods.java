package webDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		String url = "https://www.flipkart.com";
		driver.get(url);
		String get_url = driver.getCurrentUrl();
		System.out.println(get_url);
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		String page_src = driver.getPageSource();
		System.out.println(page_src);
		
		String mobiles = driver.findElement(By.xpath("(//div[@class=\"xtXmba\"])[3]")).getText();
		System.out.println("This is text method output = " +mobiles);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("This is size method output = "+size);
		
		Point position = driver.manage().window().getPosition();
		System.out.println("This is position method output = "+position);
			
		driver.close();		
	}
}
