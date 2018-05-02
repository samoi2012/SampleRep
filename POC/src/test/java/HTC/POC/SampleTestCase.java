package HTC.POC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class SampleTestCase {
	
  @Test
  public void f() {
	  System.out.println("Test Started");
	 
	  System.setProperty("webdriver.chrome.driver", "D:\\DevOps\\workspace\\POC\\drivers\\chromedriver.exe");
	  WebDriver browser = new ChromeDriver();
	 
	  browser.get("https://eportal.htcindia.com/home/");
	  browser.manage().window().maximize();
	  browser.findElement(By.xpath("//a[@class='emp-login-btn']")).click();
	  browser.findElement(By.name("user_name")).sendKeys("20979");
	  browser.findElement(By.name("user_pass")).sendKeys("Krishna@1994");
	  browser.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block btn-default']")).click();
	  browser.findElement(By.xpath("//span[@class='logout_text']")).click();
	  browser.quit();
	  
	  System.out.println("Test Completed");
	  
	  
	  
  }
  
  @BeforeClass
  public void beforeTest() {
	  System.out.println("Executed before every TestNg Class");
	  
  }

  @AfterClass
  public void afterTest() {
	  System.out.println("Executed after every TestNg Class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Executed before every TestNg Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Executed after every TestNg Suite");
  }

}
