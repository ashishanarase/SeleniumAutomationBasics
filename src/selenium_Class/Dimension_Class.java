package selenium_Class;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension_Class {
	
	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String value="C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

		System.setProperty(key, value);

		String url="https://www.google.co.in";

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get(url);
		
		Dimension a = driver.manage().window().getSize();
		System.out.println(a);
		
		driver.manage().window().maximize();
		
		Dimension b = driver.manage().window().getSize();
		System.out.println(b);
		
		Dimension d = new Dimension(1000, 800);
		driver.manage().window().setSize(d);
		
		Dimension c = driver.manage().window().getSize();
		System.out.println(c);
		
	}

}
