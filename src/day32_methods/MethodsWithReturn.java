package day32_methods;

public class MethodsWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println(giveMeYourName());
		
	}
	 // this method returns int value
	public static int giveMe10$() {
		return 10;
	}
	
	public static String giveMeYourName() {
		String name = "Imma";
		return name;
	}

}
