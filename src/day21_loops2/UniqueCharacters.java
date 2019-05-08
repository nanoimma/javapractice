package day21_loops2;

public class UniqueCharacters {
	public static void main(String[] args) {
		String word = "javva";
		String unique = "";
		char ch = word.charAt(0);
		
		System.out.println(unique.contains("" + ch));
		System.out.println(unique.indexOf(ch));
		if(!unique.contains("" + ch)) {
			unique = unique + ch; //unique += ch
		}
		System.out.println("Unique:" + unique);
		
		String word2 = "bananas";
		String unique2 = "";
		
		int i = 0;
		
		char ch2 = word2.charAt(i);
		System.out.println("ch2:" + ch2);
		
		//for(i = 0; ch2 < word2.length(); i++) {
			//System.out.println();
		}
		
		
		
		
		
	}


