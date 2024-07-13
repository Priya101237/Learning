package Interview;

public class program {

	public static void main(String[] args) {
		
		//String Reversal
		
		String str=" Priyanka";
		char[] array =str.toCharArray();
		String rev=" ";
		for(int i=str.length()-1; i>=0 ; i--)
		{
			rev =rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
