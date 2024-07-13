package program;

public class StringDuplicatesgivenString {

	public static void main(String[] args) {
		
		String st="Framework";
		int count=0;
		char[]  ch=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] ==ch[j])
				{
					System.out.println("duplicates characters in string are :" +ch[j]);
					count++;
				}
				
			}
		}
		System.out.println("Duplicate character count :"+count);
	}

}
