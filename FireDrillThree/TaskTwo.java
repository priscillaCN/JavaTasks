public class TaskTwo {

	public static void main(String... args) {

		java.util.Scanner collectInput = new java.util.Scanner(System.in);

		int [] numbers = new int[10];
		int numberElement = 0;
		int count = 0;


		for(count = 0; count < numbers.length ; count++) {
			System.out.println("Enter number for index " + count);
			numberElement = collectInput.nextInt();
			numbers[count] = numberElement;
		}

		for(int index = 0; index < numbers.length; index++) {
			System.out.println(numbers[index]);
		}

	}


}