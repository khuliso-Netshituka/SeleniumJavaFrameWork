package FirstTestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {
	
	//public   String baseUrl = "http://demo.guru99.com/test/newtours/";
	 

	public static void main(String[] args) 
	{
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String driverPath = "C:\\\\Users\\\\Khuliso\\\\eclipse-workspace\\\\Gecko drivers\\\\chromeDriver\\\\chromedriver.exe";
		 WebDriver driver ;
		//creating an extent html reporter
		//this is to statement to start a report
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		
		
		//creating and attaching a reporter
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
		//creating the first extent Test case and adding a description after the first coma
		ExtentTest test1 = extent.createTest("NewTest","this is to open the mecury tour website"); 
		
		//launching a browser
		 System.setProperty("webdriver.chrome.driver", driverPath);
	      driver = new ChromeDriver();
	      driver.get(baseUrl);
		
		  test1.log(Status.INFO, "button signon clicked");
	      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
	      test1.pass("button clicked");
	      
	      driver.close();
	      driver.quit();
	      test1.pass("close the browser");
	      
	      test1.info("test completed");
	      
	      //after everything you must flush the report
	      extent.flush();

		



	}

}
