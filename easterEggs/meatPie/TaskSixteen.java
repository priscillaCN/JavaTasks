import java.util.Scanner;

public class TaskSixteen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int anyNum = userInput.nextInt();

		System.out.printf("Your number times 5 is: %d", anyNum * 5);	


	}

}