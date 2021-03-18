package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenarion2 
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		creatUser1();
		creatUser2();
		creatUser3();
		logout();
		loginasusername1();
		logout();
		loginasusername2();
		logout();
		loginasusername3();
		logout();
		login();
		user1passwordchange();
		user2passwordchange();
		user3passwordchange();
		logout();
		loginaschangepassworduser1();
		logout();
		loginaschangepassworduser2();
		logout();
		loginaschangepassworduser3();
		logout();
		login();
		deleteuser1();
		deleteuser2();
		deleteuser3();
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
	public static void creatUser1()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("user");
			Thread.sleep(2000);
			oPage.getLastName().sendKeys("1");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("user1@gmail");
			Thread.sleep(2000);
			oPage.getUsername().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getPasswordforUser().sendKeys("123");
			Thread.sleep(2000);
			oPage.getRetypePWDforUser().sendKeys("123");
			Thread.sleep(2000);
			oPage.getUserCreation().click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void creatUser2()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("user");
			Thread.sleep(2000);
			oPage.getLastName().sendKeys("2");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("user2@gmail");
			//Thread.sleep(2000);
			oPage.getUsername().sendKeys("user2");
			//Thread.sleep(2000);
			oPage.getPasswordforUser().sendKeys("123");
			//Thread.sleep(2000);
			oPage.getRetypePWDforUser().sendKeys("123");
			//Thread.sleep(2000);
			oPage.getUserCreation().click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void creatUser3()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("user");
			Thread.sleep(2000);
			oPage.getLastName().sendKeys("3");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("user3@gmail");
			Thread.sleep(2000);
			oPage.getUsername().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getPasswordforUser().sendKeys("123");
			Thread.sleep(2000);
			oPage.getRetypePWDforUser().sendKeys("123");
			Thread.sleep(2000);
			oPage.getUserCreation().click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasusername1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getWelcomeScreenExploreforUser1().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasusername2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getWelcomeScreenExploreforUser1().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasusername3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getWelcomeScreenExploreforUser1().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user1passwordchange()
	{
		try
		{
			oPage.getUserForModificationClick().click();
			Thread.sleep(2000);
			oPage.getclickonuser1button().click();
			Thread.sleep(2000);
			oPage.getPasswordforUser().sendKeys("456");
			Thread.sleep(2000);
			oPage.getRetypePWDforUser().sendKeys("456");
			Thread.sleep(2000);
			oPage.getsaveuser2modifiedpassword().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user2passwordchange()
	{
		try
		{
			oPage.getUserForModificationClick().click();
			Thread.sleep(2000);
			oPage.getclickonuser2button().click();
			Thread.sleep(2000);
			oPage.getPasswordforUser().sendKeys("456");
			Thread.sleep(2000);
			oPage.getRetypePWDforUser().sendKeys("456");
			Thread.sleep(2000);
			oPage.getsaveuser2modifiedpassword().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user3passwordchange()
	{
		try
		{
			oPage.getUserForModificationClick().click();
			Thread.sleep(2000);
			oPage.getclickonuser3button().click();
			Thread.sleep(2000);
			oPage.getPasswordforUser().sendKeys("456");
			Thread.sleep(2000);
			oPage.getRetypePWDforUser().sendKeys("456");
			Thread.sleep(2000);
			oPage.getsaveuser2modifiedpassword().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginaschangepassworduser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("456");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			//oPage.getWelcomeScreenExploreforUser1().click();
			//Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginaschangepassworduser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("456");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			//oPage.getWelcomeScreenExploreforUser1().click();
			//Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginaschangepassworduser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("456");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			//oPage.getWelcomeScreenExploreforUser1().click();
			//Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	static void deleteuser1()
	{
		try
		{
			oPage.getclickonuserbutton().click();
			Thread.sleep(2000);
			oPage.getdeleteuser1click().click();
			Thread.sleep(2000);
			oPage.getdeleteuser1action().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser2()
	{
		try
		{
			oPage.getclickonuserbutton().click();
			Thread.sleep(2000);
			oPage.getdeleteuser2click().click();
			Thread.sleep(2000);
			oPage.getdeleteuser2action().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser3()
	{
		try
		{
			oPage.getclickonuserbutton().click();
			Thread.sleep(2000);
			oPage.getdeleteuser3click().click();
			Thread.sleep(2000);
			oPage.getdeleteuser3action().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
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
