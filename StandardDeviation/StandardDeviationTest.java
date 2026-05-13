import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardDeviationTest {

	@Test
	public void
	givenThatSumOfNumbers_isGivenAnInputOfTenNumbers_assertThatTheSumIsOneHundred() {
		
		double [] numbers = {16, 6, 16, 25, 3, 15, 7, 12};
		double expectedResult = 100;
		double actualResult = StandardDeviation.sumOfNumbers(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void
	givenThatmeanOfNumbers_isGivenAnInputOfTenNumbers_assertThatTheMeanIsTwelvePointFive() {
		
		double [] numbers = {16, 6, 16, 25, 3, 15, 7, 12};
		double expectedResult = 12.5;
		double actualResult = StandardDeviation.meanOfNumbers(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void
	givenThatmeanDifference_isGivenAnInputOfTenNumbers_assertThatTheSumOfMeanDifferenceIsTwo() {
		
		double [] numbers = {{16, 6, 16, 25, 3, 15, 7, 12};
		double expectedResult = 2;
		double actualResult = StandardDeviation.meanOfNumbers(numbers);
		
		assertEquals(expectedResult, actualResult);
	}

}
