package day12_swith_ternary;

import java.util.*;

public class Weather {
	public static void main(String[] args) {
		System.out.println("How is the weather today?");
		
		Scanner scan = new Scanner(System.in);
		
		String weather = scan.next();// .toLowerCase()
		
		
		
		
		switch(weather) {
		case "sunny":
			System.out.println("Go to Park");
			System.out.println("Code Java");
			break;
			
		case "hot":
			System.out.println("Go Swimming");
			System.out.println("Code Java");
			break;
			
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
			
		case "rainy":
			System.out.println("Go Shopping");
			System.out.println("Code Java");
			break;
			
		case "snowy":
			System.out.println("Chain your Tyres");
			System.out.println("Go Skiing");
			System.out.println("Code Java");
			break;
			
		default:
			System.out.println("Code Java in any other weather");
			
			
			
					                
		}
	}

}
