import java.util.Scanner;

public class HiFiveAndHiEvenDisplay {

	public static void main(String[] args) {


		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int userNum = userInput.nextInt();

		int multipleFive = userNum % 5;
		int divisibleTwo = userNum % 2;

		if (multipleFive == 0) {
		   System.out.println("HiFive");
		}

		if (divisibleTwo == 0) {
		      System.out.println("HiEven");
		}
	

	}

}