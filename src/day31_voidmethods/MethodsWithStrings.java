package day31_voidmethods;

import java.util.Arrays;

public class MethodsWithStrings {
	public static void main(String[] args) {
		googleSearchResults("About 787,000 results (0.73 seconds)");
		
		
	}
	
public static void countWords(String sentence) {
	String[] sentenceArr = sentence.split(" ");
	System.out.println("words in this sentence " + Arrays.toString(sentenceArr));
	System.out.println("Number of words: " + sentenceArr.length);
	
	
}

public static void googleSearchResults(String results) {
	String[] resultsArr = results.split(" ");
	String count = resultsArr[1].replace(",", "");
	String seconds = resultsArr[3].replace("(", "");
	System.out.println("Results count: " + count);
	System.out.println("Time in seconds: " + seconds);
	
}
}
