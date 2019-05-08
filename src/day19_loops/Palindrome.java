package day19_loops;
 import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
				
		String word = scan.next() ;
		String reversed = "";
		
		int length = word.length() - 1;
		
		while(length >= 0) {
			reversed = reversed + word.charAt(length);
			length --;
			
			
		}
		
		if (word.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		
		
		
		
	}

}
