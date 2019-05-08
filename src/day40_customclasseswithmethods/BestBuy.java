package day40_customclasseswithmethods;

public class BestBuy {
	public static void main(String[] args) {
		//System.out.println(brand);
		//Above line will not work, we need object to use brand
		//Create CellPhone object
		
		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand); //null
		System.out.println(cell1.screenSize); //0.0
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.16;
		
		System.out.println("Brand: " + cell1.brand);
		System.out.println("Screen size: " + cell1.screenSize);
		System.out.println("Color: " + cell1.color);
		System.out.println("Price: " + cell1.price);
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Motorola";
		cell2.color = "Pink";
		cell2.price = 199.99;
		cell2.screenSize = 1.5;
		
		
		System.out.println("####CALLING METHODS####");
		cell1.call();
		cell1.message();
		
		
	}

}
