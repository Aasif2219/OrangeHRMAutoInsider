package com.OrangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.base.BaseClass;
import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	HomePage home;
	LoginPage login;

	@Test(priority=1)
	public void verifyLogo() {
		test=extent.createTest("verifyLogo");
		LoginPage login = new LoginPage(driver);
		boolean flag=login.validateLogo();
		Assert.assertTrue(false);
		
	}
	
	@Test(priority=2)
	public void loginTest() throws InterruptedException {
		test=extent.createTest("loginTest");
		login = new LoginPage(driver);
		home = login.ValidateLogin("Admin", "admin123");
		Thread.sleep(5000);
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}

}
