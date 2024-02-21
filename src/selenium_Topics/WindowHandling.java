package selenium_Topics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class WindowHandling {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();

		String url= "https://www.rediff.com";
		driver.get(url);

		driver.manage().window().maximize();

		driver.switchTo().frame("moneyiframe");

		driver.findElement(By.xpath("//span[@id=\"bseindex\"]")).click();

		driver.switchTo().defaultContent();

		String mainwindowID = driver.getWindowHandle();
		System.out.println(mainwindowID);

		Set<String> allwindowsID = driver.getWindowHandles();

		for(String c:allwindowsID) {
			System.out.println(c);

			if(mainwindowID.equals(c)) {
				System.out.println("Focus on Main Window");
			}
			else {
				System.out.println("Focus on Child Window");
				driver.switchTo().window(c);
				String title = driver.getTitle();
				System.out.println(title);
			}
		}
	}

}
