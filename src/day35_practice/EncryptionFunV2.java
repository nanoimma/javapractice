package day35_practice;

public class EncryptionFunV2 {
	public static void main(String[] args) {
		public static char encryptChar(char ch)) {
			System.out.println(encryptChar('z'));
			System.out.println(encryptChar('m'));
			
	}

	
	
	}
	
	/*
	 * encryptChar
	 * return type: char
	 * param: char
	 * takes a char and returns encrypted version
	 * encryptChar('b') ==> 'y'
	 */
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		//return encrypted.charAt( alphabet.indexOf(ch) );
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}
	
	
	
	/*
	 * encryptWord
	 * return type: String
	 * param: String
	 * take a string and returns encrypted version for the whole word
	 */
}
