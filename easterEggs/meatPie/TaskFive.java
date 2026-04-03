import java.util.Scanner;

public class TaskFive {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number1 = userInput.nextInt();

		System.out.print("Enter second number: ");
		int number2 = userInput.nextInt();

		System.out.printf("The product is: %d", number1 * number2);

	}

}