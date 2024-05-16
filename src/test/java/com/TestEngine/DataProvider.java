package com.TestEngine;

import org.testng.annotations.Test;

public class DataProvider {
	

	@Test(dataProvider = "datas")
	private void Credinitials(String username, String password) {
		System.out.println("username is :" + username);
		System.out.println("password is :" + password);

	}
	
	@org.testng.annotations.DataProvider
	private Object[][] datas() {
return new Object [][] {
	{"Hari" , "Hari0207"},
	{"Haran", "Haran0207"}
};
	}

		}
		
	

