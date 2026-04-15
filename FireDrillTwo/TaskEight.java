import java.util.Scanner;

public class TaskEight {

	public static void main(String[] args) {

	Scanner collectInput = new Scanner(System.in);

	int count = 1;
	int sum = 0;

	for (count = 1; true; count++) {
	   System.out.println("Enter score" + count + ": ");
	   int score = collectInput.nextInt();
	
	sum = sum + score;
	if (count == 10) {
	   break;
	}
	}

	System.out.println("The sum is: " + sum);
	
	}

}