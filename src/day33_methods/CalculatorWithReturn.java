package day33_methods;

public class CalculatorWithReturn {
	public static void main(String[] args) {

		int result = add(3,5);
		System.out.println("result: " + result);
		System.out.println(add(5,8));

		
	}
	
	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
		
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
		
	}
	
	public static int multiply(int n1, int n2) {
		int sum = n1 * n2;
		return sum;
		

}
	
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	public static int divide (int num1, int num2) {
		if(num2 == 0) {
			System.out.println("Error: Cannot divide by zero");
			//return 0;
			System.exit(0); //stop the whole code
		}
		int result = num1 / num2;
		return result;
		
	}
}