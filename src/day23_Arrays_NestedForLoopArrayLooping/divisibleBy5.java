package day23_Arrays_NestedForLoopArrayLooping;

public class divisibleBy5 {
	public static void main(String[] args) {
		
		
		for (int i = 1; i <=50; i++) {
			if(i%5 == 0)  {
				continue;
			}
			if(i % 20 == 0) {
				break;
			}
			
			System.out.println(i + ",");
		
	}

}
}