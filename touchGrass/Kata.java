import java.util.Scanner;

public class Kata {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome To Priscilla's World of Methods. \nTask one is to find the max of two numbers.");
		
		System.out.println("Enter the first number: ");
		int firstNumber = input.nextInt();

		System.out.println("Enter the second number: ");
		int secondNumber = input.nextInt();

		int max = findTheMax(firstNumber, secondNumber);
		
		System.out.println("The maximum of the two numbers is: " + max);
		
		System.out.println("Task two is to tell if a number is even.");

		System.out.print("Enter any number: ");
		int number = input.nextInt();
		
		boolean answer = isEven(number);
		
		System.out.println("Is the number entered even? " + answer);
		
		System.out.println("Task four is to subtract two numbers and return a positive number irrespective of the order they are entered.");
		
		System.out.println("Enter the first number: ");
		firstNumber = input.nextInt();

		System.out.println("Enter the second number: ");
		secondNumber = input.nextInt();
		
		int result = subtract(firstNumber, secondNumber);
		
		System.out.println("The asnwer is: " + result);
		

	}

		public static int findTheMax(int firstNumber, int secondNumber) {

			if(firstNumber > secondNumber) {
				return firstNumber;
			}
			
			else{
				return secondNumber;
			}

		} 
		
		public static boolean isEven(int number) {

			int zero = 0;
			int two = 2;

			if(number % two == zero) {
				return true;
			}
			return false;

		} 
		
		public static int subtract(int firstNumber, int secondNumber) {
			if(firstNumber > secondNumber){
				return firstNumber - secondNumber;
			}else{
				return secondNumber - firstNumber;
			}
		}


}