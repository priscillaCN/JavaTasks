public class FiveMultiplicationTable {

	public static void main (String[] args) {
		
		int number = 0;
		
		int multipleOfFive = 0;
		
		for (int count = 1; count <= 12; count++) {
			
			number = count;
			
			multipleOfFive = number * 5;
			
			System.out.println("5 * " + count + " = " + multipleOfFive);
			
		}
		
	}

}