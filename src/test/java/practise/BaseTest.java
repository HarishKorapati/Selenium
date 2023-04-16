package practise;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Driverfactory.drivers;

public class BaseTest {
WebDriver driver;
Properties prop;
drivers df;
	
	@BeforeTest()
	public void setUp() {
		 df = new drivers();
		 prop = df.init_prop();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
}
