package program;

public class SwappingOf2Numbers {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		System.out.println("before swapping of x :" +x);
		System.out.println("before swapping of y :" +y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swapping of x :" +x);
		System.out.println("After swapping of y :" +y);
		
		

	}

}
