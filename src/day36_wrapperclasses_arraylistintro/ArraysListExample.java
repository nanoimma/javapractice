package day36_wrapperclasses_arraylistintro;
import java.util.ArrayList;
public class ArraysListExample {
	public static void main(String[] args) {
		
		//declare array list called language
		
		ArrayList<String> languages = new ArrayList <>();
		languages.add("java");
		languages.add("kyrgyz");
		
		//remove java
		
		languages.remove(0);
		
		System.out.println(languages.toString());
		

}
}