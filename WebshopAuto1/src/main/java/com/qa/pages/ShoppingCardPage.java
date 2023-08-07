package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class ShoppingCardPage extends BaseClass {
	public ShoppingCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
  
	@FindBy (xpath="//a[@class='ico-cart']")
	WebElement title;
	  
	
	public void goToShoopingCard() throws InterruptedException {
		
		title.click();
	}
	
}
