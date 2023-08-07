package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.ProductDetailsPage;

public class TC_ProductDetailsPage_005 extends BaseClass {
	
	
	@Test(priority=1)
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}

//	
//	@Test(priority=2)
//	public void checkFeaturedProduct() throws InterruptedException {
//		HomePage hp=new HomePage(driver);
//		hp.featuredProducts();
//		
//	}
	
	@Test(priority=2)
	public void Quantity() throws InterruptedException  {
		ProductDetailsPage pp=new ProductDetailsPage(driver);
		pp.addQuantity(3);
		
		
	}
}
