package program;

public class palindrome {

	public static void main(String[] args) {
		
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
		
		
		
		
		
		
		

	}

}
