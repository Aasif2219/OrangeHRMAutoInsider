package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemUserPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[normalize-space()='Nationalities']")
	WebElement nationalitiesTab;
	
	
	public SystemUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public NationalitiesPage nationalitiesTest() {
		nationalitiesTab.click();
		return new NationalitiesPage(driver);
	}

}
