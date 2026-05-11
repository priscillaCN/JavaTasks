public class Duplicate {

	public static void main(String[] args) {

		java.util.Scanner collectInput = new java.util.Scanner(System.in);	

		int [] numbers = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int numberElement = 0;

		for(int count = 1; count < numbers.length; count++) {
			System.out.println("Enter a number: ");
			int input = collectInput.nextInt();
			numbers[count] = numberElement;
		}

			for(int index = 0; index < numbers.length; index++) {
				if (numberElement >= 10 && numberElement <= 100) {
				numbers [index] = numberElement;
				System.out.print(numbers [index]);
				}	
	
			}

		


	}

}