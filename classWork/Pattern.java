import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	
		Scanner collectInput = new Scanner(System.in);
	
		System.out.println("Enter number of rows:");
		int number = collectInput.nextInt();

		for(int count = 1 ; count <= number; count++) {
			for(int rep = 1; rep <= count; rep++) {
			System.out.print(" " + "*");
			}
		System.out.println();
		}
	}

}

//read heap memory and memory stack