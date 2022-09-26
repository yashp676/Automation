package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Step 1: typeCasting
		
		TakesScreenshot ts=(TakesScreenshot) driver;
          
		
		//Step 2: access the method photo taken and stored in Ram
		File ramloc = ts.getScreenshotAs(OutputType.FILE);
		
		//step 3: Required Location
		File destloc = new File("./photo/Youtube.png");
		
		//step 4: copy paste from ramloc to destloc
		
		FileUtils.copyFile(ramloc, destloc);
		
	}

}
