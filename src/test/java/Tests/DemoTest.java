package Tests;

import org.testng.annotations.Test;

import Utilities.ElementUtil;
import practise.BaseTest;

public class DemoTest extends BaseTest{
	
	ElementUtil elementUtil;
	@Test
	public void loginToActiTime() throws InterruptedException  {
		System.out.println("Execution Started - Harish");
		loginPage.launchURL(prop.getProperty("URL"));
		loginPage.appLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
	}
	
	@Test
	public void navigateToUsers() throws InterruptedException  {
		
		loginPage.launchURL(prop.getProperty("URL"));
		loginPage.appLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
		userpage.userLogin(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("EmailId"));
		Thread.sleep(5000);
		
	}
	@Test
	public void CreateNewCustomer() throws InterruptedException {
		loginPage.launchURL(prop.getProperty("URL"));
		loginPage.appLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
		customerpage.customerCreation(prop.getProperty("CustomerName"),prop.getProperty("Description"));
			
	}

     @Test
     public void CreateNewProject() throws InterruptedException {
    	
    	 loginPage.launchURL(prop.getProperty("URL"));
 		loginPage.appLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
 		projectpage.ProjectCreation(prop.getProperty("ProjectName"),prop.getProperty("Description1"));
 		Thread.sleep(5000);	 
 		
     }
     
     
     
     @Test
     public void CreateNewTasks() throws InterruptedException {
    	 loginPage.launchURL(prop.getProperty("URL"));
  		loginPage.appLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
 		taskpage.TaskCreation(prop.getProperty("TaskName"));
  		Thread.sleep(5000);
  		 
     }
}
