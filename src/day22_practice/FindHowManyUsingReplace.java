package day22_practice;

public class FindHowManyUsingReplace {

	public static void main(String[] args) {
		
		String word = "including webpages, images";
		
		int length1 = word.length();
		word = word.replace("e", "");
		int length2 = word.length();
		
		System.out.println(length1);
		System.out.println(length2);
		
		int count = length1 - length2;
		
		System.out.println("Count of e: " + count);
		
		for (int i = 0; i < word.length(); i++) {
			
			
		}
	}
}
