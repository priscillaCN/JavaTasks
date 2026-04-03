import java.util.Scanner;

public class TaskTwentyTwo {

	public static void main(String[] args) {

		float pi = 3.142f;

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter radius of circle: ");
		int radius = userInput.nextInt();

		System.out.printf("The area of circle: %.2f", pi * radius * radius);	

	}

}