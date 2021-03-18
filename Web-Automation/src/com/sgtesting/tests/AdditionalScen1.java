package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalScen1
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		loginasusername1();
		createuser2();
		modifyuser2();
		logout();
		loginasuser2();
		createuser3();
		logout();
		login();
		user1passwordchange();
		logout();
		loginaschangepassworduser1();
		logout();
		loginasuser2();
		deleteuser3();
		logout();
		loginaschangepassworduser1();
		deleteuser2();
		logout();
		login();
		deleteuser1();
		logout();
		closeapplication();
		
	}
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user");
			oBrowser.findElement(By.name("lastName")).sendKeys("1");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("password")).sendKeys("123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasusername1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user");
			oBrowser.findElement(By.name("lastName")).sendKeys("2");
			oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("password")).sendKeys("123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("456");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("456");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("456");
			Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//a[@id='loginButton']")).click();
			//Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//*[@id=\'SubmitTTButton\']")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user");
			oBrowser.findElement(By.name("lastName")).sendKeys("3");
			oBrowser.findElement(By.name("email")).sendKeys("user3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			oBrowser.findElement(By.name("password")).sendKeys("123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user1passwordchange()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
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
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@id='loginButton']")).click();
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
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='3, user']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='2, user']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
	static void deleteuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
	static void closeapplication()
	{
		try
		{
			oBrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}
}
