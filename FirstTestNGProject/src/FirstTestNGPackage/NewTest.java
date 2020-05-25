package FirstTestNGPackage;

import org.testng.annotations.Test;

import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class NewTest 
{
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	 String driverPath = "C:\\\\Users\\\\Khuliso\\\\eclipse-workspace\\\\Gecko drivers\\\\chromeDriver\\\\chromedriver.exe";
	 public WebDriver driver ;
	
  @Test
  public void VerifyHomePage() 
  {
	  String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @AfterClass
  public void ClosingTheBrowser() 
  {
	  driver.close();
  }

  @BeforeTest
  public void LaunchingBrowser() 
  {
	  System.out.println("launching google browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
  }

}
