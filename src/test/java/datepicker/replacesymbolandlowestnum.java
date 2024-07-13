package datepicker;

import java.util.Arrays;
import java.util.Collections;


public class replacesymbolandlowestnum {

	public static void main(String[] args)  {

	//	find lowest number in given

	 /* int a[]= {500,700,300,200,400};

	Arrays.sort(a);

	for(int v: a)
	{
		System.out.println(v);
	}

	System.out.println("smallest number :" + a[0]);

	}

	//remove dollar symbol

	String price= "$98.46";

	String price1=price.replace("$"," ");
	System.out.println(Double.parseDouble(price1));*/

	/*
		Scanner scanner = new Scanner(System.in);
       String str=scanner.next();
       char[] arr=  str.toCharArray();
       String rev =" ";
       for( int i=str.length()-1;i>=0;i--)
       {
    	   rev=rev+str.charAt(i);
       }

       System.out.println(rev);
	}

}



	int a[]	= {244,600,877,100};

	Arrays.sort(a);

	for(int v :a)
	{
		System.out.println(v);
	}

	System.out.println("smallest number " +a[3]);

}

}


	//Intersection of two strings

String[] s1= {"one","two","three"}	;
String[] s2= {"one","two","four"}	;
HashSet<String> set =new HashSet<String>();
for(int i=0;i<=s1.length;i++)
{
	for(int j=0;j<=s2.length;j++)
	{
		if(s1[i].equals(s2[i]))
			set.add(s1[i]);
	}
	System.out.println(set);

	}
//duplicates of array /////

	int [] arr=new int [] {1,2,3,3,4,5,6,7,4};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[j]);
			}
		}
	}



	//to find a total numbers of punctuation characters exists in a string

	int count=0;
	String str="Good Mrng! , Priya ,had your breakfast?";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='!' || str.charAt(i)=='?' || str.charAt(i)==',' || str.charAt(i)=='.');
		count++;
	}

	System.out.println(count);


		//array - assending order

		int array[] = new int[] {56,78,34,7};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int temp=0;
				 if(array[i]>array[j])
				 {
					 temp=array[i];
					 array[i]=array[j];
					 array[j]=temp;
				 }
			}
				 System.out.println(array[i]);
			}

		 //decending order

		int a[]= new int[] {23,76,888,45};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
				for(int i=0;i<=a.length-1;i++)
				{
					System.out.println(a[i]);
				}


			*/

		//decending sort


		Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
		// sorts array[] in descending order
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Array elements in descending order: " +Arrays.toString(array));






			}



}






