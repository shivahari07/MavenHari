package com.testrunner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;

public class ExcelREad extends BaseClass {
	WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
	 String read = excelRead(".\\Excel\\ExcelSelenium.xlsx", 2, 10, 1);
	System.out.println(read);
	}

}
