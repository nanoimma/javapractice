package day23_Arrays_NestedForLoopArrayLooping;
import java.util.Scanner;

public class primeNumber {
public static void main(String[] args) {
	System.out.println("Enter a number");
	
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	
			
			for (int i = 2; i < num; i ++ ) {
				if(num % i == 0) {
					System.out.println("This is a prime number");
					break;
				}
			}
			System.out.println("Not a prime number");
}
}
