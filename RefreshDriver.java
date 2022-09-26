package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Refresh r = new Refresh(driver);
		driver.navigate().refresh();
		
		r.searchtb("draupadi murmu");
		
	}

}
