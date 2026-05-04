public class CountLettersInAString {

	public static int countLetters (String s) {
	
	char[] letters = s.toCharArray();
	
	int numberOfLetters = letters.length;
	
	return numberOfLetters;
	
	}
	
	
	//USING METHOD IN A PROGRAM
	
	public static void main(String... args) {
		
		java.util.Scanner collectInput = new java.util.Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String s = collectInput.nextLine();
		
		int numOfLetters = countLetters (s);
		
		System.out.print(s + " has " + numOfLetters + " letters.");
		
		
	}

}