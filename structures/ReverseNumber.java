public class ReverseNumber {

	public static int reverse(int number) {
		
			while (number != 0) {
			
			int singleDigit = number % 10;
			int holdSingleDigit = singleDigit;
			number = number / 10;
			
			System.out.print(holdSingleDigit + "");	
		
	}
	

	//USING THE METHOD IN A PROGRAM
		
	public static void main(String... args) {
		
		java.util.Scanner collectInput = new java.util.Scanner(System.in);
		
		System.out.println("Enter a number with more than one digit: ");
		int number = collectInput.nextInt();
		
		reverse(number);
		
	}


}