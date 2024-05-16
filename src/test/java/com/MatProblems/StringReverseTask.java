package com.MatProblems;

public class StringReverseTask {
	public static void main(String[] args) {
		String s = "Automation Testing";
		String[] sp = s.split(" ");
		
		for(int i=0;i<sp.length;i++) {
			String st = sp[i]; 
			for( int j=st.length()-1;j>=0;j--){
				String add="";
				char ca = st.charAt(j);
add = add+ ca;			 	
System.out.print(add);
				
			}
		
		System.out.print(" ");

	}

}
}
