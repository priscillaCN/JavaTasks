import java.util.Scanner;

public class TaskSeventeen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter pointX1: ");
		double pointX1 = userInput.nextDouble();

		System.out.print("Enter pointY1: ");
		double pointY1 = userInput.nextDouble();

		System.out.print("Enter pointX2: ");
		double pointX2 = userInput.nextDouble();

		System.out.print("Enter pointY2: ");
		double pointY2 = userInput.nextDouble();

		System.out.print("Enter pointX3: ");
		double pointX3 = userInput.nextDouble();

		System.out.print("Enter pointY3: ");
		double pointY3 = userInput.nextDouble();

		double side1 = Math.sqrt((pointX2 - pointX1) * (pointX2 - pointX1) + (pointY2 - pointY1) * (pointY2 - pointY1));

		double side2 = Math.sqrt((pointX3 - pointX2) * (pointX3 - pointX2) + (pointY3 - pointY2) * (pointY3 - pointY2));

		double side3 = Math.sqrt((pointX3 - pointX1) * (pointX3 - pointX1) + Math.sqrt(pointY3 - pointY1) * (pointY3 - pointY1));

		double s = (side1 + side2 + side3) / 2;	

		System.out.printf("The area is: %.2f", Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));

	}

}