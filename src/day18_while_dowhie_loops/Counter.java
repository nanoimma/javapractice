package day18_while_dowhie_loops;

public class Counter {
	public static void main(String[] args) throws InterruptedException {
		//1,2,3,4...
		
		int num = 1;
		
		while(num <= 9) {
			System.out.print(num + ",");
			num++;
			Thread.sleep(500);
		}
		System.out.print("10");
		
		System.out.println();
		
		int num2 = 11;
		while (num2 >= 2) {
			System.out.print(num2 + ",");
			num2--;
		}
		System.out.println("1");
	}
	

}
