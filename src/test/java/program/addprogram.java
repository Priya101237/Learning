package program;

import java.util.Scanner;

public class addprogram {
	
	
	static void add() {
		
		Scanner s= new Scanner(System.in);
		System.out.println("eneter a value for a");
		int a=s.nextInt();
		System.out.println("eneter a value for b");
		  int b=s.nextInt();
		  int c=a+b;
		  System.out.println(c);
	
		
	}

	public static void main(String[] args) {
		
		add();
		
	}

}
