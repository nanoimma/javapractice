package day19_loops;

public class DoWhileSum {
	public static void main(String[] args) {
		
	
	
	int sum = 0;
	int n = 1;
	
	do {
		sum = sum + n;
		n++;
		
		
	}while(n <= 90);
System.out.println(sum);
}
}