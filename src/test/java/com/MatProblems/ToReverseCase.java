package com.MatProblems;

public class ToReverseCase {
	
	public static void main(String[] args) {
		String s = "HaRiHAran";
		char[] ca = s.toCharArray();
		//System.out.println(ca[8]);
		
		for( char c : ca) {
			if (Character.isUpperCase(c)) {
			System.out.print(Character.toLowerCase(c));
		} else if(Character.isLowerCase(c)) {
		System.out.print(Character.toUpperCase(c));
		}
	}
}}

