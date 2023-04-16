package Tests;

import org.testng.annotations.Test;

import practise.BaseTest;

public class DemoTest extends BaseTest{
	@Test
	public void executionStart() {
		System.out.println("Execution Started - Harish");
		getDriver().get("https://eclipseide.org/");
	}
}
