package day31_voidmethods;


public class Counter {
	public static void main(String[] args) {
		countUp(0);
	}
	public static void countUp(int numUp) {
		
		if(numUp < 1) {
			System.out.println("invalid input");
		}else {
		for(int i =1; i <= numUp; i++ ) {
		System.out.print(i + " ");
		}
		}
		System.out.println();
	}

	public static void countDown(int numDown) {
		for (int k = numDown; k >= 1; k--) {
			System.out.print(k + " ");
			
		}
		System.out.println();
		}
	
}
