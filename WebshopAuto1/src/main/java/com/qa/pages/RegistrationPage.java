package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class RegistrationPage extends BaseClass {
   
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[@class='ico-register']")
	WebElement registerButton;
	
	@FindBy (xpath="//input[@id='gender-female']")
	WebElement gender;
	
	@FindBy (xpath="//input[@id='FirstName']")
	WebElement firstName;
	
	@FindBy (xpath="//input[@id='LastName']")
	WebElement lastName;
	
	@FindBy (xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy (xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy (xpath="//input[@id='ConfirmPassword']")
	WebElement confirmPassword;
	
	@FindBy (xpath="//input[@id='register-button']")
	WebElement submitButton;
	
	@FindBy (xpath="//a[@class='account']")
	WebElement account;
	
	public void registerUser(String f,String l,String e) {
		registerButton.click();
		gender.click();
		firstName.sendKeys(f);
		lastName.sendKeys(l);
		email.sendKeys(e);
	}
	
	public void registerPassword(String pass, String cpass) {
		password.sendKeys(pass);
		confirmPassword.sendKeys(cpass);
	}
	
	public void registerSubmit() {
		submitButton.click();
	}
	
	public String getUser() {
		String acc=account.getText();
		return acc;
	}
}
