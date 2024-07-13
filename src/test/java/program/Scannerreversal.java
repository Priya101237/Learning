package program;

import java.util.Scanner;

public class Scannerreversal {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string ");
	     String st=	sc.nextLine();
	     char[] array=st.toCharArray();
	     String rev=" ";
	     for(int i=st.length()-1;i>=0;i--) {
	    	 rev=rev+st.charAt(i);
	    	
	    	 }
	     System.out.println(rev);
		

	}

}
