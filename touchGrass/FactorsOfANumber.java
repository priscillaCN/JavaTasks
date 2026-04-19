import java.util.Scanner;

public class FactorsOfANumber {
	
	public static void main(String[] args) {
		
		int numberOne = 0;
		int numberTwo = 0;
		
		Scanner collectInput = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int factoredNumber = collectInput.nextInt();
		
		for(int count = 1; count <= factoredNumber; count++) {
			
			if (factoredNumber % count == 0) {
				numberOne = 0 + count;
				break;
			}
				
			while (count >= numberOne) {

			if (numberOne * count == factoredNumber) {
				numberTwo = 1 * count;
				break;
				}
			}
			
			if (numberOne * numberTwo == factoredNumber) {
			System.out.println(numberOne + "*" + numberTwo + "=" + factoredNumber);
			}
			
			
		}
		
	}	

}