package day30_method02;
import java.util.Scanner;
public class WarmUpMethods {
	public static void main(String[] args) {
		print5Stars();
		introduce();
		
	}
 
		public static void print5Stars() { 
			System.out.println("* * * * *");
			
			//
		}
		
		public static void introduce() {
			Scanner scan = new Scanner(System.in);
			System.out.println("What is yout name?");
		String name = scan.next();
		System.out.println("Nice to meet you," + name);
			
		}
		
	}
	


