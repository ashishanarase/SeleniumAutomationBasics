package selenium_Class;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Point_Class {	

	public static void main(String[] args) {
		
	
	String key="webdriver.chrome.driver";
	String value="C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

	System.setProperty(key, value);

	String url="https://www.google.co.in";

	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();

	driver.get(url);

	Point a = driver.manage().window().getPosition();
	System.out.println(a);
	
	Point p = new Point (0, 0);
	driver.manage().window().setPosition(p);
		
	}
}
