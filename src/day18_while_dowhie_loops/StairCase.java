package day18_while_dowhie_loops;

public class StairCase {
	public static void main(String[] args) {
		
		String stairs ="*";
		int num = 1;
		while(num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		}
		
		stairs = "*";
		while(stairs.length() <= 10) {
			System.out.println(stairs);
			stairs += "*";
		}
		
		
		/*stairs = stairs + "*";
		System.out.println(stairs);
		
		stairs += "*";
		System.out.println(stairs);
		*/
		
		
	}

}
