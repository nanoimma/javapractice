package day36_wrapperclasses_arraylistintro;

public class q1 {
	public static void main(String[] args) {
		
		
		
	}
public static boolean has12(int[] nums) {
	boolean one = false;
	boolean two = false;
	
	for(int i = 0; i < nums.length; i++) {
		for (int j = 0; j < nums.length; j++) {
			
		
		if(nums[i] == 1) {
			one = true;
			if(i + j < nums.length && nums[i+j] == 2) {
				two = true;
			}
		}
	}
		
}
	return one && two;
}
}