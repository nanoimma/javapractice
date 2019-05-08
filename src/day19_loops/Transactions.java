package day19_loops;
import java.util.*;

public class Transactions {

	public static void main(String[] args) {
		System.out.println("Current balance");
		Scanner scan = new Scanner (System.in);
		double balance = scan.nextDouble();
		int count = 0;


		
		while(balance > 0) {
			count ++;
			System.out.println();
			System.out.println("Transaction " + count);
			double transaction = scan.nextDouble();
			if (transaction > balance) {
				System.out.println("This transaction will make your balance negative");
				continue; // go on top of loop right away
			}
			balance = balance - transaction;
			System.out.println("Current balance " + balance);

			System.out.println(balance);

			
		}
		System.out.println(("Insufficient balance"));
		System.out.println("Transactions" + count);
	}
}
