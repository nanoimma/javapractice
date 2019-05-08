package day40_customclasseswithmethods;

public class MyContacts {
	public static void main(String[] args) {
		//create Contact object
		
		Contact contact1 = new Contact();
		contact1.name = "Asel Byeee";
		contact1.phoneNumber = "108-108";
		contact1.email = "asel@meow";
		
		contact1.call();
		
		Contact imma = new Contact();
		imma.name = "Imma Pkaaa";
		imma.phoneNumber = "(215)605-1117";
		imma.email = "imma@meow";
		
		imma.call();
		imma.sendEmail();
		imma.sendMessage();
		
	}

}
