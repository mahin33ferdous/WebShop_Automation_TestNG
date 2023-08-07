package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class CategoryPage extends BaseClass {
	   
		public CategoryPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//div[@class='picture']/a/img")
		List <WebElement> productItem;
		
		@FindBy(xpath="//span[@class='cart-qty']")
		List <WebElement> cartQuantity;
		
		//span[@class='cart-qty']
		
		public void goToCategoryPage() {
			HomePage hp=new HomePage(driver);
			hp.CategoriesLinks.get(3).click();
		}
		
		public void selectProduct(int index) {
			
			productItem.get(index).click();
			
		}
		
		public void addQuantity(int q) throws InterruptedException {
			ProductDetailsPage pp=new ProductDetailsPage(driver);
			pp.ChangeQuantity(q);
		}
		
	
}
