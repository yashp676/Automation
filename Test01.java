package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("./Scripts.properties");
        p.load(fis);
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(p.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
        driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
	}

}
