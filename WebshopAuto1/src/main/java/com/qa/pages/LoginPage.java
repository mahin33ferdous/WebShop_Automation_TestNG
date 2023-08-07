package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		
	
	@FindBy (xpath="//a[@class='ico-login']")
	WebElement LoginButton;
	
	@FindBy (xpath="//input[@class='email']")
	WebElement email ;
	
	@FindBy (xpath="//input[@class='password']")
	WebElement password ;
	
	@FindBy (xpath="//input[@class='button-1 login-button']")
	WebElement loginSubmit ;
	
	@FindBy (xpath="//a[@class='account']")
	WebElement account;
	
	@FindBy (xpath="//a[@class='ico-logout']")
	WebElement logOuitSubmit ;
	
	
	
	
	 
	
	public void loginCred(String e,String p) {
		LoginButton.click();
	
		email.sendKeys(e);
		password.sendKeys(p);
	}
	
	public void login() {
		loginSubmit.click();
	}
	
	public String getUser() {
		String acc=account.getText();
		return acc;
	}
	
	public void logout() {
		logOuitSubmit.click();
	}
}
	
	
	

