package day21_loops2;
import java.util.Scanner;

public class mentoring0403part2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		
		System.out.println("Enter a word");
		String str = scan.next();
		
		boolean result = false;
		
		int i = str.indexOf('x');
		
		//if(str.indexOf("x") == -1){
		//	result = false;
			
			
		//}
		if((i + 1) < str.length() && str.charAt(i+1) == 'x') {
			result = true;
		}
		
		System.out.println(result);
	}

}
