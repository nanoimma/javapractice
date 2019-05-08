package day23_Arrays_NestedForLoopArrayLooping;
import java.util.*;
public class BruteForce {
	public static void main(String[] args) {
		
		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		String userName = "";
		String password = "";
		Scanner scan = new Scanner (System.in);
		
		int attempts = 5;
		
		do {
			if (attempts -- == 0){
			System.out.println("You have exceeded number of attempts");	
			System.out.println("This user has been deacticvated");
			return;
			}
			System.out.println("Please enter user name");
			userName = scan.next();
			
		}while(!userName.contentEquals(expectedUserName) || !password.contentEquals(expectedPassword));
		System.out.println();
		
	}

}
