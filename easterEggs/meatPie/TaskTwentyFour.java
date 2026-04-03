import java.util.Scanner;

public class TaskTwentyFour {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = userInput.nextInt();

		System.out.print("Enter second number: ");
		int num2 = userInput.nextInt();

		System.out.printf("%s%n%s%d%n%s%d", "Let's swap the numbers", "first number is: ", num2, "second number is: ", num1);	


	}

}