package day27_arrays05;

import java.util.Scanner;
public class Times {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter time");
		int[] time1 = new int[2];
		 int [] time2 = new int[2];
		 
		 time1[0] = scan.nextInt();
		 time1[1] = scan.nextInt();
		 time2[0] = scan.nextInt();
		 time2[1] = scan.nextInt();
		 
		 if(time1[0] < 0 || time1[0] > 23) {
			 System.out.println("Time 1 has invalid hour");
			 return;
			  }
		 
		 if(time1[1] < 0 || time1[1] > 59) {
			 System.out.println("Time 1 has invalid minutes");
			 return;
			  }
		 
		 
		 if(time2[0] < 0 || time2[0] > 23) {
			 System.out.println("Time 2 has invalid hour");
			 return;
			  }
		 
		 if(time2[1] < 0 || time2[1] > 59) {
			 System.out.println("Time 2 has invalid minutes ");
			 return;
			  }
		 
		 
	
		if(time1[0] < time2[0]) {
			System.out.println("Time 1 is earlier");
		}else if (time1[0] == time2[0] && time1[1] == time1[1]){
			System.out.println("Equal time");
		}else {
System.out.println("Time 2 is earlier");

}
}
}