package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;

public class TC_LoginPage_003 extends BaseClass {
	@Test(priority=1)
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority=2)
	public void test2() {
		LoginPage lp=new LoginPage(driver);
		lp.loginCred("mahin@gmail1.com", "pass123");
		lp.login();
	}
	
	@Test(priority=3)
	public void checkUser() {
		LoginPage lp=new LoginPage(driver);
		String actualUser=lp.getUser();
		String expectedUser="mahin@gmail1.com";
		Assert.assertEquals(actualUser,expectedUser );
	}
}
