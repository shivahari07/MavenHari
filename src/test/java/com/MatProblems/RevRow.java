package com.MatProblems;

public class RevRow {

	public static void main(String[] args) {
		String s = "How are you";
		String[] sp = s.split(" ");

	  
		for (int i=0;i<sp.length;i++) {
          String st = sp[i];// 1,how 2,are, 3,you
          for(int j = st.length()-1;j>=0;j--) {//210
        	  String rev = "";                 //woH

        	  char ca = st.charAt(j); // w
        	  rev =   rev + ca ; //w - string

        	  System.out.print(rev); 
        	  
          }
          System.out.print(" ");
		}
	}

}
