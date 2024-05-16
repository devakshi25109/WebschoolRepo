package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
WebDriver driver;


public LoginPageObject(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver,this);
	}

@FindBy(id="UserLogin_username")
WebElement userName;

public WebElement userName() {
	return userName;
}

@FindBy(id="UserLogin_password")
WebElement password;

public WebElement password() {
	return password;
}


@FindBy (xpath = "//input[@type='submit']")
WebElement submitButton;


public WebElement submitButton() {
	return submitButton;
}








}
