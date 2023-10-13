package com.qa.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

public class ShoppingCardPage extends BaseClass {
	public ShoppingCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
  
	@FindBy (xpath="//a[@class='ico-cart']")
	WebElement title;
	
	
	@FindBy (xpath="//*[@id=\"CountryId\"]")
	WebElement dropDownCountry;
	
	@FindBy (xpath="//*[@id=\"ZipPostalCode\"]")
	WebElement postalCode;
	
	@FindBy (xpath="//*[@id=\"checkout\"]")
	WebElement checkout;
	
	@FindBy (xpath="//*[@id=\"termsofservice\"]")
	WebElement acceptTerm;
	
	@FindBy (xpath="/html/body/div[5]/div[1]/button/span[1]")
	WebElement alertClose;
	
	@FindBy (xpath="//*[@onclick='Billing.save()']")
	WebElement countinue1;
	
	@FindBy (xpath="//*[@onclick='Shipping.save()']")
	WebElement countinue2;	
	
	@FindBy (xpath="//*[@class='button-1 shipping-method-next-step-button']")
	WebElement countinue3;
	
	@FindBy (xpath="//*[@class='button-1 payment-method-next-step-button']")
	WebElement countinue4;
	
	@FindBy (xpath="//*[@class='button-1 payment-info-next-step-button']")
	WebElement countinue5;
	
	@FindBy (xpath="//*[@class='button-1 confirm-order-next-step-button']")
	WebElement countinue6;
	
	@FindBy (xpath="//*[@class='button-2 order-completed-continue-button']")
	WebElement countinueCompleted;
	
	
	public void goToShoopingCard() throws InterruptedException {
		
		title.click();
	}
	
	public int totalCountry() {
		Select select=new Select(dropDownCountry);
		List<WebElement>list=select.getOptions();
		int totalOption=list.size();
		System.out.println("total option:"+totalOption);
		return totalOption;
	}
	public void shoppingCardInfo(int country,String postalcode) throws InterruptedException {
		
		Select select=new Select(dropDownCountry);
		select.selectByIndex(5);
		Thread.sleep(3000);
		postalCode.clear();
		Thread.sleep(3000);
		postalCode.sendKeys(postalcode);
		checkout.click();
		Thread.sleep(3000);
		alertClose.click();
		Thread.sleep(3000);
		acceptTerm.click();
		checkout.click();
		Thread.sleep(3000);
		
		countinue1.click();
		Thread.sleep(3000);
		countinue2.click();
		Thread.sleep(3000);
		countinue3.click();
		Thread.sleep(3000);
		countinue4.click();
		Thread.sleep(3000);
		countinue5.click();
		Thread.sleep(3000);
		countinue6.click();
		Thread.sleep(3000);
		countinueCompleted.click();
		Thread.sleep(3000);
		
	}
	
}
