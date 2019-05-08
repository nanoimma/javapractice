package day14_strings;

public class CharAt {
	public static void main(String[] args) {
		String word = "Computer";
		//print all characters one by one
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));

		
		String word2 = "Java";
		
		if(word2.charAt(2) == 'J') {
			System.out.println("Correct");
		}else {
			System.out.println("Not correct");
		}
		
		String word3 = "civic";
		
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		
		if(first == last) {
			System.out.println("First and last match");
		}
		
		
		
	}
	
	

}
