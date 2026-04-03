import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {

		Scanner typeName = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = typeName.nextLine();

		System.out.printf("Hello " + name);

	}

}