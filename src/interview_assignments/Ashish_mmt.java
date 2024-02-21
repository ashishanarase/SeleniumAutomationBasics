package interview_assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ashish_mmt {

	public static void main(String[] args) {
		String url ="https://www.makemytrip.com";  //browse URL
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class=\"langCardClose\"]")).click();
		driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		WebElement pune = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
		pune.sendKeys("Pune");
		
		driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		driver.findElement(By.xpath("//p[text()='Bangalore, India']")).click();
		
		driver.findElement(By.xpath("(//p[text()='12'])[1]")).click();
		
		driver.findElement(By.xpath("//a[@class=\"primaryBtn font24 latoBold widgetSearchBtn \"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"button buttonSecondry buttonBig fontSize12 relative\"]")).click();
		
		
		 List<WebElement> list = driver.findElements(By.xpath("//p[contains(text(),'1 stop via')]"));
		
		 for (WebElement element:list) {
			 System.out.println(element.getText());
		 }
	}
}







