package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.ContactsPage;
import com.pages.DealsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.TasksPage;

import util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	TasksPage taskPage;
	DealsPage dealsPage;
	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		taskPage=new TasksPage();
		dealsPage=new DealsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest(){
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void click_on_ContactsLinkTest(){

		contactsPage = homePage.clickOnContactsLink();
	}
	
	@Test(priority=4)
	public void clickOntasksLink(){
		taskPage=homePage.clickOnTasksLink();
		
	}
	
	@Test(priority=5)
	public void clickOnDealsLinkLink(){
		dealsPage=homePage.clickOnDealsLink();
	}
	@Test(priority=1)
	public void cliclOnNewContactButton() {
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
