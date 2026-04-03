import java.util.Scanner;

public class TaskTwentyOne {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter the base of triangle: ");
		int base = userInput.nextInt();

		System.out.print("Enter the height of triangle: ");
		int height = userInput.nextInt();

		System.out.printf("The area of triangle is: %d", (base * height) / 2);	

	}

}