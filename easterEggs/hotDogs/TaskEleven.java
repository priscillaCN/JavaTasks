import java.util.Scanner;

public class TaskEleven {

	public static void main(String[] args) {

		int population = 312032486;
		int secPerYear = 31536000;
		int birthsPerYear = secPerYear / 7;
		int deathsPerYear = secPerYear / 13;
		int immPerYear = secPerYear / 45;
		int changePerYear = birthsPerYear + immPerYear - deathsPerYear;

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter number of years: ");
		int years = userInput.nextInt();

		int popChange = changePerYear * years;

		System.out.printf("The total population after %dyears is: %d", years, population + popChange);

	}

}