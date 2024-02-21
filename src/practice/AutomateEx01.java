package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateEx01 {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";	
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

		System.setProperty(key, value);

		String url = "http://automationpractice.com/index.php";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get(url);
		
		driver.manage().window().maximize();

		WebElement search_box = driver.findElement(By.name("search_query"));
		search_box.sendKeys("Dress");

		WebElement search_bottom = driver.findElement(By.name("submit_search"));
		search_bottom.click();
		
		driver.manage().window().maximize();

	}
}
