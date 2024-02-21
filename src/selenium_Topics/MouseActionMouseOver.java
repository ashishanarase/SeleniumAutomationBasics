package selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActionMouseOver {
	
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//String url ="http://www.unipune.ac.in";
		String url ="https://www.cricbuzz.com";
		driver.get(url);
		
		Thread.sleep(3000);
		
		//WebElement element1 = driver.findElement(By.xpath("//span[@id=\"stUI229_txt\"]"));
		WebElement element1 = driver.findElement(By.xpath("(//a[@class=\"text-white\"])[5]"));
				
		Actions action =new Actions(driver);
		action.moveToElement(element1).build().perform();
		
		//driver.findElement(By.xpath("//span[text()=\"Convocation\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"ICC Rankings - Men\"]")).click();
		
		driver.findElement(By.xpath("(//a[@title=\"Ravindra Jadeja's Profile\"])[1]")).click();
			
	}
}
