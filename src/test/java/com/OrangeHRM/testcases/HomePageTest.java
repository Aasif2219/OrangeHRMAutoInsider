package com.OrangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.base.BaseClass;
import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;
import com.OrangeHRM.pages.SystemUserPage;

public class HomePageTest extends BaseClass {
	
	HomePage home;
	LoginPage login;
	SystemUserPage sysuser;
	
	@Test(priority=3)
	public void adminTabTest() throws InterruptedException {
		test=extent.createTest("adminTabTest");
		login = new LoginPage(driver);
		home=login.ValidateLogin("Admin", "admin123");
		Thread.sleep(5000);
		sysuser=home.clickOnAdmin();
		Thread.sleep(5000);
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}

}
