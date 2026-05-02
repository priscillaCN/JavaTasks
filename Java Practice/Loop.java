public class Loop {

	public static void main(String[] args) {
	
		String userInput = "word";
		java.util.Scanner collectInput = new java.util.Scanner(System.in);
	 
		while(!userInput.equals("done")) {
			System.out.println("Enter a word or 'done' to stop: ");
			userInput = collectInput.next();
		
		}
	
	}

}