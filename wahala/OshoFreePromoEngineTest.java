import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OshoFreePromoEngineTest {

	@Test
	public void
	givenThatDiscountPromoCodeFunction_isGivenAnInputOfPromoCodeStarter10_assertThatExpectedResultIsADiscountOfPointOne() {
		
	String promoCode = "STARTER10";
	double expectedResult = 0.1;
	double actualResult = OshoFreePromoEngine.discountPromoCode(promoCode);
	
	assertEquals(expectedResult, actualResult);
	
	}

	
	@Test
	public void
	givenThatDiscountPromoCodeFunction_isGivenAnInputOfAValidPromoCode_assertThatExpectedResultIsAnAccurateDiscount() {
		
	String promoCode = "BIGBOY20";
	double expectedResult = 0.2;
	
	String promoCodeTwo = "OSHOFREE35";
	double expectedResultTwo = 0.35;
	
	assertEquals(expectedResult, OshoFreePromoEngine.discountPromoCode("BIGBOY20"));
	assertEquals(expectedResultTwo, OshoFreePromoEngine.discountPromoCode("OSHOFREE35"));
		
	
	}
	
	
	@Test
	public void
	givenThatDiscountPromoCodeFunction_isGivenAnInputOfAnInValidPromoCode_assertThatExpectedResultIsZeroDiscount() {
		
	String promoCode = "FAKE99";
	double expectedResult = 0;
	
	assertEquals(expectedResult, OshoFreePromoEngine.discountPromoCode("FAKE99"));
	
	}
	
	@Test
	public void
	givenThatDiscountedPriceFunction_isGivenAnInputOfStarter10andFiveThousand_assertThatExpectedResultIsADiscountedPriceOfFourThousandFiveHundred() {
		
	String promoCode = "STARTER10";
	double cartTotal = 5_000;
	double expectedResult = 4_500;;
	
	assertEquals(expectedResult, OshoFreePromoEngine.discountedPrice(5_000, "STARTER10"));
	
	}
	
	
	@Test
	public void
	givenThatDiscountedPriceFunction_isGivenAnInputOfBigboy20andFifteenThousand_assertThatExpectedResultIsADiscountedPriceOfTwelveThousand() {
		
	String promoCode = "BIGBOY20";
	double cartTotal = 15_000;
	double expectedResult = 12_000;;
	
	assertEquals(expectedResult, OshoFreePromoEngine.discountedPrice(15_000, "BIGBOY20"));
	
	}
	
	
	@Test
	public void
	givenThatDiscountedPriceFunction_isGivenAnInputOfOshofree35andThirtyThousand_assertThatExpectedResultIsADiscountedPriceOfNinteenThousandFiveHundred() {
		
	String promoCode = "OSHOFREE35";
	double cartTotal = 30_000;
	double expectedResult = 19_500;;
	
	assertEquals(expectedResult, OshoFreePromoEngine.discountedPrice(30_000, "OSHOFREE35"));
	
	}
	
	
	@Test
	public void
	givenThatDiscountedPriceFunction_isGivenAnInputOfStarter10andFourThousand_assertThatExpectedResultIsFourThousand() {
		
	String promoCode = "STARTER10";
	double cartTotal = 4_000;
	double expectedResult = 4_000;;
	
	assertEquals(expectedResult, OshoFreePromoEngine.discountedPrice(4_000, "STARTER10"));
	
	}
		
}