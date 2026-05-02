public class ArraySnacks {

	public static int ArrayMaximum (int[] array) {
		
		int maximumNumber = array[0];
		
		for (int element = 0; element < array.length; element++) {
			
			if (array[element] > maximumNumber) 
				maximumNumber = array[element];
			
		}

		return maximumNumber;

	}
	
	
	
	public static void reverseArray (int[] array) {
		
		for (int element = array.length - 1; element > -1; element--)
			System.out.print(array[element] + " ");	
		
	}
	
	
	public static boolean isElementFound(int[] array, int userNumber) {
		
		
		for (int element = 0; element < array.length; element++) {
			
			if(userNumber != array[element]) {
				return false;
		}
				
		}
		
		return true;
	}
	
	
	public static void printElementsInOddArraypositions(int[] array) {
		
		for (int element = 0; element < array.length; element++) {
			
			if(array[element] % 2 != 0) 
				System.out.print(array[element] + " ");
		}
		
	}
	
	
	public static void printElementsInEvenArraypositions(int[] array) {
		
		for (int element = 0; element < array.length; element++) {
			
			if(array[element] % 2 == 0) 
				System.out.print(array[element] + " ");
		}
		
	}
	
	public static void runningTotalOfArray(int[] array) {
		
		 int runningTotal = 0;
		 
		for (int element = 0; element < array.length; element++) {
			
			runningTotal += array[element];
			System.out.println(runningTotal);

		}
			
	}
	
	
	public static boolean isPalindrome(String word) {
		
		char[] letters = word.toCharArray();
		
		for (int element = 0; element < letters.length / 2; element++) {

			if (letters[element] != letters[letters.length - 1 - element]) {
            return false; 
			
        }
    }

		return true;
		
	}
	
	
	public static int sumOfNumbersForLoop(int[] array) {
		
		 int sum = 0;
		 
		for (int element = 0; element < array.length; element++) {
			
			sum += array[element];

		}
		
		return sum;
			
	}
	
	
	public static int sumOfNumbersWhileLoop(int[] array) {
		
		 int sum = 0;
		 
		 int element = 0;
		 
		while (element < array.length) {
			
			sum += array[element];
			
		element++;
		}
		
		return sum;
			
	}
	
	
	public static int sumOfNumbersDoWhileLoop(int[] array) {
		
		int sum = 0;
		 
		int element = 0;
		 
		do {
			sum += array[element];
			element++;
		}
		 
		while (element < array.length); 
		
		return sum;
			
	}
	
	
	
	//CALLING ALL FUNCTIONS IN MAIN METHOD
	
	
	public static void main(String... args) {
		
		java.util.Scanner collectInput = new java.util.Scanner(System.in);
		
		int[] numbers = {2, 5, 16, 9, 38};
		
		int max = ArrayMaximum(numbers);
			System.out.print(max);
			
		System.out.println();

		
		reverseArray(numbers);
		
		
		System.out.println();
		
		System.out.println("Enter a number: ");
		int userNumber = collectInput.nextInt();
		
		boolean isFound = isElementFound(numbers);
			System.out.println(userNumber + " occurs in the array: " + isFound);
		
		
		printElementsInOddArraypositions(numbers);
		
		System.out.println();
		
		
		printElementsInEvenArraypositions(numbers);
		
		System.out.println();
		
		
		runningTotalOfArray(numbers);
		
		System.out.println();
		
		
		System.out.println("Enter a word to check if it's a palindrome: ");
		
		String word = collectInput.nextLine();
		Boolean checkIfPalindrome = isPalindrome(word);
		
			System.out.println(word + " is a palindrome: " + checkIfPalindrome);
	
		int sumOne = sumOfNumbersForLoop(numbers);
			System.out.println("Sum is: " + sumOne);
			
		int sumTwo = sumOfNumbersWhileLoop(numbers);
			System.out.println("Sum is: " + sumTwo);	
			
		int sumThree = sumOfNumbersDoWhileLoop(numbers);
			System.out.println("Sum is: " + sumThree);
				
		
	
	}

}

