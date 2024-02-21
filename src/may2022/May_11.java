package may2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class May_11 {

	public static void main( String [] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		//switch to frame
		org.openqa.selenium.WebElement xyz = driver.findElement(By.xpath("(//iframe[@frameborder='0'])[1]"));
		driver.switchTo().frame(xyz);

		driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();

	}

}