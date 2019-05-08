package day18_while_dowhie_loops;

public class Alphabet {
	public static void main(String[] args) {
		
		char letter = 'a';
		
		while(letter <= 'z') {
			System.out.println(letter);
		
		letter++;
		}
		System.out.println(letter);
		
System.out.println();//new line
		
		char capitals = 'A';
		
		while(capitals <= 'Z') {
			System.out.print(capitals+" ");
			capitals++;
		}
		
		
		System.out.println();
		
		
		String letters = "";
		char myLetter = 'A';
		
		while(myLetter <= 'Z') {
		letters = letters + myLetter;
		myLetter++;
		
		System.out.println(letters);
		
		
		//letters = letters + 'B';
		//System.out.println(letters);
		
		
		
	}
	}
}
	


