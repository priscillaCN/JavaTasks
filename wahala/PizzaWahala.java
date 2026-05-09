public class PizzaWahala {
	
	public static int numberOfPizzaBoxes (int numberOfGuests, int numberOfSlices) {
		
		int numberOfBoxes = numberOfGuests / numberOfSlices;
		
			if(numberOfGuests % numberOfSlices != 0) {
				numberOfBoxes = (numberOfGuests / numberOfSlices) + 1;
			}
		
		return numberOfBoxes;
	}
	
	
	public static int numberOfLeftOverSlices (int totalPizzaBoxes, int numberOfSlices, int numberOfGuests) {
		
		int leftoverSlices = (totalPizzaBoxes * numberOfSlices) - numberOfGuests;
		
		return leftoverSlices;
					
	}
	
	
	public static int customerBill (int totalPizzaBoxes, int pricePerBox) {
		
		int bill = totalPizzaBoxes * pricePerBox;
		
		return bill;
	}
	
	
	public static void main(String... args) {
	
		System.out.println("""
							pizza type	Number of Slices	Price per box
							------------------------------------------------------
							Sapa Size	4			2,500
							------------------------------------------------------
							Small Money	6			2,900
							------------------------------------------------------
							Big Boys	8			4,000
							------------------------------------------------------
							Odogwu		12			5,200
							------------------------------------------------------
							""");
							
		int numberOfSlices = 0;
		int pricePerBox = 0;
		
		java.util.Scanner collectInput = new java.util.Scanner(System.in);
		
		System.out.println("Select your pizza type from menu:");
		String menu = collectInput.nextLine();
		
		System.out.println("How many guests are you expecting?");
		int numberOfGuests = collectInput.nextInt();
	
		switch (menu) {
			
			case "Sapa Size" -> {
				numberOfSlices = 4;
				pricePerBox = 2500;
			}
		
			case "Small Money" -> {
				numberOfSlices = 6;
				pricePerBox = 2900;
			}
		
			case "Big Boys" -> {
				numberOfSlices = 8;
				pricePerBox = 4000;
			}
		
			case "Odogwu" -> {
				numberOfSlices = 12;
				pricePerBox = 5200;
			}
			
		}
	
		int totalPizzaBoxes = numberOfPizzaBoxes (numberOfGuests, numberOfSlices);
		System.out.println("Number of pizza boxes to buy is: " + totalPizzaBoxes);
		
		int totalLeftOverSlices = numberOfLeftOverSlices (totalPizzaBoxes, numberOfSlices, numberOfGuests);
		System.out.println("Number of leftover slices is: " + totalLeftOverSlices);
		
		int pay = customerBill (totalPizzaBoxes, pricePerBox);
		System.out.println("Your bill is: " + pay);
	
	}

}