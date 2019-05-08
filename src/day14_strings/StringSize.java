package day14_strings;

public class StringSize {
	public static void main(String[] args) {
		String str1 = "Good Morning";
		
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		
		if(str1.equalsIgnoreCase("good morning")) {
				System.out.println("Match - ignore case");
				
	}else {
		System.out.println("Not Match - ignore case");
	}
System.out.println(str1.toUpperCase());
System.out.println(str1);
str1 = str1.toUpperCase();
System.out.println("After assignment: " + str1);

if(str1.toLowerCase().equals("good morning")) {
	
}

String myName = "Imma";
System.out.println(myName.length());
int length = myName.length();
System.out.println("My Name's length: " + length);

String userName = "Aigerim";
if(userName.length() == 8) {
	System.out.println("Valid Username");
}else {
	System.out.println("Invalid Username");
	
	String password = "nanoimma";
	if(password.length() >= 6) {
		System.out.println("Valid password");
	}else {
		System.out.println("Invalid password");
		
		int passwordLength = password.length();
		
		if (passwordLength < 6) {
			System.out.println("Invalid password");
		}else {
			System.out.println("Valid password");
		}
	
}
}
	}
}
