import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {

	Scanner collectInput = new Scanner(System.in);

	int count = 1;
	int sum = 0;

	for (count = 1; count <= 10; count++) {
	System.out.println("Enter score" + count + ": ");
	int score = collectInput.nextInt();

	sum = sum + score;
	}

	System.out.println("The average is: " + (sum / 10));
	}

}