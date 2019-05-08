package day27_arrays05;
import java.util.Scanner;

public class CanvasCourses {
public static void main(String[] args) {
	
	String url = "https://learn.cybertekschool.com/courses/149";
	
	String[] splited = url.split("/");
	
	System.out.println(splited.length);
	System.out.println(splited[splited.length - 1]);
	
	int courseId = Integer.parseInt(splited[4]);
	
	System.out.println(courseId);
	
	switch(courseId) {
	case 147:
		System.out.println("the course is Java Programming");
		break;
	case 204:
		System.out.println("Mentoring Session");
		break;
	case 149:
		System.out.println("SDLC");
		break;
	case 152:
		System.out.println("Qa Testing");
		break;
	case 144:
		System.out.println("Team activity");
		break;
	case 143:
		System.out.println("Welcome Kit");
		break;
		default:
			System.out.println("Invalid number for the course");
			break;
	
}
}
}