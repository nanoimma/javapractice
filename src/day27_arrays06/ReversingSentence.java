package day27_arrays06;

public class ReversingSentence {
	public static void main(String[] args) {
		
		
		String sentence = "you love java";
		String[] arrSentence = sentence.split(" ");
		System.out.println(arrSentence.length);
		
		for (int i = arrSentence.length - 1; i >= 0; i--) {
			System.out.print(arrSentence[i] + " ");
			//+= arrSentence[i] + " "
			
		}
	}

}
