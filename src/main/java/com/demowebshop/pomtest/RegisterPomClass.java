package com.demowebshop.pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPomClass {

	 WebDriver driver;

	public RegisterPomClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement Firstname;
	
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement Lastname;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement Confirmpassword;
	
	@FindBy(xpath = "//input[@id='register-button']")
	private WebElement registerbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmpassword() {
		return Confirmpassword;
	}

	public WebElement getRegisterbtn() {
		return registerbtn;
	}
	
	
}
