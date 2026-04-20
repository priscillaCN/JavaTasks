import java.util.Scanner;

public class Kata {

	public static void main(String[] args) {

		Scanner collectInput = new Scanner(System.in);

		System.out.println("Welcome To Priscilla's World of Methods. \n\nTask one is to find the max of two numbers.\n");
		
		System.out.println("Enter the first number: ");
		int firstNumber = collectInput.nextInt();

		System.out.println("Enter the second number: ");
		int secondNumber = collectInput.nextInt();

		int max = findTheMax(firstNumber, secondNumber);
		
		System.out.println("The maximum of the two numbers is: " + max + "\n");
		
		System.out.println("Task two is to tell if a number is even.\n");

		System.out.println("Enter any number: ");
		int number = collectInput.nextInt();
		
		boolean answer = isEven(number);
		
		System.out.println("Is the number entered even? " + answer + "\n");
		
		System.out.println("Task four is to subtract two numbers and return a positive number \nirrespective of the order they are entered.\n");
		
		System.out.println("Enter the first number: ");
		firstNumber = collectInput.nextInt();

		System.out.println("Enter the second number: ");
		secondNumber = collectInput.nextInt();
		
		int result = subtract(firstNumber, secondNumber);
		
		System.out.println("The asnwer is: " + result + "\n");
		
		System.out.println("Task five is to get the quotient of two integers\n");
		
		System.out.println("Enter the first number:");
		float numberOne = collectInput.nextFloat();
		
		System.out.println("Enter the sceond number:");
		float numberTwo = collectInput.nextFloat();
		
		float quotient = divide(numberOne, numberTwo);
		
		System.out.println("The answer is: " + .2fquotient + "\n");

	}

		public static int findTheMax(int firstNumber, int secondNumber) {

			if(firstNumber > secondNumber) {
				return firstNumber;
			}
			
			else {
				return secondNumber;
			}

		} 
		
		public static boolean isEven(int number) {

			int zero = 0;
			int two = 2;

			if(number % two == zero) {
				return true;
			}
			else {
			return false;
			}

		} 
		
		public static int subtract(int firstNumber, int secondNumber) {
			if(firstNumber > secondNumber) {
				return firstNumber - secondNumber;
			}
			else {
				return secondNumber - firstNumber;
			}
		}
		
		public static float divide(float numberOne, float numberTwo) {
			if (numberTwo == 0) {
				return (int) 0;
			}
			else {
			return numberOne / numberTwo;
			}
			
		}


}