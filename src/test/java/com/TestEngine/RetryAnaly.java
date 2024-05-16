package com.TestEngine;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


public class RetryAnaly {
	
	@Test(retryAnalyzer = RetryClass.class)
	private void stringnames() {

	
	String a = "hariharan";
	String b = "Hariharan";
	
	assertEquals(a, b);
	System.out.println("Equals");
	}


@Test
private void names() {

	
	String a = "hariharan";
	String b = "hariharan";
	
	assertEquals(a, b); 
    
		System.out.println("right");
	}}
