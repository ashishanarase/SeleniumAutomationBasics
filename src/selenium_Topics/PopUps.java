package selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {
	
	public static void main(String[] args) throws InterruptedException {
		
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		
		String url = "https://demoqa.com/alerts";
		
		driver.get(url);
		
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		
		Thread.sleep(3000);
	
		driver.switchTo().alert().sendKeys("Ashish Anarase");
		driver.switchTo().alert().accept();	
		
		Thread.sleep(3000);
		
		//driver.switchTo().alert().getText();
		
	}

}
