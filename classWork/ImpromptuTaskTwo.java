import java.util.Scanner;

public class ImpromptuTaskTwo {

	public static void main(String[] args) {

		Scanner collectInput = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = collectInput.nextInt();

		int squareOfDigits = 0;
		
		while (number > 0) {

		int singleDigit = number % 10;

		squareOfDigits = singleDigit * singleDigit;

		System.out.println(squareOfDigits); 

		number = number / 10;

		}

	}

}