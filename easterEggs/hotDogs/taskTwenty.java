import java.util.Scanner;

public class TaskTwenty {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter distance to drive: ");
		double distance = userInput.nextDouble();

		System.out.print("Enter fuel efficiency of car: ");
		Double fuelEfficiency = userInput.nextDouble();
	
		System.out.print("Enter price per gallon: ");
		Double gallonPrice = userInput.nextDouble();

		System.out.printf("The cost of the trip is: %.2f", (distance / fuelEfficiency) * gallonPrice);

	}

}