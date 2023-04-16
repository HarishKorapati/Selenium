package practise;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Driverfactory.drivers;

public class BaseTest extends drivers{
	WebDriver driver;
Properties prop;
drivers df;
	
	@BeforeTest()
	public void setUp() {
		 df = new drivers();
		 prop = df.init_prop();
		 driver= df.init_driver();
		
	}
	
	@AfterTest
	public void tearDown() {
		getDriver().quit();
	}
}
