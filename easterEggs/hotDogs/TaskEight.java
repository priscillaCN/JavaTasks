import java.util.Scanner;

public class TaskEight {

	public static void main(String[] args) {

		int day = 1440;
		int year = 365 * day;

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter number of minutes: ");
		int number = userInput.nextInt();

		int maxYears = number / year;
		int remainder = number % year;
		int daysLeft = remainder / day;

		System.out.printf("The number of years and days is: %dyears and %ddays", maxYears, daysLeft);			

	}

}