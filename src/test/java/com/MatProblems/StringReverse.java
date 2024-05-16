package com.MatProblems;

import java.util.Iterator;

public class StringReverse {
	
	public static void main(String[] args) {
		
	
	
	String s = "java Selenium jscript";
	String rev = "";
	char[] ca = s.toCharArray();

	for(int i=ca.length-1;i>=0;i--) {
		rev =  rev + ca[i];
		
		
	}
		System.out.println(rev);
		
	}
	

}
