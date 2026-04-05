import java.util.Scanner;

public class TaskNine {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter initial velocity (m/s): ");
		int velocity = userInput.nextInt();

		System.out.print("Enter time span (t): ");
		int time = userInput.nextInt();

		System.out.print("Enter acceleration (m/s^2): ");
		int acceleration = userInput.nextInt();

		System.out.printf("The distance covered is: %dm", (velocity * time) + (acceleration * time * time / 2));

	}

}