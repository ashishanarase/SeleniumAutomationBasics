package selenium_Topics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		String url ="http://automationpractice.com/index.php";
		driver.get(url);

		driver.manage().window().maximize();

		String path ="C:\\Users\\ASHISH\\Desktop\\Notepad\\ScreenShot\\01-AutomationSite.jpg";
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File (path);
		
		FileHandler.copy(src, des);
		
		System.out.println("Screenshot Done");		
		
		//driver.close();
	}
}
