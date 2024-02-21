package relative_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {
	//Relative Locators and DropDown Handling

	public static void main(String[] args) throws InterruptedException {

		String key = "webdriver.chrome.driver";
		String value ="C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

		System.setProperty(key, value);

		String url ="https://www.facebook.com/reg";

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get(url);
		driver.manage().window().maximize();

		WebElement first_name = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		first_name.sendKeys("Ashish");
		Thread.sleep(1000);

		//toRightOf
		WebElement sur_name = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(first_name));
		sur_name.sendKeys("Anarase");
		Thread.sleep(1000);

		//below
		WebElement mobile = driver.findElement(RelativeLocator.with(By.tagName("input")).below(first_name));
		mobile.sendKeys("992222989");
		Thread.sleep(1000);

		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(mobile));
		password.sendKeys("Ashish@0989");
		Thread.sleep(1000);

		WebElement dropdown = driver.findElement(By.xpath("//select[@title=\"Day\"]"));
		Select s = new Select(dropdown);
		//s.selectByIndex(15);
		s.selectByValue("16");
		//s.selectByVisibleText("16");

		WebElement dropdown2 = driver.findElement(RelativeLocator.with(By.tagName("select")).toRightOf(dropdown));
		Select s1 = new Select (dropdown2);
		s1.selectByVisibleText("Apr");
		//s1.selectByIndex(3);

		WebElement dropdown3 = driver.findElement(RelativeLocator.with(By.tagName("select")).toRightOf(dropdown2));
		Select s2 = new Select (dropdown3);
		s2.selectByVisibleText("1993");
		
		//input[@name="sex"])[2]---xpath basic
		//WebElement radiobutt = driver.findElement(By.xpath("//input[@name=\"sex\"])[2]"));
		//radiobutt.click();
				
		//input[contains(@id,\"u_0_7\")]---xpath contains
		WebElement radiobutt2 = driver.findElement(By.xpath("//input[contains(@id,\"u_0_7\")]"));
		radiobutt2.click();
		
		Thread.sleep(2000);
		
		WebElement signup = driver.findElement(By.xpath("//button[contains(@id,\"u_0_10\")]"));
		signup.click();
		
	}
}
