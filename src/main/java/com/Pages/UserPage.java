package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.ElementUtil;

public class UserPage {

	WebDriver driver;
	ElementUtil elementUtil;
	public UserPage(WebDriver driver) {
		this.driver= driver;
		elementUtil = new ElementUtil(driver);
		
	}
	
//   
	By UsersButton=By.id("container_users");
	By NewUserButton=By.xpath("//div[@class=\"components_button_label\"][1]");
	By FirstName=By.id("createUserPanel_firstNameField");
	By LastName=By.id("createUserPanel_lastNameField");
	By EmailId= By.id("createUserPanel_emailField");
	By DepartmentBtn= By.xpath("(//div[@class='title'][normalize-space()='-- department not assigned --'])[1]");
	By SelectDptBtn= By.xpath("(//div[@class='item'][normalize-space()='Sales & Support'])[1]");
	By SubmitButton= By.xpath("//div[contains(text(),'Save & Send Invitation')]");
	
	public void userLogin(String FN,String LN,String EMAIL) throws InterruptedException {
		
		elementUtil.getElement(UsersButton).click();
		elementUtil.getElement(NewUserButton).click();
		elementUtil.getElement(FirstName).sendKeys(FN);
		elementUtil.getElement(LastName).sendKeys(LN);
		elementUtil.getElement(EmailId).sendKeys(EMAIL);
		elementUtil.getElement(DepartmentBtn).click();
		elementUtil.getElement(SelectDptBtn).click();
		elementUtil.getElement(SubmitButton).click();
		
		
	}
	}

