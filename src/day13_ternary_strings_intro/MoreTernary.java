package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main(String[] args) {
		
		String quality = "good";
		int rating = (quality.equals("good")) ? 100 : 0;
		
		System.out.println("Rating:" + rating);
		
		int pmhour = 6;
		
		boolean rushHour = pmhour >= 4 && pmhour <= 7 ? true : false;
		
	
		
		String result = rushHour == true ? "yes" : "no";
		
		System.out.println(pmhour + " is rush hour? " + rushHour);
		
		
		int amhour = 8;
		
		String amRushHour = amhour > 6 && amhour < 9 ? "yes" : "no";
		
		System.out.println(amhour + " is rush hour? " + amRushHour);
		
		
	}

}
