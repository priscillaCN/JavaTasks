import java.util.Scanner;

public class TaskSeventeen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int anyNum = userInput.nextInt();

		System.out.printf("Your number plus 10 is: %d", anyNum + 10);	


	}

}