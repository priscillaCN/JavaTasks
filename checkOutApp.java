import java.util.Scanner;

public class CheckOutApp {

	public static void main(String[] args) {
			
		Scanner collectInput = new Scanner(System.in);
		
		System.out.println("What is the customer's name?");
		String customerName = collectInput.nextLine();
		
		System.out.println("What is your name?");
		String cashierName = collectInput.nextLine();
		
		//System.out.println("How many items are in the cart?");
		//int numberOfItems = collectInput.nextInt();
		
		String [] items = new String [999];
		int [] quantityPerItem = new int [999];
		double [] pricePerItem = new double [999];
		
		int count = 0;
		
		while (true) {
		//for(int index = 0; index < numberOfItems; index++) {
			
			System.out.println("Enter item " + (count + 1));
			items[count] = collectInput.next();
			
			System.out.println("Enter price");
			pricePerItem[count] = collectInput.nextDouble();
			
			System.out.println("Enter quantity");
			quantityPerItem[count] = collectInput.nextInt();
			
			System.out.println("Add more items? (yes/no)");
			String answer = collectInput.next();
				
				if(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
					
					System.out.println("Invalid answer");
						
					System.out.println("Add more items? (yes/no)");
					answer = collectInput.next();
						
				}
						
				if (answer.equalsIgnoreCase("no")) 
					break;
				
			count++;
						
		}
		
		double subTotal = 0;
		
		for(int index = 0; index <= count; index++) {
			
			subTotal += (pricePerItem[index] * quantityPerItem[index]);	
			
		}
		
		System.out.println("Sub Total = " + subTotal);
		
		double discount = subTotal * 0.10;
		double vat = subTotal * 0.075;
		double billTotal = subTotal - (discount + vat);

		System.out.println("How much did the customer pay?");
		double amountPaid = collectInput.nextDouble();
		
		double balance = Math.abs(billTotal - amountPaid);
		
		
		System.out.println("\nSEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");
		System.out.println("Date: 18-Dec-22 8:57:31 pm");
		System.out.println("Cashier: " + cashierName);
		System.out.println("Customer Name: " + customerName);
		System.out.println("\n=================================================================\n");
		System.out.println("	ITEM		QTY		PRICE		TOTAL(NGN)");
		System.out.println("\n----------------------------------------------------------------\n");
		
		for(int index = 0; index <= count; index++) {
			
			double itemTotal =  pricePerItem[index] * quantityPerItem[index];			
			System.out.printf("%15s %15d %15.2f %15.2f %n", items[index], quantityPerItem[index], pricePerItem[index], itemTotal);
			
		}
		
		System.out.println("\n\n---------------------------------------------------------------\n");
		System.out.printf("%40s %20.2f %n", "Sub Total: ", subTotal);
		System.out.printf("%40s %20.2f %n", "Discount: ", discount);
		System.out.printf("%40s %20.2f %n", "VAT @ 7.50%: ", vat);
	
		System.out.println("\n===============================================================\n");
		System.out.printf("%40s %20.2f %n", "Bill Total: ", billTotal);
		System.out.printf("%40s %20.2f %n", "Amount Paid: ", amountPaid);
		System.out.printf("%40s %20.2f %n", "Balance: ", balance);
		
		System.out.println("\n===============================================================\n");
		System.out.print("\t\tTHANK YOU FOR YOUR PATRONAGE");
		System.out.println("\n===============================================================\n");
			
	}

}