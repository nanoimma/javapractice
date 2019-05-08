package day37_arraylist;

import java.util.*;

public class Shopping {
	public static void main(String[] args) {
		
		
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("puppy");
		shoppingList.add("shampoo");
		shoppingList.add("berries");
		
		int count = shoppingList.size();
		System.out.println("Total count: " + count);
		System.out.println(shoppingList);
		System.out.println(shoppingList.toString());
		
		System.out.println(shoppingList.get(0));
		System.out.println(shoppingList.get(shoppingList.size() - 1));
		
		shoppingList.remove("shampoo");
		
		
		for(String item : shoppingList) {
			System.out.println(item);
		}
		
		//remove all items at once
		
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		
		
		
		
		
	}

}
