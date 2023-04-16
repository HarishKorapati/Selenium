package Driverfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drivers {
	
	WebDriver driver;
	Properties prop;
	public static ThreadLocal<WebDriver> tl=new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver() {
//		String browser="edge";
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			System.out.println("Browser passed not found - "+browser);
		}
		tl.set(driver);
		return driver;
	}
	
	public Properties init_prop() {
		prop = new Properties();
		try {
			FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	public static synchronized WebDriver getDriver(){
		return tl.get();
	}


}
