package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframHandling {

	public static void main(String[] args) throws InterruptedException {

		String key="webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();

		String url = "https://www.rediff.com";
		driver.manage().window().maximize();
		driver.get(url);

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("(//span[@class=\"sensex\"])[1]")).click();
		Thread.sleep(3000);

		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href=\"https://www.rediff.com/cricket/ipl-2022\"]")).click();
	}
}
