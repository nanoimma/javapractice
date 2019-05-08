package day35_practice;

public class UniqueNumbersInArray {

	
		
	
	public static void main(String[] args) {
		int[] nums = {7, 4, 1, 4, 1, 5, 9, 9, 3};
		findUnique(nums);
		
		
		
		
	}
	
		int counter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[i] == nums[j]) {
					counter ++;
					
					}
				}
				
			if(counter < 2 ) {
				System.out.println(nums[i]);
				
			}
			counter = 0;
			}
	
	