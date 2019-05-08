package day13_ternary_strings_intro;
import java.util.*;

public class CarSelector {
	public static void main(String[] args) {
		
		System.out.println("Which type of car you are intrested in?");
		
		System.out.println("1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean");
		
		Scanner input = new Scanner (System.in);
				
		
		int carType = input.nextInt();
		double averagePrice = 0.0;
		String carOptions = "";
		String carOrigin = "";
		
		
		switch(carType) {
		case 1:
			averagePrice = 33000.00;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigin = "American";
			break;
		case 2:
			averagePrice = 32000.00;
			carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
			carOrigin = "Japanese";
			break;
			
		case 3:
			averagePrice = 55000.00;
			carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
			carOrigin = "German";
			break;
			
			
		case 4:
			averagePrice = 85000.00;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			carOrigin = "Italian";
			break;
			default:
				System.out.println("Car type not available");
				return;
			
		}
		System.out.println("You selected " + carOrigin + " car and your options are " + carOptions);
			
		
	
		
		
		
		
	}
	}
