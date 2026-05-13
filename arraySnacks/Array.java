public class Array {

	public static int [] maximumOccuringNumber (int[] numbers) {
		
		int [] occur = new int [6];
		
		for(int number : numbers) {
			int count = 0;
		
		
		for(int value: numbers) {
			if  (numbers[value] == occur[number]) {
				return new int [value];
			}
		
		}
		
		return new int [];
		
		}
		

	}


	public static void main(String... args) {
		
		int [] numbers = {2, 1, 2, 5, 2, 4};
		
		int [] maxOccuringNum = maximumOccuringNumber (numbers);
		
		System.out.print(maxOccuringNum);
	}

}