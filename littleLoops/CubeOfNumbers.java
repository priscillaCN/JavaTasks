public class CubeOfNumbers {

	public static void main(String[] args) {

		int number = 1;
		int product = 1;

		while (number <= 5) {
		   product = number * number * number;
		   System.out.println(product);
		number++;
		}
	
	}

}