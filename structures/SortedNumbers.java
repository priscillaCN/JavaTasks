public class SortedNumbers {

	public static void displaySortedNumbers ( double num1, double num2, double num3 ) {
	
		double highestNumber = num1;
		double middleNumber = num1;
		double lowestNumber = num1;
		
		if (highestNumber < num2) {
			highestNumber = num2;
		}
			
		if (highestNumber < num3) {
			highestNumber = num3;
		}

		
		if ((num2 >= middleNumber && num2 <= num3) || (num2 <= middleNumber && num2 >= num3)) {
			middleNumber = num2;
		}
		
		if ((num3 >= middleNumber && num3 <= num2) || (num3 <= middleNumber && num3 >= num2)) {
				middleNumber = num3;
			}
		
	
		if (lowestNumber > num2) {
			lowestNumber = num2;
		}
			
		if (lowestNumber > num3) {
			lowestNumber = num3;
		}
		
		
		System.out.print(highestNumber + " " +  middleNumber + " " + lowestNumber);
	}
	
	
	//USING THE METHOD IN A PROGRAM
	
	public static void main(String... args) {
		
		double num1 = 45542;
		double num2 = 349;
		double num3 = 9046;
		
		displaySortedNumbers (num1, num2, num3);
	
	}

}