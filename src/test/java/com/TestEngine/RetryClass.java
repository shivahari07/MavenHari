package com.TestEngine;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer{
int start =1; 
int stop =5;
	@Override
	public boolean retry(ITestResult result) {
if(start<=stop) {
	start++;
	return true;
	
}
		return false;
	}
	
	

}
