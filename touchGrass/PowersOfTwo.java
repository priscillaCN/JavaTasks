import java.util.Scanner;

public class PowersOfTwo {

	public static void main(String[] args) {
		
		int baseNumber = 2;
		
		Scanner collectInput = new Scanner(System.in);
		
		System.out.println("To display the first n powers of 2, enter a value for n:");
		int valueOfN = collectInput.nextInt();
		
		for(int count = 1; count <= valueOfN; count++) {
			System.out.println(Math.pow(baseNumber, count));
		}
		
	}

}