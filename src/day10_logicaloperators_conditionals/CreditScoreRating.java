package day10_logicaloperators_conditionals;

import java.util.*;

public class CreditScoreRating {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your credit score:");
		
		int creditScore = scan.nextInt();
		
		if (creditScore >= 750 && creditScore <= 850) {
			System.out.println("Excellent");
		}else if (creditScore >= 700 && creditScore <= 749) {
				System.out.println("Good");
		}else if (creditScore >= 650 && creditScore <= 699) {
			System.out.println("Fair");
			}
			
		}
		
		
		
				
		
		
	}

