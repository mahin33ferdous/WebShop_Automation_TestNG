package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.CategoryPage;
import com.qa.pages.LoginPage;
import com.qa.pages.ShoppingCardPage;

public class TC_ShoppingCard_007  extends BaseClass {
	
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
	 public void test4() throws InterruptedException {
		ShoppingCardPage sp=new ShoppingCardPage(driver);
		sp.goToShoopingCard();
		
	}
	
	
//	 @Test(priority=4)
//	 public void test4()
//	 
//	 {
//		 cp.goToCategoryPage();
	//cp.selectProduct(6);
//		
//		 sp.goToShoopingCard();
//		 
//	 }

}
