package selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Iframe {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		
		String url= "https://www.rediff.com";
		String url1="https://money.rediff.com/nse";
		driver.get(url);

		driver.manage().window().maximize();

		//Switch the focus of selenium from main page to iframe
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame("moneyiframe");

		driver.findElement(By.xpath("//span[@id=\"bseindex\"]")).click();
		
		String bse = driver.findElement(By.xpath("//span[@id=\"bseindex\"]")).getText();

		System.out.println(bse);

		String nse = driver.findElement(By.xpath("//span[@id=\"nseindex\"]")).getText();

		System.out.println(nse);
		
		//Again Switch the focus of selenium from iframe to main page
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@href=\"https://www.rediff.com/cricket\"])[1]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);

		//driver.close();
	}

}
