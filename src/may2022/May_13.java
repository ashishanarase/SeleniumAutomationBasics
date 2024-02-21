package may2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class May_13 {
	
	public static void main(String[] args) {
		
		
		String url = "https://www.cricbuzz.com";
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
	
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
	}

}
