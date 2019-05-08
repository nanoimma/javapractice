package day36_wrapperclasses_arraylistintro;

public class WrapperClassMethods {
	public static void main(String[] args) {
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		//convert String to primitive
		int count = Integer.parseInt("123456");
		System.out.println("count: " + count);
		
		int count2 = Integer.valueOf("565656"); //boxing
		System.out.println("count2: " + count2); 
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));
		System.out.println(Character.isLetter('j'));
		System.out.println(Character.isDigit('5'));
		

		String str = "java101";
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		
		String word = "abcd1234j5jl6k7";
		
		for (int i = 0; i < word.length(); i++) {
			if(Character.isDigit(word.charAt(i)));
			System.out.print(word.charAt(i));
			
		}
		
		
	}
	

}
