package day12_swith_ternary;

public class SwitchScore {
	public static void main(String[] args) {
		
		int score = 2;
		
		switch(score) {
		case 1:
			System.out.println("Score is 1");
			break;
		case 2:
			System.out.println("Score is 2");
			break; //exit switch statement
		case 3:
			System.out.println("Score is 3");
			
			default: //works exactly as "else" 
			System.out.println("Invalid score");
			break; // optional
			
		
		}
	}

}
