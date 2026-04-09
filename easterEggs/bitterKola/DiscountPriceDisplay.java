public class DiscountPriceDisplay {

	public static void main(String[] args) {

		int price = 15000;
		int percentDiscount = 10;
		int discountAmount = price * percentDiscount / 100;

		System.out.printf("The final price is: %d", price - discountAmount);	

	}

}