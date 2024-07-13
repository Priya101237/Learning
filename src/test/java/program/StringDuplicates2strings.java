package program;

import java.util.HashSet;

public class StringDuplicates2strings {

	public static void main(String[] args) {
		
		String[] s1= {"papa", "priya","mylu"};
		String[] s2= {"papa" ,"java"};
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i]==s2[j]) {
					set.add(s1[j]);
				}
				
			}
			
		}
		
		System.out.println(set);

	}	

}
