package com.OrangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.base.BaseClass;
import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;
import com.OrangeHRM.pages.NationalitiesPage;
import com.OrangeHRM.pages.SystemUserPage;

public class SystemUserPageTest extends BaseClass {
	
	HomePage home;
	LoginPage login;
	SystemUserPage sysuser;
	NationalitiesPage nationalities;
	
	@Test(priority=4)
	public void validatenationalities() throws InterruptedException {
		test=extent.createTest("validatenationalities");
		login = new LoginPage(driver);
		home=login.ValidateLogin("Admin", "admin123");
		Thread.sleep(5000);
		sysuser=home.clickOnAdmin();
		Thread.sleep(5000);
		nationalities=sysuser.nationalitiesTest();
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/admin/nationality";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
		
	}

}
