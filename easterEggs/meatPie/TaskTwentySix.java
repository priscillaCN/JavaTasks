import java.util.Scanner;

public class TaskTwentySix {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = userInput.nextLine();

		System.out.print("Enter age: ");
		int age = userInput.nextInt();

		System.out.printf("%s %s %s %d %s", "I am", name, "and I am", age, "years old.");	

	}

}