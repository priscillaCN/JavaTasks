public class Reversed {

	public static void main(String[] args) {

		java.util.Scanner collectInput = new java.util.Scanner(System.in);	

		int [] numbers = new int [10];
		int numberElement = 0;

		for(int count = 1; count < numbers.length; count++) {
			System.out.println("Enter a number: ");
			int input = collectInput.nextInt();
			numbers[count] = numberElement;
		}

		for (int count = numbers.length - 1; count > -1; count--) {
			System.out.print(numbers[count]);
		} 

	}
}
