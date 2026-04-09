import java.util.Scanner;

public class NumbersToOne {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int n = userInput.nextInt();

		int number = n;

		while (number >= 1) {
		   System.out.println(number);
		number--;
		}
	
	}

}