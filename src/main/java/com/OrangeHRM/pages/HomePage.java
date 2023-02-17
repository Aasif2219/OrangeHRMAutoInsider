package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage{
	WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Admin']")
	WebElement adminTab;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public SystemUserPage clickOnAdmin() {
		adminTab.click();
		return new SystemUserPage(driver);
	}

}
