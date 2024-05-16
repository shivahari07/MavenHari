package com.testrunner;

import org.openqa.selenium.WebDriver;

import com.Sdp.PageObjectManager;

import baseClass.BaseClass;

public class PoMMM extends BaseClass {
	
	public static WebDriver driver = BaseClass.browserlaunch("chrome");
	public static PageObjectManager pom= new PageObjectManager(driver);
	public static void main(String[] args) {
		driver = getUrl("https://adactinhotelapp.com/");
		driver = getCurrentURl();
		
		sendKeyElement(pom.getInstanceLp().getUsername(), "H)
		clickOnElement(pom.getInstanceLp().onLogin());
		//clickElement
		
		dropDown(value, null, value)
	}

}
