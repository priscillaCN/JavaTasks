import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int n = userInput.nextInt();

		int number = 1;
		int sum = 1;

		while (number <= n) {
		sum += number;
		number++;
		}

		System.out.printf("The sum of numbers from 1 to %d is %d", n, sum);
	}

}