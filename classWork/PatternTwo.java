import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) {
	
		Scanner collectInput = new Scanner(System.in);
	
		System.out.println("Enter number of rows:");
		int row = collectInput.nextInt();

		int space = 0;
		int star = 0;

		for(int count = 1; count <= row; count++) {

			for(space = 1; space <= row - count; space++) {
			System.out.print(" ");
			}
			
			for(star = 1; star <= count; star++) {
			System.out.print("*");
			}
			
		System.out.println();
		}
	}

}
