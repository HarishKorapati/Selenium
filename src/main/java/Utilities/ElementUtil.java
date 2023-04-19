package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ElementUtil {
	
	WebDriver driver;
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = driver.findElement(locator);
		return element;
	}

}
