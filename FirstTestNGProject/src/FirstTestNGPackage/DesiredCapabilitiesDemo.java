package FirstTestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args)
	{
		WebDriver driver;
		
		//setting desired capabilities 
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Khuliso\\eclipse-workspace\\Gecko drivers\\IEDriverServer.exe");
		
		 driver = new InternetExplorerDriver();
		 
		 driver.get("https://www.google.com");
		 
		 driver.findElement(By.name("q")).sendKeys("elevation worship");
		 
		 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		 
		 driver.close();
		 
		 driver.quit();
	}

}
