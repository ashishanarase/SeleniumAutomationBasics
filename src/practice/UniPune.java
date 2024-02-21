package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UniPune {


	public static void main(String[] args) throws InterruptedException {

		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url= "http://www.unipune.ac.in";
		driver.get(url);

		WebElement studentcorner = driver.findElement(By.xpath("//td[@id=\"stUI229_cnt\"]"));

		Actions action= new Actions(driver);

		action.moveToElement(studentcorner).build().perform();

		driver.findElement(By.linkText("Syllabi")).click();

		Thread.sleep(3000);

		WebElement research = driver.findElement(By.xpath("//td[@id=\"stUI185_cnt\"]"));

		action.moveToElement(research).build().perform();

		driver.findElement(By.linkText("Avishkar")).click();
	}
}
