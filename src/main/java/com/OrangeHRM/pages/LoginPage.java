package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement loginLogo;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogo() {
		loginLogo.isDisplayed();
		return true;
	}
	
	public HomePage ValidateLogin(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
		return new HomePage(driver);
	}
	

}
