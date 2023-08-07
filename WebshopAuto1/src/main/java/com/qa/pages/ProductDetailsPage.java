package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class ProductDetailsPage extends BaseClass {
	
	 @FindBy(xpath="//input[@class='qty-input']")
	 WebElement quantity;
	//input[@type='button']
	 @FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
	 WebElement add;
	 
	public ProductDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void addQuantity(int q) throws InterruptedException {
		//quantity.sendKeys(String.valueOf(q));// to sent integer need to use String.valueOf
		HomePage  hp=new HomePage(driver);
		hp.featuredProducts.get(3).click();
		Thread.sleep(3000);
		quantity.clear();
		Thread.sleep(3000);
		quantity.sendKeys(String.valueOf(q));
		Thread.sleep(3000);
		add.click();
		hp.title.click();
	}

}
