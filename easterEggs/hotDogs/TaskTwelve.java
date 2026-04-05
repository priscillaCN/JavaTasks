import java.util.Scanner;

public class TaskTwelve {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter take-off speed (m/s): ");
		int speed = userInput.nextInt();
		
		
		System.out.print("Enter acceleration (m/s^2): ");
		int acceleration = userInput.nextInt();

		System.out.printf("The minimum runway length needed is: %dm", speed * speed / (2 * acceleration));

	}

}