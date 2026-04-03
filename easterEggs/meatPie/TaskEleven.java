import java.util.Scanner;

public class TaskEleven {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int userNum = userInput.nextInt();

		System.out.printf("The half is: %d", userNum / 2);	


	}

}