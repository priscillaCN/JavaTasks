public class TaskSeven {

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
			System.out.print(numbers[index] + " ");
		}

		System.out.println();

		evenIndexes(numbers);

		System.out.println();

		oddIndexes(numbers);

		System.out.println();

		int addElementsInEvenIndexes = sumOfEvenIndexes(numbers);
			System.out.println("The sum of elements in even indexes is: " + addElementsInEvenIndexes);

		int addElementsInOddIndexes = sumOfOddIndexes(numbers);
			System.out.println("The sum of elements in odd indexes is: " + addElementsInOddIndexes);

		}


	public static void evenIndexes(int[] numbers) {
	
		for (int index = 0; index < numbers.length; index++) {

			if(index % 2 == 0) 
				System.out.print(numbers[index] + " ");	

		}

	}




	public static void oddIndexes(int[] numbers) {
	
		for (int index = 0; index < numbers.length; index++) {

			if(index % 2 != 0) 
				System.out.print(numbers[index] + " ");	

		}

	}


	public static int sumOfEvenIndexes(int[] numbers) {

		int sum = 0;

		for (int index = 0; index < numbers.length; index++) {

			if(index % 2 == 0) 
			sum += numbers[index];

		}

		return sum;

	} 

	public static int sumOfOddIndexes(int[] numbers) {

		int sum = 0;

		for (int index = 0; index < numbers.length; index++) {

			if(index % 2 != 0) 
			sum += numbers[index];

		}

		return sum;

	} 



}