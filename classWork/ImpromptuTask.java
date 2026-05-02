import java.util.Scanner;

public class ImpromptuTask {

	public static void main(String[] args) {

	Scanner collectInput = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int number = collectInput.nextInt();
	
	int sum = 0;
	
	while(true) {

	int singleDigit = number % 10;
	number = number / 10;
	sum = sum + singleDigit;

	   if (number == 0) {
	   break;
	   }
	}
	
	System.out.print("the sum is: " + sum);	 
	}

}