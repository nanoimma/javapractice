package day32_methods;

public class Cooking {
	public static void main(String[] args) {
		makePancakes();
		
	}
	
	public static void makePancakes() {
		System.out.println("~~ PANCAKES RECIPE ~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~ Enjoy your pancakes ~~");
	}
	public static void add(String ing) {
		System.out.println("Add " + ing);
	}
	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}
 public static void fry(int minutes) {
	 System.out.println("Fry for " + minutes + " minutes");
	 
 }
}
 
