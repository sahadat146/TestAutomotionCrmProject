package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[3]/span[1]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath="//*[@id=\"main-nav\"]/a[3]/span")  
	WebElement contactsLink;
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button") 
	WebElement newContactLink;
	

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[5]/span")
	WebElement dealsLink;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[6]/span")
	WebElement tasksLink;

	
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink(){
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink(){
		newContactLink.click();
		
	}
}
