package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Basic1 {

	public static void main(String[] args) {

		String key="webdriver.chrome.driver";
		String value="C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

		System.setProperty(key, value);

		String url="http://automationpractice.com/index.php";

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get(url);

		driver.manage().window().maximize();

		//Basic-xPath by attribute 
		//tagname[@attribute="value"]
		driver.findElement(By.xpath("//a[@title=\"Women\"]")).click();
		//driver.findElement(By.xpath("//a[@title=\"Dresses\"])[1]")).click();
		
	}

}
