package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;


	@FindBy(id="username")
	private static WebElement username;
	
	@FindBy(id="password")
	private static WebElement password;
	
	@FindBy(id="login")
	private static WebElement login;
	
	public LoginPage (WebDriver driver) {
		  this.driver = driver;
		  PageFactory.initElements(driver, this);
	
	}
	
	public static WebElement getUsername() {
		return username;

	}
	
	public static WebElement getPassword() {
		return password;
	}
	public static WebElement onLogin() {
return login;
	}
}
