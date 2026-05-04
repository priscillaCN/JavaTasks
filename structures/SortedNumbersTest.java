import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortedNumbersTest {


	@Test
	public void
	givenThatDisplaySortedNumbers_isGivenAnInputofTenTwentyAndThirty_assertThatTheExpectedResultIsThirtyTwentyAndTen() {
		
		double num1 = 10;
		double num2 = 20;
		double num3 = 30;
		String expectedResult = "30 20 10";
		SortedNumbers sortedNumbers = new SortedNumbers ();
		String actualresult = SortedNumbers.displaySortedNumbers(num1, num2, num3);
		
		assertEquals(expectedResult, actualresult);
		
	}

}