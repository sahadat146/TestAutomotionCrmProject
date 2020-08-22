package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;

public class ContactsPage extends TestBase {
    @FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[1]")
    WebElement Contactslavel;
   	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]")
	WebElement clickon_TicMark1;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]")
	WebElement clickon_TicMark2;
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[1]")
	WebElement createContactLevel;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/input")
	WebElement lastName;
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[1]")
	WebElement clickOnCancel;
	/*
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement company;
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement saveBtn;
	
	*/
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean verifyContactLabel() {
		return Contactslavel.isDisplayed();
	}
	//public boolean verifyfirstnameofnewContacpage() {
		//return firstnamee.isDisplayed();
	public void click_on_ticmrk1() {
		clickon_TicMark1.click();
	}
	
	public void click_on_ticmrk2() {
		clickon_TicMark2.click();
	}
	public boolean verifyNewContactPagek() {
		 return createContactLevel.isDisplayed();
	}
	public void clickOnCancelButtom()
	{
		clickOnCancel.click();
	}
	public void createnewContact(String fstname,String lstname) {
	
	firstName.sendKeys(fstname);
	lastName.sendKeys(lstname);
	}
}
