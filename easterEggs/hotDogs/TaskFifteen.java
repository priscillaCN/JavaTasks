import java.util.Scanner;

public class TaskFifteen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter pointX1: ");
		double pointX1 = userInput.nextDouble();

		System.out.print("Enter pointY1: ");
		Double pointY1 = userInput.nextDouble();

		System.out.print("Enter pointX2: ");
		double pointX2 = userInput.nextDouble();

		System.out.print("Enter pointY2: ");
		Double pointY2 = userInput.nextDouble();	

		System.out.printf("The distance is: %.4f", Math.sqrt((pointX2 - pointX1) * (pointX2 - pointX1)) + Math.sqrt((pointY2 - pointY1) * (pointY2 - pointY1)));

	}

}