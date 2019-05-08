package day19_loops;
import java.util.*;

public class GuessANumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	int secretNumber = 83;
	int guessNumber;
	System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
	
	do {
		System.out.println("Guess a number");
		guessNumber = scan.nextInt();
		if(guessNumber  < secretNumber) {
			System.out.println("Your number is too small");
		}else if (guessNumber > secretNumber) {
			System.out.println("Your number is too big");
		}
	}while(guessNumber != secretNumber);
	
	System.out.println("Bingo!");
}
}
