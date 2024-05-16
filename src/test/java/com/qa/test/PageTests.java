package com.qa.test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPageObject;

import resources.BaseClassOne;

public class PageTests extends BaseClassOne {
 public WebDriver driver;
 Properties prop;

@Test
public void login()throws IOException {
	LoginPageObject lpt = new LoginPageObject(driver);
	lpt.userName().sendKeys(prop.getProperty("Username"));
	lpt.password().sendKeys(prop.getProperty("Password"));
	lpt.submitButton().click();
	
	
	
	
	
}

@AfterTest
public void close() {
	driver.close();
}


@BeforeTest
public void start() throws IOException {
	driver= intilizingBrowser();
	driver.get(prop.getProperty("urlfeild"));
}




}
