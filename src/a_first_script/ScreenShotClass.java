package a_first_script;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass {

	public static void takeSS (WebDriver driver, String filename) {

		String path ="C:\\Users\\ASHISH\\Desktop\\Notepad\\ScreenShot\\"+filename+".jpg";

		TakesScreenshot ts = ((TakesScreenshot)driver);

		File src = ts.getScreenshotAs(OutputType.FILE);

		File des = new File (path);

		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			System.out.println("This is my Exception "+e);
			e.printStackTrace();
			
		}
		
	}
}
