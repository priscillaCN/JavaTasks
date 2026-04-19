import java.util.Scanner;

public class NumberCountdown {
	
	public static void main(String[] args) {
		
		Scanner collectInput = new Scanner(System.in);
		
		System.out.println("Enter any number you want your countdown to begin from:");
		int numberToBeginCountdown = collectInput.nextInt();
		
		for (int count = numberToBeginCountdown; count >= 1; count--) {
		
			System.out.println(count);
		}
		System.out.print("Blast off!!!");
	}
		
}