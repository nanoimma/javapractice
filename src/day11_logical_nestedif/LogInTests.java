package day11_logical_nestedif;
import java.util.*;

public class LogInTests {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
System.out.println("Enter Username");
		String username = keyboard.nextLine();
		System.out.println("Enter password");
		String password = keyboard.nextLine();
		
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Succesfull, Welcome!");
		}else if (!username.equalsIgnoreCase(validUsername) &&  !password.equals(validPassword)) {
			System.out.println("Invalid Username and Invalid Password");
		}else if (username.equalsIgnoreCase(validUsername) && !password.contentEquals(validPassword)) {
			System.out.println("Invalid Password");
		}else if(!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
		}
		
		
	
	
		
		
		
		
	}

}
