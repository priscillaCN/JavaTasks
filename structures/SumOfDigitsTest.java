import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest {
	
	@Test
	public void
	givenThatSumDigits_isGivenAUserInputOfTwentyFiveThousandTwoHundredAndFiftyThree_assertThatTheExpectedResultIsSeventeen() {
	
		long n = 25253;
		int expectedResult = 17;
		SumOfDigits sumOfDigits = new SumOfDigits ();
		int actualResult = sumOfDigits.sumDigits(n);
		
		assertEquals(expectedResult, actualResult);
		
	}

}