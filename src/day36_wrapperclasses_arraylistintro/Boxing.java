package day36_wrapperclasses_arraylistintro;

public class Boxing {
	public static void main(String[] args) {
		
		//autoboxing
		
		Integer num1 = 123;
		int n = 5;
		Integer n2 = n;
		
		//unboxing -> object > primitive
		
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
		
		long l1 = new Long(6000000); //unboxing
		long l2 = new Long(34544363L); //no boxing
		long l3 = l2; //auto unboxing
		Long l4 = l3; //auto boxing
		
		Integer num3 = Integer.valueOf(345);
		//Doule d3 = num3 
		
	}

}
