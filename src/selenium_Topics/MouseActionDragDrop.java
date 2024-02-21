package selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActionDragDrop {
	
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url ="https://jqueryui.com/droppable";
		driver.get(url);
		

		Thread.sleep(3000);
	
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		WebElement element1 = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		WebElement element2 = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		Actions action =new Actions(driver);
		//action.clickAndHold(element1).moveToElement(element2).release().build().perform();
		action.dragAndDrop(element1, element2).build().perform();
		
	}
}
