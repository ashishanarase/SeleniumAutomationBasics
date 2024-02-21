package selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActionDoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url ="https://api.jquery.com/dblclick";
		driver.get(url);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,2500)");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		WebElement doubleclick = driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
		
		Actions action =new Actions(driver);
		action.doubleClick(doubleclick).build().perform();
		
	}
}
