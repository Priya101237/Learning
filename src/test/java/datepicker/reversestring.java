package datepicker;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args)  {

		/*

		String st="prem nath";
		 StringBuilder input = new StringBuilder();
				 input.append(st);
				 input.reverse();
				 System.out.println(input); */


		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
	   char[] arr=	str.toCharArray();
	   String rev="";

	   for(int i=str.length()-1; i>=0; i--)
	   {
		   rev=rev+str.charAt(i);
	   }

		System.out.println(rev);






	}
}