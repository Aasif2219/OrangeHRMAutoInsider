package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NationalitiesPage {
	WebDriver driver;
	
	public NationalitiesPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
	}
