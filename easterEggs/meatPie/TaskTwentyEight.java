import java.util.Scanner;

public class TaskTwentyEight {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int anyNum = userInput.nextInt();

		System.out.printf("Your number divided by 3 is: %d", anyNum / 3);	


	}

}