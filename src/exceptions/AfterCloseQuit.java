package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AfterCloseQuit {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
				
		String url= "https://www.cricbuzz.com";
		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//a[@class=\"text-white\"])[5]")).click();

		driver.findElement(By.xpath("(//a[@title=\"Kane Williamson's Profile\"])[1]")).click();
		
		driver.close();
		
		driver.quit();
		
		driver.findElement(By.xpath("(//a[@title=\"Joe Root's Profile\"])[1]")).click();
			
	}

}


