package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationEx02 {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";	
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\Amar Waghamare Sir\\Software\\chromedriver.exe";

		System.setProperty(key, value);

		String url = "http://automationpractice.com/index.php";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement click_On = driver.findElement(By.linkText("Contact us"));
		click_On.click();
		
		driver.manage().window().maximize();

	}
}

