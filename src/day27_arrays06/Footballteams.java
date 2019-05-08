package day27_arrays06;

import java.util.Arrays;

public class Footballteams {
	public static void main(String[] args) {
		
		String[][] teams = new String[2][6];
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		teams[0][1] = "Zarif";
		
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";

		System.out.println("First player of first team");
		System.out.println(teams[0][0]); 
		System.out.println(teams[1][5]); 
		
		
		//print how many rows/teams/arrays
		System.out.println("Teams: " + teams.length);
		System.out.println("People in first team:" + teams[0].length);
		System.out.println("People in second team:" + teams[1].length);
		
		System.out.println(Arrays.deepToString(teams) );
		
		
		int nums[][] = new int [3][4];
		nums[0][0] = 100;
		nums[0][1] = 34534;
		nums[0][2] = 343242;
		nums[0][3] = 34567;
		
		nums[1][0] = 767;
		nums[1][1] = 1234;
		nums[1][2] = 9876;
		nums[1][3] = 234657;
		
		nums[2][0] = 76574;
		nums[2][1] = 87573;
		nums[2][2] = 5478;
		nums[2][3] = 64849;
		
		System.out.println(Arrays.deepToString(nums));
		
		
		int[][] scores = {{3, 5, 10}, {6,4,2}};
		System.out.println("Days played/Number of arrays" + scores.length);
		System.out.println("Values in day 1" + scores[0].length);
		System.out.println("Values in day 2" + scores[1].length);
		
		int [][] values = new int [4][];
		
		
		
		
		
		
		
		
	}

}
