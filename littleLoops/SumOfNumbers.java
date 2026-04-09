import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int n = userInput.nextInt();

		int number = 2;
		int sum = 1;

		while (number <= n) {
		sum += number;
		System.out.printf("%d%n", sum);
		number++;
		}

	}

}
