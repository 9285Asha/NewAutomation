package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 
{
	public static WebDriver oBrowser=null; 
	public static ActiTimePage oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
		logout();
		closeApplication();
	}
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createCustomer()
	{
		try
		{
			oPage.getCreateTask().click();
			Thread.sleep(2000);
			oPage.getAddNewTask().click();
			Thread.sleep(2000);
			oPage.getCreateCustomer().click();
			Thread.sleep(2000);
			oPage.getCreateNewCustomer().sendKeys("Customer1");
			Thread.sleep(2000);
			oPage.getSaveNewCustomer().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void modifyCustomer()
	{
		try
		{
			oPage.getModifyCustomer().click();
			Thread.sleep(2000);
			//oPage.getCreateCustomer().clear();
			//Thread.sleep(2000);
			oPage.getEnterModifyCustomerDescription().sendKeys("Modified Statement");
			Thread.sleep(2000);
			oPage.getAfterModifyCustomer().click();
			Thread.sleep(2000);
			//oBrowser.switchTo().alert().accept();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteCustomer()
	{
		try
		{
			oPage.getNewCustomerButton().click();
			Thread.sleep(2000);
			oPage.getDeleteCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomerDelete().click();
			Thread.sleep(2000);
			oPage.getCustomerDeleteConfirmation().click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
