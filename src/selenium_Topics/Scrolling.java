package selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		String url= "https://www.amazon.in";
		driver.manage().window().maximize();
		driver.get(url);

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("I phone 13"+Keys.ENTER);		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[3]")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,3000)");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(100,-1000)");
	
	}

}
