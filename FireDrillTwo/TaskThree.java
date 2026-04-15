import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {

	Scanner collectInput = new Scanner(System.in);

	int count = 1;
	int score = 1;

	for (count = 1; count <= 10; count++) {
	System.out.println("Enter score: ");
	score = collectInput.nextInt();
	}

	System.out.println("the sum is: " + score);
	System.out.println("the average is: " + (score / 10));	
	}

}