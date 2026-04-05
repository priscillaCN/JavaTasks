import java.util.Scanner;

public class TaskTen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter amount of water (kg): ");
		int water = userInput.nextInt();

		System.out.print("Enter initial temperature: ");
		int iniTemp = userInput.nextInt();

		System.out.print("Enter final temperature: ");
		int finTemp = userInput.nextInt();

		System.out.printf("The energy is: %djoules", water * (finTemp - iniTemp) * 4184);

	}

}