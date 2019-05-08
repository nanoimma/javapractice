package day27_arrays05;

import java.util.Arrays;

public class CopyOf {
	public static void main(String[] args) {
		double[] d1 = {2.3, 4.5, 12.4};
		double[] d2 = d1;
		
		System.out.println(Arrays.toString(d1));
        System.out.println(Arrays.toString(d2));
        
        double[] d3 = Arrays.copyOf(d2, d2.length);
        
        
        
int[] brandNew = {34, 23, 54, 23,};
System.out.println("lengrh before: " + brandNew.length);
brandNew = Arrays.copyOf(brandNew, brandNew.length + 5);
System.out.println("Length after:" + brandNew.length);




}
}