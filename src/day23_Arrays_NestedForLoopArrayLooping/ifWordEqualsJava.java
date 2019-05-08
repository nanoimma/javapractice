package day23_Arrays_NestedForLoopArrayLooping;
import java.util.Scanner;

public class ifWordEqualsJava {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String word = "";
		String listOfWords = "";
		for( int i = 0; i<6; i++) {
			System.out.println("Enter a word: ");
			word = scan.next();
			
			if(word.equals("java")) {
				break;
			}
			listOfWords += word;
		}
		System.out.println("Allwords "+listOfWords);
	}
	}
