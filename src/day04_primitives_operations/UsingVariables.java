package day04_primitives_operations;

public class UsingVariables {
	public static void main (String[] args) {
		//declare num1, num2, num3
		int num1  = 100, num2 = num1, num3;
		System.out.println (num1);
		System.out.println (num2);
		
		num2 = 200;
		num1 = num2;
		num3 = num1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
		
		int apples = 25;
		int kiwis = apples;
		int mangoes = 55; 
				mangoes = kiwis;
				
		
		
	}


}
