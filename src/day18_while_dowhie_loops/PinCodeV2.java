package day18_while_dowhie_loops;
import java.util.*;
public class PinCodeV2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int secretPincode = 4321;
		int pincode = 0;
		int attempts = 0;
		
		while(pincode != secretPincode) {
			System.out.println("enter pincode");
			pincode = scan.nextInt();
			
			attempts++;
		
		
		if(attempts == 3 && pincode != secretPincode) {
			System.out.println("card is blocked");
			return; //stop execution
		}
	}
System.out.println("Access granted");
}
}