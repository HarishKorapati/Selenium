package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.ElementUtil;

public class ProjectPage {

	WebDriver driver;
	ElementUtil elementUtil;
	
	public ProjectPage(WebDriver driver) {
		this.driver= driver;
		elementUtil=new ElementUtil(driver);
	}
	
	By TaskButton=By.id("container_tasks");
	By AddNewBtn= By.xpath("//div[@class='title ellipsis']");
    By CreateProjectBtn=By.xpath("//div[@class='item createNewProject']");
	By ProjectName=By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']");
	By CustomerBtn=By.xpath("//*[text()='-- Please Select Customer to Add Project for  --']");
	By SelectCustomerBtn=By.xpath("//div[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer notSelected']//div[contains(@class,'itemRow cpItemRow')][normalize-space()='hari']");
	By Description1=By.xpath("//textarea[@placeholder='Add Project Description']");
	By ProjectSubmitBtn=By.xpath("//div[contains(text(),'Create Project')]");
	
	public void launchURL3(String url) {
		driver.get(url);
	}
	
	public void ProjectCreation(String PN,String DSCTN) throws InterruptedException {
		
		elementUtil.getElement(TaskButton).click();
		elementUtil.getElement(AddNewBtn).click();
		elementUtil.getElement(CreateProjectBtn).click();
		elementUtil.getElement(ProjectName).sendKeys(PN);
		elementUtil.getElement(CustomerBtn).click();
		elementUtil.getElement(SelectCustomerBtn).click();
		elementUtil.getElement(Description1).sendKeys(DSCTN);
		elementUtil.getElement(ProjectSubmitBtn).click();
		
	}
}
