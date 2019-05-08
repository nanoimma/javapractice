package day08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		//Cast Double value to int
		
		int i = (int)3.4; //will remove .4
		
		double price = 230.50;
		int dollars = (int)price;
		
		System.out.println("Price: " + price);
		System.out.println("Dollars: " + dollars);
		
		//whole numbers. bye, short, int
		
		int count = 44;
		byte byteCount = (byte) count;
		System.out.println("ByteCount: " + byteCount);
		
	}

}
