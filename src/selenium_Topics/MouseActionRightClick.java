package selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionRightClick {
	
	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url ="https://swisnl.github.io/jQuery-contextMenu/demo.html";
		driver.get(url);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		Actions action =new Actions(driver);
		action.contextClick(rightclick).build().perform();
		
	}

}
