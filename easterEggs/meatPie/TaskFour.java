import java.util.Scanner;

public class TaskFour {

	public static void main(String[] args) {

		Scanner inputNum = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number1 = inputNum.nextInt();

		System.out.print("Enter second number: ");
		int number2 = inputNum.nextInt();

		System.out.printf("The difference is: %d", number1 - number2);		

	}

}