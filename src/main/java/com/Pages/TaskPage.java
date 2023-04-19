package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.ElementUtil;

public class TaskPage {
	WebDriver driver;
	ElementUtil elementUtil;
	
	public TaskPage(WebDriver driver) {
		this.driver= driver;
		elementUtil = new ElementUtil(driver);
	}
	
	By TaskButton=By.id("container_tasks");
	By AddNewBtn= By.xpath("//div[@class='title ellipsis']");
	By TaskBtn=By.xpath("//div[@class='item createNewTasks']");
    By SelectCustomerBtn=By.xpath("(//td)[231]");
    
    By TaskName=By.xpath("(//input[@placeholder='Enter task name'])[4]");
    By TaskSubmitBtn=By.xpath("");
    
	
	public void TaskCreation(String TN) throws InterruptedException {
	
		elementUtil.getElement(TaskButton).click();
		elementUtil.getElement(AddNewBtn).click();
		elementUtil.getElement(TaskBtn).click();
		elementUtil.getElement(SelectCustomerBtn).click();
		elementUtil.getElement(TaskName).sendKeys(TN);
		elementUtil.getElement(TaskSubmitBtn).click();
	}
}
