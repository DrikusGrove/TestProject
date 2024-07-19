package vkb.testng.setup;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AssertTest {
	WebDriver myDriver = null;
	SoftAssert Myassert = null;
	
	
  @Test
  public void AssertTitle() {
	  
	  String title = myDriver.getTitle();
	  
	  Myassert.assertEquals(title, "Google");
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  String path = "C:\\Selenium Details\\chromedriver.exe";	
	  System.setProperty("webdriver.chrome.driver", path);
			
	  myDriver = new ChromeDriver();
	  Myassert = new SoftAssert();
		
	  myDriver.get("https://google.com/");
	  
  }

  
  @AfterMethod
  public void afterMethod() {
	  myDriver.close();
  }

}
