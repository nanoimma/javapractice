package day27_arrays05;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] nums = {1, 4, 7, 16, 77, 16, 32, 21, 10, 12, 16};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.binarySearch(nums, 16));
		
		
	}

}
