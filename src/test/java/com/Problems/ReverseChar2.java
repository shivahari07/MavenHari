package com.Problems;


public class ReverseChar2 {
	public static void main(String[] args) {
		String s = "Java";
	    String reverse = "";
	    char[] ca = s.toCharArray();
	    	        
	    for (int i = 0; i < ca.length; i++) {
	     reverse = (ca[i] + reverse ); //avaj
	     
	    //reverse = (reverse + ca[i]); //java
	    }
	     System.out.println(reverse);

 }
	
}


