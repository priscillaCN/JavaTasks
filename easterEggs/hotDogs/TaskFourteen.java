import java.util.Scanner;

public class TaskFourteen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter your weight in pounds: ");
		double weight = userInput.nextDouble();

		System.out.print("Enter your height in inches: ");
		double height = userInput.nextDouble();

		double weightInKg = weight * 0.45359237;
		double heightInM = height * 0.0254;

		System.out.printf("Your BMI is: %f", weightInKg / heightInM * heightInM);

	}

}