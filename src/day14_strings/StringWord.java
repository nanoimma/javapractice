package day14_strings;
import java.util.*;

public class StringWord {
	public static void main(String[] args) {
		System.out.println("Enter word 1");
		Scanner scan = new Scanner (System.in);
			String word1 = scan.next();
			System.out.println("Enter word 2");
			String word2 = scan.next();
			
			if (word1.length() > word2.length()) {
				System.out.println(word1 + "is longer than " + word2);
				
			}else  {
				System.out.println(word2 + " is longer than " + word1);
			
				
			}
	}

}
