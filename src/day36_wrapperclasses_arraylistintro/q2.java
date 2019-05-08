package day36_wrapperclasses_arraylistintro;

import java.util.Arrays;

public class q2 {

	public static void main(String[] args) {
		int[] arr = {2,3,1,40,4,5,10,5,4,};
		tenRun(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static int[] tenRun(int[] nums) {
		int i = 0;
		int current;
		while(i < nums.length && nums[i]%10 != 0)
			i++;
		
		if(i == nums.length)return nums;
		
		current = nums[i];
		i++;
		do {
			if(nums[i]%10 == 0 )
				current = nums[i];
			else
				nums[i]= current;
			i++;
			
		}while(i < nums.length);
		return nums;
		
		
	}
}
