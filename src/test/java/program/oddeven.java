package program;

public class oddeven {

	public static void main(String[] args) {
		int[] a = {2,4,5,6,7,8};
		int odd=0,even=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
				
			}
			else {
			odd++;
		}
		}
		System.out.println("even number count :" +even);
		System.out.println("odd number count : " +odd);
		

	}

}
