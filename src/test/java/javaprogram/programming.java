package javaprogram;

import java.util.Scanner;

public class programming {

	public static void main(String[] args) {
		
		//String reversal 
		
		/*	String str="priya"; 
		StringBuffer input = new StringBuffer(str);
		input.reverse();
		System.out.println(input);
		
		Scanner sc= new Scanner (System.in);
		String str2=sc.nextLine();
		char[] arr=str2.toCharArray();
		String reverse=" ";
		for(int i=str2.length()-1; i>=0; i--)
		{
			reverse= reverse+str2.charAt(i);
		}
		System.out.println(reverse); 
		
		int [] a= {12,12,4};
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}  
		
		String st="priyanka";
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1; j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
				}
			}
		} 
		
		int a[]= {2,4,6,8};
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
		
		int num=50;
		int count;
		for(int i=1;i<=num;i++) {
			count=0;
		    
			for(int j=2;j<=i/2;j++)
			{
				if(i %j==0) {
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
			
		} 
		
		int num=43487;
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int d=num%10;
			rev = d+rev*10;
			num=num/10;
			
	    }
		if(temp==rev)
		{
			System.out.println(temp +"is a palindrome");
		}
		else
		{
			System.out.println(temp +" is not a palindrome");
		} 
		
		int num=12345;
		String value =String.valueOf(num);
		System.out.println(value); 
		
		int [] a= {2,4,6,8,9,5,1};
		int odd=0, even=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]/2==0)
			{
				even++;
			}
			else {
				odd++;
				
			}
			
			
		}System.out.println(even);
		System.out.println(odd); 
		
		String str="priyanka";
		int count=0;
		for(int i=0;i<str.length();i++) {		
				if(str.charAt(i)=='a') 
		
		String st="PRIYAnka";
		int upper =0, lower =0;
		for(int i=0; i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>65 && ch<95)
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
		System.out.println(upper); */
		
		//print 1 to 1000 which is divisable by 10
		
        for(int i=1 ; i<1000;i++)
        {
        	if(i%10==0)
        	{
        		System.out.println(i);
        	}
        }
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		
		
	}


