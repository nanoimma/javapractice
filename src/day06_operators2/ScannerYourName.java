package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {
	public static void main(String[] args) {
		//creat scanner object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi, what is your name?");
		
		String name = scan.next();//accept String input
		System.out.println("Nice to meet you, " + name);
		
		
		
		
	}

}
