package program;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="Selenium";
		String s2="care";
		
		s1.toLowerCase();
		s2.toLowerCase();
		
		if(s1.length() !=s2.length())
		{
			System.out.println("Both the strings are not anagram");
		}
		
		else {
			char[] s3=s1.toCharArray();
			char[] s4= s2.toCharArray();
			Arrays.sort(s3);
			Arrays.sort(s4);
			
		  if(Arrays.equals(s3, s4 )==true) {
			  System.out.println("the given string is anagram");
		  }
		  
		  else {
			  System.out.println("the given string is not anagram");
		  }
		}

	}

}
