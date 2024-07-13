package amazon;

import java.util.Scanner;

public class mockinterviewprograms {

	public static void main(String[] args) {
		
		//palindrome or not 
		
		/*
		int num=434;
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println(temp + "is a palindrome");
		}
		else
		{
			System.out.println(temp + "is not a palindrome");
		} 
		
		*/
		
		
		//String Reverse
		
		String st="priya";
	    String rev=" ";
		for(int i=st.length()-1; i>=0;i--)
		{
			rev =rev+st.charAt(i);
		}
		System.out.println(rev);  
		
		//radius 
		
		final double pie=3.14;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the radious");
		 int r=s1.nextInt();
		 double d=(pie*r*r);
		 System.out.println("the output is :" +d); 
		
		
		
		
		
		
		
		

	}

}
