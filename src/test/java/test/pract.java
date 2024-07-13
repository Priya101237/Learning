package test;

public class pract {

	public static void main(String[] args) {
		
		//String Reverse
		
		String st="priyanka";
		StringBuffer input =new StringBuffer(st);
		input.reverse();
		System.out.println(input);
        
		//for loop 
		
		String str="priya";
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		//array
		
		int a[] = {12, 34, 56,76};
		int count=0;
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
		//Array Duplicates
		
		int [] b= {1,1, 3, 4,5};
		for(int i=0; i<b.length;i++) {
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
						{
					System.out.println(b[j]);
						}
			}
		}
		
		//String Duplicates
		
		String r="priyanka";
		int count2=0;
		char[] d=r.toCharArray();
		for(int i=0;i<d.length;i++)
		{
			for(int j=i+1; j<d.length;j++)
			{
				if(d[i]==d[j])
				{
					System.out.println(d[j]);
					count++;
				}
			}
		}
		
		
		
		String sr="priya";
		System.out.println(sr.replaceAll("priya", "bubu"));
		
		//lowewrcase &uppercase
		
		String sf="PRIYAnka";
		int upper=0, lower=0;
		for(int i=0 ; i<sf.length();i++)
			
		{
			char ch=sf.charAt(i);
			if( ch>=60 & ch<=90)
				
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
		
	}

}
