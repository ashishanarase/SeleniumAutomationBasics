package webDriver_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Count_Class {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";

		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();

		String url ="https://www.amazon.in";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		//dropdown.click();

		Select s = new Select(dropdown);
		s.selectByVisibleText("Alexa Skills");

		List<WebElement> all_opt = s.getOptions();
		int count = all_opt.size();
		System.out.println(count);

		//to print all options
		for (int i=0; i<count; i++) {
			String data = all_opt.get(i).getText();
			System.out.println(data);
		}
	}
}
