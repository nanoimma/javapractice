package day29_method01;

import java.util.Arrays;

public class Countries {
	public static void main(String[] args) {
		
		String[][] countriesArray = {
				{"USA", "Washington DC"},
	            {"Canada",	"Ottawa"},
				{"Mexico",	"Mexico city"},
				{"Brasil",	"Brasilia"},
				{"Peru",	"Lima"},
				{"Argentina",	"Buenos Aires"},
				{"Bolivia",	"La Paz"},
				{"Macedonia",	"Scopia"},
				{"Kazakhstan",	"Nursultan"}
		};
	//String[][] c = new String[9][2];
		//print USA with capital
		
		System.out.println(countriesArray[0][0] + "|" +countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + "|" + countriesArray[8][1]);
		System.out.println(Arrays.deepToString(countriesArray));
		
		//print all the countries in same line separated by |
		
		for(int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][0] + "|");
			
		}
		System.out.println();
		//for each loop
		for(String[] c : countriesArray) {
			System.out.print(c [0] + "|");
		}
		System.out.println();
		
		//get all the cities and add to cities[] array
		String[] cities = new String[countriesArray.length];
		for(int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];
		}
			
			System.out.println(Arrays.toString(cities));
			
			System.out.println();
			
			for(int row = 0; row < countriesArray.length; row++) {
				if(countriesArray[row][0].equals("Bolivia")) {
					//System.out.println(countriesArray[row][1]);
					if(countriesArray[row][1].equals("La Paz")) {
						System.out.println("Bolivia test passed");
					}else {
						System.out.println("Bolivia test failed");
					}
					break;
				}
			}
		
			
		}
		

}
