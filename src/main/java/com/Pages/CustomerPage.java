package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.ElementUtil;

public class CustomerPage {

	WebDriver driver;
	ElementUtil elementUtil;
	
	public CustomerPage(WebDriver driver) {
	this.driver=driver;
	elementUtil= new ElementUtil(driver);
    }
    
	By TaskButton=By.id("container_tasks");
	By AddNewBtn= By.xpath("//div[@class='title ellipsis']");
	By CreateCustomerBtn=By.xpath("//div[@class='item createNewCustomer']");
	By CustomerName=By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']");
	By Description=By.xpath("//textarea[@placeholder='Enter Customer Description']");
	By CustomerSubmitBtn=By.xpath("//div[contains(text(),'Create Customer')]");
	
	
	
	public void customerCreation(String CN,String DSCTN) throws InterruptedException {
		
		elementUtil.getElement(TaskButton).click();
		elementUtil.getElement(AddNewBtn).click();
		elementUtil.getElement(CreateCustomerBtn).click();
		elementUtil.getElement(CustomerName).sendKeys(CN);
		elementUtil.getElement(Description).sendKeys(DSCTN);
		elementUtil.getElement(CustomerSubmitBtn).click();
		
	
		
	}	

}