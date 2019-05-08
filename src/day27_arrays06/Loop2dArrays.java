package day27_arrays06;

import java.util.Arrays;

public class Loop2dArrays {
	public static void main(String[] args) {
		
		String[][] pizzas = {
			{"pineapple","pepperoni"},
			{"anchovies", "mushroom", "olives"},
			{"4 cheese"},
			{"chicken", "tomatoes", "jalapenoes", "onions"},
			{" green peppers", "zuccini", "brocolli", "spinach", "shrimp"},
			};
			
		System.out.println(Arrays.toString(pizzas[0]));
		
		for(String[] pizza : pizzas) {
			System.out.print(pizza.length+"-");
			System.out.println(Arrays.toString(pizza));
				}
		System.out.println("##### FOR LOOP #####");
		for(int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length + "-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		for(String topping: pizzas [2]) {
			System.out.println(topping);
			
			int[][] students = {
					{4,5,6},
					{12,5,7},
					{23,55,12,55,3},
			};
					for(int[] group : students) {
						for(int studentId : group) {
							System.out.print(studentId + ", ") ;
							
						}
					}
					System.out.println("");
					int [][] nums = {
							{10, 20},//0
							{20, 30, 40, 50},//1
							{100,200,300},//2
							{555,333,111, 444,666,78},//3
					};
							for(int i = 0; i < nums.length; i++) {
								for(int j = 0; j < nums[i].length; j++) {
									System.out.print(nums[i][j] + " ");
								}
							}
					
			
		}
	}
}

