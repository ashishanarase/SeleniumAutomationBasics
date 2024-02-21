package a_first_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_Script {
	public static void main(String [] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe");

		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().deleteAllCookies();

		driver1.get("https://www.youtube.com/watch?v=8FAUEv_E_xQ&list=RD8FAUEv_E_xQ&index=1");

		String url = driver1.getCurrentUrl();
		System.out.println(url);

		String title = driver1.getTitle();
		System.out.println(title);

		
		driver1.manage().window().maximize();
		driver1.manage().window().minimize();
		driver1.manage().window().fullscreen();
		//driver1.close();
	}

}


