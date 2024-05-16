package com.MatProblems;

public class RevNum {
	
	private static int revs() {
		
		int a = 89456;
		int sum =0;
		
		while (a > 0 ) {
     int rem = a % 10; //6
     sum = (sum * 10)+ rem;//6
     
     a = a/10; // 8945
		}
     return sum;
     }
	
	
	private static int sum() {
 int a = 12345;
 int sum =0;
 
 while (a>0) {
	 int rem =a % 10; // 5
	 sum = (rem + sum);
	 
	 a = a/10;
	 
 }
 return sum;
	 
 }
 
	
	public static void main(String[] args) {
		System.out.println(revs());
		System.out.println(sum());
	}
	
	

	}


