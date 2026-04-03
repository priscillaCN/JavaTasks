import java.util.Scanner;

public class TaskSeven {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = userInput.nextInt();

		System.out.print("Enter second number: ");
		int num2 = userInput.nextInt();

		System.out.printf("The sum is: %d%n", num1 + num2);
		System.out.printf("The product is: %d", num1 * num2);	
	


	}

}