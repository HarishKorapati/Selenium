package practise;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Pages.CustomerPage;
import com.Pages.LoginPage;
import com.Pages.ProjectPage;
import com.Pages.TaskPage;
import com.Pages.UserPage;

import Driverfactory.drivers;
import Utilities.ElementUtil;

public class BaseTest {
WebDriver driver;
public 	Properties prop;
drivers df;
ElementUtil elementUtil;
public LoginPage loginPage;
public UserPage userpage;
public CustomerPage customerpage;
public ProjectPage projectpage;
public TaskPage taskpage;
	
	@BeforeTest()
	public void setUp() {
		 df = new drivers();
		 prop = df.init_prop();
		 driver=df.init_driver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 loginPage=new LoginPage(driver);
		 userpage=new UserPage(driver);
	     customerpage=new CustomerPage(driver);
	     projectpage=new ProjectPage(driver);
	     taskpage=new TaskPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
}
