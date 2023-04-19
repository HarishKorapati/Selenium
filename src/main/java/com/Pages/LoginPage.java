package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.ElementUtil;

public class LoginPage{
	
	WebDriver driver;
	ElementUtil elementUtil;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	private By userName=By.name("username");
	By password=By.name("pwd");
	By loginButton=By.id("loginButton");
		
	public void launchURL(String url) {
		driver.get(url);
	}
	
	public void appLogin(String UN, String PWD) {
		try {
			elementUtil.getElement(userName).sendKeys(UN);
			elementUtil.getElement(password).sendKeys(PWD);
			elementUtil.getElement(loginButton).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
