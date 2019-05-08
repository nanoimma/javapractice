package day27_arrays05;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		
		int[] nums = {43, 12, 4, 1, 3, 5,};
		System.out.println(nums);
		
		//to String method
		
		System.out.println(Arrays.toString(nums));
		
		
		//sort array in ascending method
		
	     Arrays.sort(nums);
			System.out.println(Arrays.toString(nums));
			
			String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic","Uzbek"};
			
			Arrays.sort(languages);
			System.out.println(Arrays.toString(languages));
			
			int[] nums2 = {345, 567,987,123,4, 76, 98};
			//find lowest and largest values from num2 arra
			Arrays.sort(nums2);
			int lowest = nums2[0];
			int largest = nums2[nums2.length - 1];
			
			
			
			System.out.println("Lowest: " + lowest);
			System.out.println("Largest: " + largest);
			
			
			
			
		
	}

}
