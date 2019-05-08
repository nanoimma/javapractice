package day21_loops2;
import java.util.*;

public class mentoring0403 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Put a word");
		
		String a = scan.next();
		System.out.println("Put second word");
		String b = scan.next();
		boolean result = false;
		
		if(a.length() > b.length()) {
			if(b.equalsIgnoreCase(a.substring(a.length() - b.length()))) {
				result = true;
			}
		
		else result = false;
		}
		
		else if (b.length() > a.length()) {
			if(a.equalsIgnoreCase(b.substring(b.length () - a.length()))) {
				result = true;
			}
			
		}else result = false;
		if(a.equalsIgnoreCase(b)){
			result = true;
		}
		System.out.println(result);
	}

}
