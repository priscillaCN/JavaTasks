import java.util.Scanner;

public class TaskFourteen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int num1 = userInput.nextInt();

		System.out.print("Enter second integer: ");
		int num2 = userInput.nextInt();

		System.out.print("Enter third integer: ");
		int num3 = userInput.nextInt();

		System.out.printf("The average is: %d", (num1 + num2 + num3) / 3);	


	}

}