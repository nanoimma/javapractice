package day27_arrays06;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		//read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		System.out.println("Data size: " + data.length);
		
		//print each restaurant info in separate lines
		//int counter = 0;
		//for(String s : data) {
		//	System.out.println(counter + ">" + s);
			//counter ++;
		//}
		System.out.println(data[0]);
		System.out.println(data[1]);
		
		System.out.println(data[data.length - 1]);
		int count = 0;
		for (String va : data){
			if(va.contains("VA")) {
				System.out.println(va);
				count ++;
				}
		}
			for(String res : data) {
				if(res.contains(",VA,")) {
					String[] resArr = res.split(",");
					System.out.println(resArr[2] + " - " + resArr[1]);
				}
			}
			
			
				
			
		
		System.out.println(count);
	}
}