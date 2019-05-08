package day36_wrapperclasses_arraylistintro;
import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		//Create an Array List
		
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer>nums = new ArrayList<>();
		
		//assign values into ArrayList
		
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		
		//nums.add(e)
		//
		
		nums.add(100);
		nums.add(99);
		
		
		
		System.out.println(names.get(0));
		System.out.println("Names count " + names.size());
		System.out.println("Nums count " + nums.size());
		
		
	}
}
