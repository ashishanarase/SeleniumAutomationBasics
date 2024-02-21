package interview_assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bhushan {

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


		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
		//from
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
		driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		//to
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		//date
		driver.findElement(By.xpath("(//p[text()='11'])[1]")).click();
		//serach
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();

		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		List<WebElement> list = driver.findElements(By.xpath("//p[contains(text(),'1 stop via ')]"));
		for(WebElement element:list) {
			System.out.println(element.getText());
		}


		driver.quit();

	}

}







