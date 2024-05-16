package com.testrunner;

import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;

public class RunnerClass extends BaseClass {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = browserlaunch("chrome");
   driver =  getUrl("https://adactinhotelapp.com/index.php");
   
	}

}
