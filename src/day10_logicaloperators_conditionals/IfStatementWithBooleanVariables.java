package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = true;
		if(isBreakTime == true) {
			System.out.println("BREAK TILL 8:35");
		}else {
			System.out.println("Not a Break Time yet.");
			
			//second version
			if(isBreakTime) {
				System.out.println("BREAK TILL 8:35");
			}else {
				System.out.println("Not a Break Time yet.");
		}
	}
boolean qualified = false;


}
}
