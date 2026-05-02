import java.util.Scanner;

public class TaskEight {

	public static void main(String[] args) {

	Scanner collectInput = new Scanner(System.in);

	int count = 1;
	int sum = 0;

	for (count = 1; true; count++) {
	   System.out.println("Enter score" + count + ": ");
	   int score = collectInput.nextInt();

	   if (score <= 100 && count == 10) {
	      break;
	   }

	sum = sum + score;
	}

	System.out.println("The sum is: " + sum);
	}

}