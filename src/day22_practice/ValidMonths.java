package day22_practice;
import java.util.Scanner;

public class ValidMonths {
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner (System.in);
		int month;
		do {
			System.out.println("Enter month");
		month = scan.nextInt();
		}while (month >= 1 && month <= 12); 
			
		
		
		System.out.println("Invalid month");
	}

}
