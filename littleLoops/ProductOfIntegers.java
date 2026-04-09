public class ProductOfIntegers {

	public static void main(String[] args) {

		int number = 1;
		int product = 1;

		while (number <= 10) {
		   product *= number;
		number++;
		}
	
		System.out.printf("The product of integers from 1 to 10 is %d", product);
	}

}