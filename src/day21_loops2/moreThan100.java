package day21_loops2;
import java.util.Scanner;

public class moreThan100 {
	public static void main(String[] args) {
		
		//System.out.println("Enter two numbers");
		Scanner scan = new Scanner (System.in);
		
		//int num1 = scan.nextInt();
		//int num2 = scan.nextInt();
		//int sum = num1 + num2;
		//while (sum < 100) {
			//System.out.println("Enter two numbers");
			
		//}
		//if (sum > 100) {
			//System.out.println("Good Numbers");
		//}
		int sum = 0;
		do {
			System.out.println("Enter 2 numbers");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum = num1 + num2;
			}while(sum <= 100);
		System.out.println("Good Numbers");
	}

}
