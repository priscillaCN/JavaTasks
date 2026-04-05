import java.util.Scanner;

public class TaskSixteen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the side of a hexagon: ");
		double side = userInput.nextDouble();

		System.out.printf("The area is: %.2f", (3 * Math.sqrt(3) / 2) * side * side);

	}

}