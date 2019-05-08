package day35_practice;

public class EncryptionFun {
	public static void main(String[] args) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		String word = "civic";
		char first = word.charAt(0);
		int position = alphabet.indexOf(first);
		System.out.println("position: " + position);
		char enChar = encrypted.charAt(position);
		System.out.println(first + " --> " + enChar);
		
		
		String encWord = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int index = alphabet.indexOf(ch);
			//System.out.println(encrypted.charAt(index));
			encWord += encrypted.charAt(index);
		}
		
		System.out.println(encWord);
		}
		
		
	}


