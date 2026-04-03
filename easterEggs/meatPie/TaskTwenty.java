import java.util.Scanner;

public class TaskTwenty {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter your length: ");
		int length = userInput.nextInt();

		System.out.print("Enter your width: ");
		int width = userInput.nextInt();

		System.out.printf("The ares is: %d", length * width);	


	}

}