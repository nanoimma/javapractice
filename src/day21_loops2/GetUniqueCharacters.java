package day21_loops2;
import java.util.*;

public class GetUniqueCharacters {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter word");
			String word = scan.next(); //
			String unique = "";
			
			//for(int i = 0; i < word.length(); i++) {
				//System.out.print(i);
				//System.out.print(word.charAt(i));
			//}
			
			for(int i = 0; i < word.length(); i ++) {
				char letter = word.charAt(i);
if(!unique.contains("" + letter)) {
	unique += letter;
}
		
			}
			System.out.println(unique);
	
}
}
