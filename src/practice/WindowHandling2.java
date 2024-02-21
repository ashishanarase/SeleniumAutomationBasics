package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2 {

	public static void main(String[] args) throws InterruptedException {

		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPhone13"+Keys.ENTER);

		driver.findElement(By.xpath("//input[@name='q']")).click();

		Thread.sleep(3000);

		String mainwindowID = driver.getWindowHandle();
		System.out.println(mainwindowID);

		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']")).click();

		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

		Set<String> allWindowsIDs = driver.getWindowHandles();

		for(String c:allWindowsIDs)
		{

			System.out.println(c);

			if(mainwindowID.equals(c))
			{
				System.out.println("I am on main windows");
			}
			else
			{
				System.out.println("I am on child windows");
				driver.switchTo().window(c);
				driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
				//driver.findElement(By.xpath("(//span[@class=\"_2I9KP_\"])[1]")).click();
				System.out.println("I am able to click on add to cart");
			}
		}
	}
}

