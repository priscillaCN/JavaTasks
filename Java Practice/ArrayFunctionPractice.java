public class ArrayFunctionPractice {

	public static void printArray (int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");	
		}
		
	}
	
	public static int arraySum (int [] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		
		return total;
	}


	public static int arrayMax (int [] array) {
		
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > max) max = array[i];
			
		}
		
		return max;
		
	}
	
	
		public static int arrayMin (int [] array) {
		
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < min) min = array[i];
			
		}
		
		return min;
		
	}



	public static int arrayRange (int [] array) {
		
		int max = array[0];
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > max) max = array[i];
			
			if (array[i] < min) min = array[i];
			
		}
		
		int range = max - min;
		
		return range;
		
	}
	
	
		public static long arrayMultiply (int [] array) {
		long total = 1;
		for (int i = 0; i < array.length; i++) {
			total *= array[i];
		}
		
		return total;
	}
	
	
		public static void arrayTimesTwo (int [] array) {
			
		for (int i = 0; i < array.length; i++)
			array[i] = array[i] * 2;
			
		}
	
	//public static void 

	public static void main(String... args){
		
		int [] numbers = {12, 3, 25, 56, 9, 4, 102, 37};
			printArray (numbers);

		System.out.println();
			
		int sum = arraySum(numbers);
			System.out.println("sum : " + sum);
			
		int maximum = arrayMax(numbers);
			System.out.println("The maximum number is: " + maximum);
			
		int minimum = arrayMin(numbers);
			System.out.println("The minimum number is: " + minimum);
			
		int numberRange = arrayRange(numbers);
			System.out.println("The range is: " + numberRange);
			
		long product = arrayMultiply(numbers);
			System.out.println("total : " + product);
			
		System.out.print("Before : ");
		printArray (numbers);

		System.out.println();
		
		arrayTimesTwo(numbers);
		
		System.out.print("After : ");
		printArray (numbers);
		
	}
	
}