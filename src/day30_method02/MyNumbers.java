package day30_method02;

import java.util.Random;

public class MyNumbers {
	public static void main(String[] args) {
		showMe5Numbers();
		
		
	}
public static void showMe5Numbers() {
	Random r = new Random();
	for (int i = 1; i <= 5; i++) {
		System.out.println(r.nextInt(1000) + " "); //print random number 0-100
		
	}
	
	System.out.println(); //take it to new line
}

}
