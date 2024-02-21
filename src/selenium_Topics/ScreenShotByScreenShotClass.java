package selenium_Topics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import a_first_script.ScreenShotClass;

public class ScreenShotByScreenShotClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		String url ="https://www.hotstar.com";
		driver.get(url);

		driver.manage().window().maximize();

		//UtilClass object 		
		
		Thread.sleep(5000);
				
		ScreenShotClass.takeSS(driver, "03-Hotstar"); 	
		
		System.out.println("Screenshot Done");		
		
		}

}
