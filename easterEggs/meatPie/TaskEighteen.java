import java.util.Scanner;

public class TaskEighteen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int anyNum = userInput.nextInt();

		System.out.printf("Your number minus 5: %d", anyNum - 5);	


	}

}