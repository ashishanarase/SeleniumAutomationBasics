package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	
	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		String url = "https://www.youtube.com/watch?v=PZjtjU-hU4k";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	

}
