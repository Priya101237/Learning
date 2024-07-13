package program;

public class nonstaticmethod {
	
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		nonstaticmethod m1= new nonstaticmethod();
		m1.add();
		
	}

}
