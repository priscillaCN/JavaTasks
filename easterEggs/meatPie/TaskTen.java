import java.util.Scanner;

public class TaskTen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int userNum = userInput.nextInt();

		System.out.printf("The double is: %d", userNum + userNum);	


	}

}