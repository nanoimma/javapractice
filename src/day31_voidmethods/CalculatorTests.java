package day31_voidmethods;

import java.util.Scanner;

public class CalculatorTests {
	public static void main(String[] args) {
		
        		
		CalculatorMethods.divide(7, 35.98);
		
		//using scanner pass 2 numbers and operator
		Scanner scan = new Scanner("Enter two numbers");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operotor");
		String operator = scan.next();
		switch(operator) {
		case "+":
			add(n1, n2);
			break;
		case "-":
			subtract(n1, n2);
			break;
		case "*":
			multiply(n1, n2);
			break;
		case "/":
			divide(n1, n2);
			break;
		case "%":
			remainder(n1, n2);
			break;
		default:
			System.out.println("Invalid operator!");
		}
				
	}
	public static void add (double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
	}
	
	public static void subtract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println(result);
	}
	
	public static void multiply (double num1, double num2) {
		double result = num1 * num2;
		System.out.println(result);
	}
	public static void divide (double num1, double num2) {
		if(num2 == 0) {
			System.out.println("Cannot divide by 0");
		}
		double result = num1 / num2;
		System.out.println(result);
	}
	public static void remainder(double num1, double num2) {
		double result = num1 % num2;
		System.out.println(result);
	}
		
		
	}


