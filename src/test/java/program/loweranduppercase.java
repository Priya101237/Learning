package program;

public class loweranduppercase {

	public static void main(String[] args) {
		
		String st="PriyaNKA";
		int upper=0,lower = 0;
		
		for(int i=0;i<st.length();i++) {
			char ch =st.charAt(i);
			if(ch>65 && ch<90)
			{
				upper++; 
			}
			else {
				lower++;
			}
		}
			
			System.out.println(upper);
			System.out.println(lower);
			
		

	}

}
