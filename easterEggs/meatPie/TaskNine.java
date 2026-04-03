import java.util.Scanner;

public class TaskNine {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("What is your favourite color?");
		String color = userInput.nextLine();

		System.out.printf("Your favorite color is: %s", color);	


	}

}