package vkb.testng.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GroupTests {
	
	WebDriver myDriver1 = null;
	WebDriver myDriver2 = null;
	
  @Test(groups = "Chrome")
  public void SetupChrome() {
	  
	  String path = "C:\\Selenium Details\\chromedriver.exe";	
	  System.setProperty("webdriver.chrome.driver", path);
			
	  myDriver1 = new ChromeDriver();
	  myDriver1.get("https://google.com/");
	  
  	}
  	
  @Test(groups = "Chrome",dependsOnMethods = {"SetupChrome"})
	public void NavigateChrome() {
		
		  myDriver1.get("https://google.com/");
		  myDriver1.findElement(By.id("APjFqb")).sendKeys("Hello World");
		  myDriver1.findElement(By.id("APjFqb")).submit();
		  
	  }
  
  @Test(groups = "Firefox")
  public void SetupFireFox() {
	  
	  String path = "C:\\Selenium Details\\Firefox\\geckodriver.exe";	
	  System.setProperty("webdriver.gecko.driver", path);
			
	  myDriver2 = new FirefoxDriver();
	  myDriver2.get("https://google.com/");
	  
  	}
  	
  @Test(groups = "Firefox",dependsOnMethods = {"SetupFireFox"})
	public void NavigateFireFox() {
		
		  myDriver2.get("https://google.com/");
		  myDriver2.findElement(By.id("APjFqb")).sendKeys("Hello World");
		  myDriver2.findElement(By.id("APjFqb")).submit();
		  
	  }
  
}
