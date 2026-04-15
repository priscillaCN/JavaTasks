import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {

	Scanner collectInput = new Scanner(System.in);

	int count = 1;
	int score = 1;

	for (count = 1; count <= 10; count++) {
	System.out.println("Enter score: ");
	score = collectInput.nextInt();
	}

	System.out.print("The sum is: " + sum);	
	}

}