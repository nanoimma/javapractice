package day27_arrays05;

public class Tools {
public static void main(String[] args) {
	
	//Java --> programming language
	//Selenium --> Test Automation
	//TestNG --> Unit Tests
	//JUnit --> Unit Tests
	//Cucumber --> BDD Style testing
	//Git --> Version control
	//Maven --> Building and execution for project
	
	
	String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
	
	for (String tool : tools) {
		switch(tool.toLowerCase()) {
		case "java":
			System.out.println("Programming language");
			break;
		case "selenium":
			System.out.println("Test Automation");
			break;
		case "testNG":
		case "junit":
			System.out.println("Unit Tests");
			break;
		case "cucumber":
			System.out.println("BDD Style testing");
			break;
		case "git":
			System.out.println("Version control");
			break;
		case "maven":
			System.out.println("Building and execution for project");
			break;	
			default:
				System.out.println("");
			
		//if(tools[0].equals("Java")) {
			//System.out.println("Programming language");
			//if(tools[1].equals("Selenium")) {
			//	System.out.println("Test Automation");
				//if(tools[1].equals("Selenium")) {
				//	System.out.println("Test Automation");
			
		}
		
	}
	
}
}
