public class TaskSix {

	public static void main(String[] args) {

		int subtotal = 20;
		int percentage = 15;
		double gratuityRate = (subtotal * percentage) / 100;

		System.out.printf("Gratuity rate = %.2f%n", gratuityRate);	
		System.out.printf("Total = %.2f", subtotal + gratuityRate);	

	}

}