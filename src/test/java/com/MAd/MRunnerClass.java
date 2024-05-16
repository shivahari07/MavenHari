package com.MAd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Sdp.PageObjectManager;

import baseClass.BaseClass;

public class MRunnerClass extends BaseClass{

	public static WebDriver driver = BaseClass.browserlaunch("chrome");
	public static PageObjectManager pom= new PageObjectManager(driver);
	
	
	public static void main(String[] args) {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;	
getUrl("https://adactinhotelapp.com/");
de
	}}
