package day33_methods;

public class AgeCalculator {

	public static void main(String[] args) {
		
	}
	
	public static int calculateAge(int year) {
		int currentYear = 2019;
		int age = currentYear - year;
		
		if(age < 0) {
			System.out.println("Invalid age");
			System.exit(0);
		}
		
		else if(age > 1 && age <= 14) {
			System.out.println("child");
			
		}
		
		else if(age > 14 && age <= 25) {
			System.out.println("youngster");
			
			
			
			
		
		}
		return age;
	}
}
