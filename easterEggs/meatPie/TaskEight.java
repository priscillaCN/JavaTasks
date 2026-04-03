import java.util.Scanner;

public class TaskEight {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int anyNum = userInput.nextInt();

		System.out.printf("The cube is: %d", anyNum * anyNum * anyNum);	


	}

}