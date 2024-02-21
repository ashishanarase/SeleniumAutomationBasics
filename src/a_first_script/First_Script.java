package a_first_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Script {
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.navigate().to("https://meet.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		//driver.quit();
	}

}
