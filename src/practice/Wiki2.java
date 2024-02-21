package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.jodah.failsafe.internal.util.Assert;

public class Wiki2 {

	public static void main(String[] args) throws InterruptedException {

		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
				
		String url= "https://www.cricbuzz.com";
		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//a[@class=\"text-white\"])[5]")).click();

		//driver.findElement(By.xpath("(//a[@title=\"Joe Root's Profile\"])[1]")).click();
		
		driver.findElement(By.xpath("(//a[@title=\"Kane Williamson's Profile\"])[1]")).click();
		
		Thread.sleep(5000);
		
	
		
		//driver.navigate().refresh();
		
		//driver.quit();
			
	}

}
