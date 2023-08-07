package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.CategoryPage;

public class TC_CategoryPage_006 extends BaseClass {
	
	
	@Test(priority=1)
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}
	
	
	@Test(priority=2)
	public void test2() {
		CategoryPage cp=new CategoryPage(driver);
		cp.goToCategoryPage();
		cp.selectProduct(3);
	}
	
	@Test(priority=3)
	public void test3() throws InterruptedException {
		CategoryPage cp=new CategoryPage(driver);
		
		cp.addQuantity(6);
	}

}
