package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Refresh {

		
          @FindBy(id="search")
          private WebElement searchtb;
          
          public Refresh(WebDriver driver)
          {
        	  PageFactory.initElements(driver,this);
          }
          
          public void searchtb(String id)
          {
        	  searchtb.sendKeys(id);
          }
	

}
