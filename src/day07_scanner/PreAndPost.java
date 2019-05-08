package day07_scanner;

public class PreAndPost {
public static void main(String[] args) {
	int num = 0;
	int num2 = num++;
	
	System.out.println("num: "+ num);
	System.out.println("num2: "+ num2);
	
	
	int n = 20;
	int n2 = ++n;
	System.out.println("n: " +n);
	System.out.println("n2:" +n2);
	
	int bananas = 6;
	int pears = bananas++;
	int apples = ++bananas;
	System.out.println("bananas: "+bananas);
	System.out.println("pears: "+pears);
	System.out.println("apples: "+apples);
	
}
}
