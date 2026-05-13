public class OshoFreePromoEngine {

	public static double discountPromoCode(String promoCode) {
	
	double discount = 0;
	
	if(promoCode.equals("STARTER10"))  discount = 0.1;
	else if(promoCode.equals("BIGBOY20"))  discount = 0.2;
	else if(promoCode.equals("OSHOFREE35"))  discount = 0.35;
	else  discount = 0;
	
	return discount;
	
	} 
	
	
	public static double discountedPrice (double cartTotal, String promoCode) {
	
	double applyDiscount = discountPromoCode(promoCode);
	
	double newPrice = 0;
	
	if(cartTotal >= 5_000 && cartTotal <= 14_999)  newPrice = cartTotal - (cartTotal * applyDiscount);
	else if(cartTotal >= 15_000 && cartTotal <= 29_999)  newPrice = cartTotal - (cartTotal * applyDiscount);
	else if(cartTotal >= 30_000)  newPrice = cartTotal - (cartTotal * applyDiscount);
	else  newPrice = cartTotal;
	
	return newPrice;
		
		
	}


}