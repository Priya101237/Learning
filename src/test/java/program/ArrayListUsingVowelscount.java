package program;

import java.util.ArrayList;

public class ArrayListUsingVowelscount {

	public static void main(String[] args) {
		
		String st="priyanka";
		int count=0;
		String vow="aeiou";
		ArrayList<Character> vowels= new ArrayList<>();
		for(int i=0; i<vow.length();i++)
		{
			vowels.add(vow.charAt(i));
		}
		for(int i=0; i<st.length();i++)
		{
		     if(vowels.contains(st.charAt(i))) {
		     count++;
		}
		}
		System.out.println(count);
		
	

		
		

		
		



      
       

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
