package day40_customclasseswithmethods;

import java.util.ArrayList;

public class WarmUpList {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("saturn");
		myList.add("Venus");
		myList.add("Earth");
		myList.add("Pluto");
		String targetWord = "Sun";
		int count = countOccurances(myList, targetWord);
		System.out.println(count);
		
		
		
		
		
	}
	public static int countOccurances(ArrayList<String> list, String word) {
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(word)) {
				count++;
			}
			
		}
		return count;
	}

}
