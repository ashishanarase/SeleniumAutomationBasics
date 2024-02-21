package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpsHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		String key ="webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
	
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		
		String url ="https://demoqa.com/alerts";
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		driver.switchTo().alert().sendKeys("GROUP");
		driver.switchTo().alert().accept();
		
		}
}
