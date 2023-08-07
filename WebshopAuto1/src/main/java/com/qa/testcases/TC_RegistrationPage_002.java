package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.RegistrationPage;

public class TC_RegistrationPage_002 extends BaseClass {
  
	@Test(priority=1)
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority=2)
	public void test2() {
		RegistrationPage rp=new RegistrationPage(driver);
		rp.registerUser("Mahin","Ferdous","mahin@gmail1.com");
		rp.registerPassword("pass123", "pass123");
		rp.registerSubmit();
	}
	
	@Test(priority=3)
	public void checkUser() {
		RegistrationPage rp=new RegistrationPage(driver);
		String actualUser=rp.getUser();
		String expectedUser="mahin@gmail1.com";
		Assert.assertEquals(actualUser,expectedUser );
		
		driver.quit();
	}
}
