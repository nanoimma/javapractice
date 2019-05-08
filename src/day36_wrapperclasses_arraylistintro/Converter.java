package day36_wrapperclasses_arraylistintro;

public class Converter {
public static void main(String[] args) {
	System.out.println(milesToKms(10));
	
	
}
public static double milesToKms(double miles) {
	
	double kmValue = miles * 1.609;
	return kmValue;
}

}
