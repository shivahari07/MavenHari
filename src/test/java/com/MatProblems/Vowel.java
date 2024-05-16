package com.MatProblems;


public class Vowel {
	
public static void main(String[] args) {
	

	
		String st = "heLLoWorld";
		String s = st.toLowerCase();
		int count =0;
		char[] ca = s.toCharArray();
		for(char c:ca) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.print(c);
				count++;
			}
		}
				System.out.println();

		System.out.println(count);
		
		}
	
}
	
	
	
	



