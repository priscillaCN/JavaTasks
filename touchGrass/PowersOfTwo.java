import java.util.Scanner;

public class PowersOfTwo {

	public static void main(String[] args) {
		
		int baseNumber = 2;
		int powerOfBaseNumber = 0;
		
		Scanner collectInput = new Scanner(System.in);
		
		System.out.println("To display the first n powers of 2, enter a value for n:");
		int valueOfN = collectInput.nextInt();
		
		for(int count = 1; count <= valueOfN; count++) {
			if (powerOfBaseNumber == Math.pow(baseNumber, count)) {
			System.out.println(baseNumber + " to the power of " + count + " is " + powerOfBaseNumber);
			}
		}
		
	}

}