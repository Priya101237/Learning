package program;

import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		
		int a[] = {56,78,2,4,7};
		
		Arrays.sort(a);
		
		for(int v:a)
		{
			System.out.println(v);
		}
		System.out.println(a[0]);

	}

}
