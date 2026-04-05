import java.util.Scanner;

public class TaskThirteen {

	public static void main(String[] args) {

		double interestPerYear = 0.0375;
		double interestPerMonth = 0.003125;

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a monthly savings amount: ");
		int savings = userInput.nextInt();

		System.out.printf("Account value for month 1 is: %f%n", savings + interestPerMonth);
		System.out.printf("Account value for month 2 is: %f%n", savings + interestPerMonth * 2);
		System.out.printf("Account value for month 3 is: %f%n", savings + interestPerMonth * 3);
		System.out.printf("Account value for month 4 is: %f%n", savings + interestPerMonth * 4);
		System.out.printf("Account value for month 5 is: %f%n", savings + interestPerMonth * 5);
		System.out.printf("Account value for month 6 is: %f", savings + interestPerMonth * 6);

	}

}