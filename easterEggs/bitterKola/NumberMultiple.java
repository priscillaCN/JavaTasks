import java.util.Scanner;

public class NumberMultiple {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int firstNum = userInput.nextInt();

		System.out.print("Enter second Number: ");
		int secondNum = userInput.nextInt();	

		if (secondNum % firstNum == 0) {
		System.out.printf("%d divided by %d equals %d%n", secondNum, firstNum, secondNum / firstNum);
		}

		System.out.printf("therefore, %d is a multiple of %d", firstNum, secondNum);

	}

}