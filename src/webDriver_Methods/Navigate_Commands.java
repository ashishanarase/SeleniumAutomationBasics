package webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Commands {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

		System.setProperty(key,value);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		String url = "https://www.google.co.in";

		driver.get(url);		 
		String get_url= driver.getCurrentUrl();
		System.out.println(get_url);
		
		Thread.sleep(3000);

		String url2 ="https://www.youtube.com";
		driver.navigate().to(url2);
		String get_url2= driver.getCurrentUrl();
		System.out.println(get_url2);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();

		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
	}

}
