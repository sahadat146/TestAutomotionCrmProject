package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
	super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}
	@Test(priority=1)
	public void loginPagetitleTest() {
		String title=loginPage.validateLoginPageTitle();	

	}
	@Test(priority=2)
	public void crmLogoImageTest() {
		boolean flag=loginPage.validateCRMImage();
		
	}
	
	@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	@AfterMethod
	public void tearDown()
	{	
		driver.quit();
	}
	}
