package com.sgtesting.pageobjectmodel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage 
{
	
	WebDriver oBrowser=null;
	public ActiTimePage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		PageFactory.initElements(oBrowser, this);
	}
	//UserName text field WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//Password text field WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//FlyoutWindow WebElement
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout Link WebElement
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	
	
	//user creation
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
	private WebElement User;
	public WebElement getUser()
	{
		return User;
	}
	
	//Add user1
	@FindBy(xpath="//*[@id='createUserDiv']/div")
	private WebElement AddUser;
	public WebElement getAddUser()
	{
		return AddUser;
	}

	
	//User1 Creation information
	//FirstName text field WebElement
	@FindBy(xpath="//*[@id='userDataLightBox_firstNameField']")
		private WebElement firstName;
		public WebElement getFirstName()
		{
			return firstName;
		}
		
		//LastName text field WebElement
		@FindBy(xpath="//*[@id='userDataLightBox_lastNameField']")
		private WebElement lastName;
		public WebElement getLastName()
		{
			return lastName;
		}
		
		//Email text field WebElement
		@FindBy(xpath="//*[@id='userDataLightBox_emailField']")
		private WebElement email;
		public WebElement getEmail()
		{
			return email;
		}
		
		//Login Details
		//Username text field WebElement
		@FindBy(xpath="//*[@id='userDataLightBox_usernameField']")
		private WebElement username1;
		public WebElement getUsername()
		{
			return username1;
		}
		
		//Password text field WebElement
		@FindBy(xpath="//*[@id='userDataLightBox_passwordField']")
		private WebElement password;
		public WebElement getPasswordforUser()
		{
			return password;
		}
		
		
		//Retype Password text field WebElement
		@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
		private WebElement passwordCopy;
		public WebElement getRetypePWDforUser()
		{
			return passwordCopy;
		}
		
		//CreateUser text field WebElement
		@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']")
		private WebElement userDataLightBox_commitBtn;
		public WebElement getUserCreation()
		{
			return userDataLightBox_commitBtn;
		}
		
		
		//delete user
		
		//to delete user1
		@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement delete;
		public WebElement getdeleteuser1()
		{
			return delete;
		}
		
		//delete user1
		@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
		private WebElement user;
		public WebElement getuser1delete()
		{
			return user;
		}
		
		//modify user1
		
		//user modification text field WebElement
		@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement moduser;
		public WebElement getEmailUser()
		{
			return moduser;
		}
		
		
		//Email text field WebElement
		@FindBy(xpath="//*[@id='userDataLightBox_emailField']")
		private WebElement modifiedemail;
		public WebElement getmodifiedEmail()
		{
			return modifiedemail;
		}
		
		
		//to save modified user1
		@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
		private WebElement savemodifieduser;
		public WebElement getsavemodifieduser()
		{
			return savemodifieduser;
		}
		
		//Create Customer
		
		//create customer1
		@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[3]/a")
		private WebElement taskcreation;
		public WebElement getCreateTask()
		{
			return taskcreation;
		}
		
		// add new for task
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")
		private WebElement addnewtask;
		public WebElement getAddNewTask()
		{
			return addnewtask;
		}
		
		//create customer
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement createcustomer;
		public WebElement getCreateCustomer()
		{
			return createcustomer;
		}
		
		//create new customer
		private WebElement customerLightBox_nameField;
		public WebElement getCreateNewCustomer()
		{
			return customerLightBox_nameField;
		}
		
		//to save new customer
		private WebElement customerLightBox_commitBtn;
		public WebElement getSaveNewCustomer()
		{
			return customerLightBox_commitBtn;
		}
		
		//to delete customer
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement NewcustomerButton;
		public WebElement getNewCustomerButton()
		{
			return NewcustomerButton;
		}
		
		//to delete customer actions
		@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")
		private WebElement deleteactions;
		public WebElement getDeleteCustomer()
		{
			return deleteactions;
		}
		
		//to delete action
		@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
		private WebElement deletecustomer;
		public WebElement getCustomerDelete()
		{
			return deletecustomer;
		}
		
		//to delete customer permanently
		@FindBy(xpath="//*[@id='customerPanel_deleteConfirm_submitBtn']/div")
		private WebElement deletecustomerconfirmation;
		public WebElement getCustomerDeleteConfirmation()
		{
			return deletecustomerconfirmation;
		}
		
		
		//Modify Customer
		//Customer Button click
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement modifyCustomer;
		public WebElement getModifyCustomer()
		{
			return modifyCustomer;
		}
		
		//customer description
		@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[1]")
		private WebElement CustomerDescription;
		public WebElement getModifyCustomerDescription()
		{
			return CustomerDescription;
		}
		
		//To enter customer description
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
		private WebElement EnterCustomerDescription;
		public WebElement getEnterModifyCustomerDescription()
		{
			return EnterCustomerDescription;
		}
		
		
		// go back to customer
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement AftermodifyCustomer;
		public WebElement getAfterModifyCustomer()
		{
			return AftermodifyCustomer;
		}

		
		//add new to create new project
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")
		private WebElement AddNewCreateproject;
		public WebElement getAddNewToCreateProject()
		{
			return AddNewCreateproject;
		}
		
		//new project
		@FindBy(xpath="/html/body/div[14]/div[2]")
		private WebElement Createproject;
		public WebElement getCreateProject()
		{
			return Createproject;
		}
		
		//Enter project name
		private WebElement projectPopup_projectNameField;
		public WebElement getProjectName()
		{
			return projectPopup_projectNameField;
		}
		
		//new project
		//@FindBy(xpath="/html/body/div[14]/div[2]")
		private WebElement projectPopup_commitBtn;
		public WebElement getSaveCreateProject()
		{
			return projectPopup_commitBtn;
		}
		
		//to delete project button
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement projectdeletebutton;
		public WebElement getProjectDeleteButton()
		{
			return projectdeletebutton;
		}
		
		
		// to delete project action
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")
		private WebElement projectdeletebuttonaction;
		public WebElement getProjectDeleteButtonAction()
		{
			return projectdeletebuttonaction;
		}
		
		// to delete project
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
		private WebElement projectdelete;
		public WebElement getProjectDelete()
		{
			return projectdelete;
		}
		
		// to delete project permanently
		@FindBy(xpath="//*[@id='projectPanel_deleteConfirm_submitBtn']/div")
		private WebElement projectdeletepermanently;
		public WebElement getProjectDeletePermanently()
		{
			return projectdeletepermanently;
		}
		
		//to modify project
		
		// to modify the customer click button
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement projectmodifybutton;
		public WebElement getModifyProjectButton()
		{
			return projectmodifybutton;
		}
		
		//to enter modified project description
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
		private WebElement projectdescriptionmodification;
		public WebElement getProjectModificationDescription()
		{
			return projectdescriptionmodification;
		}
		
		//to return modified project
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement projectdescriptionmodificationsave;
		public WebElement getProjectModificationDescriptionsave()
		{
			return projectdescriptionmodificationsave;
		}
		
		//to create task
		
		//to add new task
		@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div")
		private WebElement addnewtaskclick;
		public WebElement getNewTaskClick()
		{
			return addnewtaskclick;
		}
		
		//to create new task
		@FindBy(xpath="/html/body/div[13]/div[1]")
		private WebElement createnewtaskclick;
		public WebElement getCreateNewTask()
		{
			return createnewtaskclick;
		}
		
		
		//to enter task name
		@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
		private WebElement entertaskname;
		public WebElement getEnterTaskName()
		{
			return entertaskname;
		}
		
		//to save create task
		private WebElement createTasksPopup_commitBtn;
		public WebElement getSaveTaskName()
		{
			return createTasksPopup_commitBtn;
		}
		
		//to delete task
		
		//click on task button
		@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
		private WebElement todeleteclickontask;
		public WebElement getClickOnTask()
		{
			return todeleteclickontask;
		}
		
		//click on actions
		@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div")
		private WebElement clickonactions;
		public WebElement getClickOnActions()
		{
			return clickonactions;
		}
		
		//click on delete
		@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")
		private WebElement deletetask;
		public WebElement getDeleteTask()
		{
			return deletetask;
		}
		
		//to delete permanently
		private WebElement taskPanel_deleteConfirm_submitTitle;
		public WebElement getDeletePermanently()
		{
			return taskPanel_deleteConfirm_submitTitle;
		}
		
		// to modify the task
		
		// to click on task button
		@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
		private WebElement clickontasktomodify;
		public WebElement getClickOnTaskTomodify()
		{
			return clickontasktomodify;
		}
		
		// to enter the description for task
		@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[1]/textarea")
		private WebElement enterthedescriptiontotask;
		public WebElement getDescriptionToModifyTask()
		{
			return enterthedescriptiontotask;
		}
		
		//go back to task after modified task
		@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[1]/div[1]")
		private WebElement aftermodifiedtask;
		public WebElement getAfterModifiedTask()
		{
			return aftermodifiedtask;
		}
		
		
		//welcome screen for user1
		@FindBy(xpath="//*[@id='welcomeScreenBoxId']/div[3]/div")
		private WebElement welcomescreenforuser1;
		public WebElement getWelcomeScreenExploreforUser1()
		{
			return welcomescreenforuser1;
		}
		
		
		//modify user2 only for password
		//click on user2
		@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement clickoncnuser2;
		public WebElement getclickonuser2button()
		{
			return clickoncnuser2;
		}
		
		//save modified user2 password
		@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div")
		private WebElement user2savemodifiedpassword;
		public WebElement getsaveuser2modifiedpassword()
		{
			return user2savemodifiedpassword;
		}
		
		//to click on user to modify user1 password
		@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
		private WebElement clickonuserformodification;
		public WebElement getUserForModificationClick()
		{
			return clickonuserformodification;
		}
		
		
		//modify user1 only for password
		//click on user1
		@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
		private WebElement clickonuser1;
		public WebElement getclickonuser1button()
		{
			return clickonuser1;
		}
				
	
		
		
		
		//modify user3 only for password
				//click on user3
				@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
				private WebElement clickoncnuser3;
				public WebElement getclickonuser3button()
				{
					return clickoncnuser3;
				}
				
				//save modified user3 password
				@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div")
				private WebElement user3savemodifiedpassword;
				public WebElement getsaveuser3modifiedpassword()
				{
					return user3savemodifiedpassword;
				}	
			
		//to delete user for user click
				@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
				private WebElement clickonuser;
				public WebElement getclickonuserbutton()
				{
					return clickonuser;
				}		
				
				
		//to delete user1
				@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
				private WebElement deleteuser1;
				public WebElement getdeleteuser1click()
				{
					return deleteuser1;
				}	
				
			// to delete user1 action
				private WebElement userDataLightBox_deleteBtn;
				public WebElement getdeleteuser1action()
				{
					return userDataLightBox_deleteBtn;
				}
				
				//to delete user2
				@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
				private WebElement deleteuser2;
				public WebElement getdeleteuser2click()
				{
					return deleteuser1;
				}	
				
			// to delete user2 action
				@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
				private WebElement user2deleteaction;
				public WebElement getdeleteuser2action()
				{
					return user2deleteaction;
				}
				
				//to delete user3
				@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
				private WebElement deleteuser3;
				public WebElement getdeleteuser3click()
				{
					return deleteuser1;
				}	
				
			// to delete user3 action
				@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
				private WebElement user3deleteaction;
				public WebElement getdeleteuser3action()
				{
					return user3deleteaction;
				}
				
				
		// to delete user3 for login as user2
			//to delete user3 for user xpath
				@FindBy(xpath="//a[@class='content users']")
				private WebElement user3xpath;
				public WebElement getUser3Delete()
				{
					return user3xpath;
				}
				
			//to delete user3 click button
				@FindBy(xpath="//span[text()='3, user']")
				private WebElement user3click;
				public WebElement getUser3PathClick()
				{
					return user3click;
				}
				
			//to delete user3
				@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
				private WebElement deleteuser3action;
				public WebElement getUser3deleteClick()
				{
					return deleteuser3action;
				}
				
				// to delete user2 for login as user1
				//to delete user2 for user xpath
					@FindBy(xpath="//a[@class='content users']")
					private WebElement user2xpath;
					public WebElement getUser2Delete()
					{
						return user2xpath;
					}
					
				//to delete user2 click button
					@FindBy(xpath="//span[text()='2, user']")
					private WebElement user2click;
					public WebElement getUser2PathClick()
					{
						return user2click;
					}
					
				//to delete user2
					@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
					private WebElement deleteuser2action;
					public WebElement getUser2deleteClick()
					{
						return deleteuser2action;
					}
}
