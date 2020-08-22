package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.ContactsPage;
import com.pages.HomePage;
import com.pages.LoginPage;

import util.TestUtil;

public class ContactsPageTest extends TestBase {
	

		LoginPage loginPage;
		HomePage homePage;
		TestUtil testUtil;
		ContactsPage contactsPage;
			   
		public ContactsPageTest(){
				super();
				
		}
		
		
		@BeforeMethod
		public void setUp() {
			
			initialization();
		//	testUtil = new TestUtil();
			contactsPage = new ContactsPage();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
			contactsPage = homePage.clickOnContactsLink();
		}
	
		@Test(priority=3)
		public void verifycontactlavel() {
		Assert.assertTrue(contactsPage.verifyContactLabel(),"contact lavel is missing ");
		}
		@Test(priority=2)
		public void verifynewzcontactLevel() {
			Assert.assertTrue(contactsPage.verifyNewContactPagek(), "new contact lavel is messiong");
		}
		@Test(priority=1)
		public void clickonbutton()
		{
			homePage .clickOnContactsLink();
			contactsPage.clickOnCancelButtom();
		}
		/*l
		@Test(priority=2)
		public void clickOnNewButton() {
			contactsPage.clickOnNewContacLink();
		}
		
	    @Test(priority=1)
		public void verifyNewContacPage() {
			contactsPage.clickOnNewContacLink();
			contactsPage.verifyfirstnameofnewContacpage();
		}
			
		@Test(priority=2)
		public void fillthe_Name()
		{
			homePage .clickOnContactsLink();
			//contactsPage.clickOnNewContacLink();
			contactsPage.createnewContact("tom", "pitter");
			
		}
		
	
		@Test(priority=6)
		
		public void selectSingleContactsTest(){
			//homePage.clickOnContactsLink();
			contactsPage.click_on_ticmrk1();
		}
		
		@Test(priority=2)
		public void selectMultipleContactsTest(){
			//homePage.clickOnContactsLink();
			contactsPage.click_on_ticmrk2();
			

		}
		
			*/
		

		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		
	}
		

