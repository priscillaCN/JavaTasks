public class NumberPattern {

	public static void displayPattern(int n) {
	
		for(int count = 1; count <= n; count++) {
			
			for(int pattern = count; pattern <= n; pattern++) {
				
				System.out.print(pattern + " ");
			}
			
			System.out.println();
		}
	
	}
	
	
	//USING THE METHOD IN A PROGRAM
	
	public static void main(String[] args) {
		
		java.util.Scanner collectInput = new java.util.Scanner(System.in);
		
		System.out.Println("Enter any number for n");
		
		int n = collectInput.nextInt();
		
		displayPattern(n);	

	}

}