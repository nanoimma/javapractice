package day34_methods06;

public class CountArray {
	public static void main(String[] args) {
		
		int[] nums = {2,3,4,5,5,6,6,6,7,5,5,12};
	    //1. with Print return right away
		System.out.println(findOccurences(nums, 5));
		System.out.println(findOccurences(nums, 6));
		//2. assign return value into a variable
		int five = findOccurences(nums, 5);
		System.out.println("5 values: " + five);
		

	}
	/*
	Class CountArray
	Method findOccurences
	Return type: int
	Params. int[] array, int value
	Method will look for value in the array 
	and return the count of occurences
	 */
	public static int findOccurences(int[] array, int value ) {
		int counter = 0;
		for(int num : array) {
			if(num == value) {
				counter++;
			}
		}
		return counter;
	} 
	
	
	
	
	
	
}