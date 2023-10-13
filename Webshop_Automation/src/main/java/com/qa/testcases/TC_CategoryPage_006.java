package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.CategoryPage;
import com.qa.pages.LoginPage;

public class TC_CategoryPage_006 extends BaseClass {
	
	LoginPage lp;
	
	@Test(priority=1)
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}
	
	

	@Test(priority=2)
	    public void doLogin(){
	        lp = new LoginPage(driver);
	        lp.loginCred("mahin@gmail1.com", "pass123");
			lp.login();
			
		}
	
	@Test(priority=3)
	public void test2() {
		CategoryPage cp=new CategoryPage(driver);
		cp.goToCategoryPage();
		cp.selectProduct(3);
	}
	
	@Test(priority=4)
	public void test3() throws InterruptedException {
		CategoryPage cp=new CategoryPage(driver);
		
		cp.addQuantity(6);
	}
	
	@Test(priority=5)
    public void doLogOut() throws InterruptedException{
        lp = new LoginPage(driver);
        Thread.sleep(3000);
        lp.logout();
        driver.quit();
		
	}

}
