package day31_voidmethods;

public class CalculatorMethods {

	public static void add (double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
	}
	
	public static void substract(double num1, double num2) {
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
