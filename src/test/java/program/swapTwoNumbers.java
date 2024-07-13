package program;

import java.util.HashMap;
import java.util.HashSet;

public class swapTwoNumbers {

	public static void main(String[] args) {
		
		 /*String s1="Hello";
		String s2="World";
		
		s1=s1+s2;
		s2=s1.substring(0 ,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2); */
		
		/*
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println(s1);
		System.out.println(s2); */
		
		//odd and even
		/*
		int a[]= {1,2,3,4,5,6,7,8,9};
		int even=0,odd=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]%2==0)
			{
				//System.out.println(a[i]);
				even++;
				
			}
			
			else {
				odd++;
			}
		}
		
		System.out.println(even);
		System.out.println(odd);		
		//sum of arrays 
		
		int a[] = {5,1,8,4,9,1,5};
		int sum=0;
		for(int i=0; i<a.length;i++) {
			sum =sum+a[i];
			
		}
		
		System.out.println(sum); 

		
		
		//Duplicates string remove
		
		String s1="Characters";
		int count=0;
		  char[] ch=s1.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			for(int j=i+1; j<ch.length;j++) {
				
				if(ch[i] ==ch[j])
				{
					System.out.println(ch[i]);
					count++;
				}
			}
		
			
		}
		
		System.out.println(count); 
		
		String s1="selenium";
		String s2="cucumber";
		
		System.out.println("Before swapping of s1: " +s1);
		System.out.println("Before swapping of s2: " +s2);
		
		
		s1=s1+s2;
		s2=s1.substring(0 ,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println("After swapping of s1: " +s1);
		System.out.println("after swapping of s1: " +s2); 
		
		//Unique array find
		
		int a[] = {2,2,4,5,6,7};
		int sum=0;
		HashMap<Integer , Integer> Map =new HashMap<>();
		for(int i=0; i<a.length;i++)
		{
			Map.put(a[i],i);
			
		}
		
	     System.out.println(Map.keySet());
		
		
		//unique array find and sum
		
		int a[] = {2,2,4,5,6,7};
		int sum=0;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0 ;i<a.length;i++)
		{
			if(set.contains(a[i]))
			{
				sum= sum+a[i];
				System.out.println(a[i]);
			}
			set.add(a[i]);
		}
		
		//System.out.println(sum);
		
		String s="pri";
		System.out.println(s.replace("i", "r"));
		System.out.println(s.replaceFirst("p", "x"));
		System.out.println(s.replaceAll("pri", "priyanka"));
		
		System.out.println(s.repeat(2)); 
		
		//to print each character twice 
		
		String s1="priya";
		char[] ch=s1.toCharArray();
		char[] ch2 = new char[ch.length*2];
		for(int i=0;i<ch.length;i++)
		{
		    ch2[2*i]=ch[i];
		    ch2[2*i+1]=ch[i];
		}
		String result = new String(ch2);
        System.out.println(result); */
		
		
		
		String s2 = "pri";
		char[] ch =s2.toCharArray();
		char[] ch2= new char[ch.length*2];
		for(int i=0; i<ch.length;i++)
		{
			ch2[2*i]=ch[i];
			ch2[2*i+1]=ch[i];
			
		}
		
		String res = new String(ch2);
		System.out.println(res);
		
  


	}

}
