package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {

	public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		String url= "https://www.cricbuzz.com";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//a[@class=\"text-white\"])[5]")).click();

		//driver.findElement(By.xpath("(//a[@title=\"Joe Root's Profile\"])[1]")).click();
		
		driver.findElement(By.xpath("(//a[@title=\"Kane Williamson's Profile\"])[1]")).click();
		
		driver.quit();
		
	}
}
