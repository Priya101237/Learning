package program;

import java.util.HashMap;

public class uniqueArrayinagivenarray {

	public static void main(String[] args) {
		
		int a[] = {3,3,3,3,3,4,5,5,5,5,5,4,4,7};
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		for(int i=0 ; i<a.length;i++)
		{
			map.put(a[i],i);
		}
		System.out.println(map.keySet());
		
		

	}

}
