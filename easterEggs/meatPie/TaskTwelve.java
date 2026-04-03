import java.util.Scanner;

public class TaskTwelve {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number1 = userInput.nextInt();
		
		System.out.print("Enter second number: ");
		int number2 = userInput.nextInt();

		System.out.printf("%d %d", number1, number2);	


	}

}