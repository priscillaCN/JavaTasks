public class CatchThief {

	public static void main(String... args) {

		java.util.Scanner collectInput = new java.util.Scanner(System.in);

		String magicWord = "";

		while(!magicWord.equalsIgnoreCase("thief")){

			System.out.println("Enter the magic word to catch the thief: ");	
			//magicWord = collectInput.nextLine().trim();
			magicWord = collectInput.nextLine().replace("", " ");


			}

		System.out.println("magic word correct. thief caught.");

	}

}