package day25_arrays03;

public class Shopping {
	public static void main(String[] args) {
		
		String [] products = {"Jacquemus Bag", "The Row Dress", "Cartier Watch", 
				"Prada Shoes", "Celine Sunnies"};
		
		double [] prices = {1500, 1999, 7000.99, 800.5, 400};
		int [] itemsId = {12345, 54321, 32123, 54323, 13134};
		
		//Print count of products
		System.out.println("Products count" + products.length);
		//check if products, prices
		
		if(products.length == prices.length && products.length == itemsId.length){
			
		System.out.println("Shopping list is good");
	}else {
		System.out.println("something wrong with the list");
		return;
	}
		
		for(String p : products) {
			System.out.println(p);
		}
			//prices for loop
			
			for(int i = 0; i < prices.length; i++) {
				System.out.println(prices[i]);
			}
				//itemsId print in reverse order
				
				for(int j = itemsId.length - 1; j >= 0; j--) {
					System.out.println(itemsId[j]);
				}
					// print a report with a total price
					//Item1: 12345  - Jacquemus Bag - $1500
				
					double totalPrice = 0.0;
					for(int idx = 0; idx < products.length; idx ++) {
						System.out.println("Item " + (idx+1) + ": " + itemsId[idx] + " - " + products[idx] + " - $" + prices[idx]);
						totalPrice += prices[idx];
					}
					System.out.println("Total Price: $" + totalPrice);
						
						
						
					//Find most expensive item in the list
					
					int maxIndex = 0;
					double maxPrice = 0;
					
					for(int j = 0; j < prices.length; j ++) {
						if (prices[j] > maxPrice) {
							maxPrice = prices[j];
							maxIndex = j;
						}
					}
						System.out.println(itemsId[maxIndex] + " - " +products[maxIndex] + " - $" + maxPrice);
					
						int minIndex = 0;
						double minPrice = 7000.99;
						for(int t = 0; t < prices.length; t++) {
							if(prices[t] < minPrice) {
								minPrice = prices[t];
								minIndex = t;
								
							}
						}
						System.out.println(itemsId[minIndex] + " - " + products[minIndex] + " - $" + minPrice);
					
					
				}
			}
		
	
		
		
		




