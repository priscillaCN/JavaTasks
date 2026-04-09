import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {

		int number = 1;
		
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int n = userInput.nextInt();

		while (number <= n) {
		   System.out.println(number);
		number++;
		}
	
	}

}