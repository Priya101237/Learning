package datepicker;

public class reversestring2 {

	public static void main(String[] args)  {

	/*	String st="prem nath";

		//converting string into char by using tochararray

		char [] try1 =st.toCharArray();
		for(int i=try1.length-1 ;i>=0;i--)
			System.out.println(try1[i]);

		String str="prem nath" , nstr = "";

		char ch;

				System.out.println("original world:  ");
				System.out.println("prem nath");

				for(int i=0; i<str.length();i++)
				{
					ch= str.charAt(i);
					nstr=ch+nstr;
				}
					System.out.println("Reverse word :" +nstr);

				}



		        String str="prem";
		        StringBuffer input = new StringBuffer(str);
		        input.reverse();
		        System.out.println(input);


		      Scanner Scanner = new Scanner(System.in);
		      String str=Scanner.nextLine();
		      char[] arr=str.toCharArray();
		      String rev=" ";
		      for(int i=str.length()-1; i>=0;i--)
		      {
		    	  rev=rev+str.charAt(i);
		      }

		      System.out.println(rev);






		      Scanner scanner = new Scanner(System.in);
		        String Str = scanner.nextLine();
		        char[] arr = Str.toCharArray();

		        String rev = "";

		 for(int i = Str.length() - 1; i >= 0; i--)
		 {
		 rev = rev + Str.charAt(i);
		 }

		 System.out.println(rev);
	}
}



System.out.println("please enter your string");
Scanner Scanner =new Scanner(System.in);
String Str=Scanner.nextLine();
   char[] arr =Str.toCharArray();
   String rev="";
   for(int i=Str.length()-1;i>=0;i--)
   {
     rev= rev+ Str.charAt(i);
   }

   System.out.println(rev);

  }
}

		 */


		String str="prem";
	char[] arr=str.toCharArray();
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);

	}
		System.out.println(rev);
	}
}
