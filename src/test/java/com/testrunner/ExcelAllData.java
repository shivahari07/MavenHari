package com.testrunner;

import java.io.IOException;

import baseClass.BaseClass;

public class ExcelAllData extends BaseClass{
	
    
    public static void ExcelReadAllData() throws IOException {
   excelReadAllData(".\\Excel\\ExcelSelenium.xlsx", 2);
  // System.out.println(allData);
	}
    
    public static void main(String[] args) throws IOException {
		ExcelReadAllData();

	}
}
