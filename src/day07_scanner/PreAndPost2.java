package day07_scanner;

public class PreAndPost2 {
	public static void main(String[] args) {
		int messages = 10;
		messages++;
		++messages;
		System.out.println("Messages: "+ messages);
		
		int readMessages = --messages;
		System.out.println("ReadMessages: "+readMessages);
		System.out.println("Messages: "+ messages);
		
		int unreadMessages = readMessages--;
		
		System.out.println("unreadMessages: "+unreadMessages);
		System.out.println("readMessages: "+readMessages);
		
		int total = unreadMessages++ - readMessages--;
		 System.out.println("unreadMessages: "+unreadMessages);
		 System.out.println("readMessages: "+readMessages);
		 System.out.println("total: "+ unreadMessages + readMessages);
		 
		 
		 
	}

}
