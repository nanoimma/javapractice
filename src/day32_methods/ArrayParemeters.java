package day32_methods;

import java.util.Arrays;

public class ArrayParemeters {
	public static void main(String[] args) {
		int [] myArray = {44, 22, 66, 11};
		int[] myArray2 = {11, 33, 543, 88, 99, 234};
print2Arrays(myArray, myArray2);
		}
	
	public static void printArray(int[] nums) {
		for(int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	
	public static void print2Arrays(int[] arr1, int[] arr2) {
		if(arr1.length > arr2.length) {
			System.out.println(Arrays.toString(arr1) );
			System.out.println(Arrays.toString(arr2) );
		}else {
			System.out.println(Arrays.toString(arr2));
			System.out.println(Arrays.toString(arr1));
		}
	}

}
