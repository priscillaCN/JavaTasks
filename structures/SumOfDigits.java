public class SumOfDigits {

	public static int sumDigits(long n) {
			
		int sum = 0;
		
		while (n != 0) {
			
			long singleDigit = n % 10;
			sum += singleDigit;
			n = n / 10;
			
		}	
			
		return sum;
	
	}
	
	
	// USING THE FUNCTION IN A PROGRAM
	
	public static void main(String... args) {
		
		java.util.Scanner collectInput = new java.util.Scanner(System.in);
		
		System.out.println("Enter a number with more than one digit: ");
		long n = collectInput.nextLong();
		
		int sumOfDigitsInN = sumDigits(n);
		
		System.out.print("The sum is: " + sumOfDigitsInN);
	}
}