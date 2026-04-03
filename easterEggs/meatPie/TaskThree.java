import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {

		Scanner printSum = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number1 = printSum.nextInt();

		System.out.print("Enter second number: ");
		int number2 = printSum.nextInt();

		System.out.printf("The sum is: %d", number1 + number2);

	}

}