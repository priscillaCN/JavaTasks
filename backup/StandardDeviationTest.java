import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardDeviationTest {

	@Test
	public void
	givenSumOfNumbers_whenInputIsTenNumbers_thenSumIsOneHundred() {
		
		double [] numbers = {16, 6, 16, 25, 3, 15, 7, 12};
		double expectedResult = 100;
		double actualResult = StandardDeviation.sumOfNumbers(numbers);
		
		assertEquals(expectedResult, actualResult, 0.01);
	}
	
	@Test
	public void
	givenmeanOfNumbers_whenInputIsTenNumbers_thenMeanIsTwelvePointFive() {
		
		double [] numbers = {16, 6, 16, 25, 3, 15, 7, 12};
		double expectedResult = 12.5;
		double actualResult = StandardDeviation.meanOfNumbers(numbers);
		
		assertEquals(expectedResult, actualResult, 0.01);
	}
	
	@Test
	public void
	givenMeanDifference_whenInputIsTenNumbers_thenSumOfMeanDifferenceIsThreeHundredAndFifty() {
		
		double [] numbers = {16, 6, 16, 25, 3, 15, 7, 12};
		double expectedResult = 350;
		double actualResult = StandardDeviation.meanDifference(numbers);
		
		assertEquals(expectedResult, actualResult, 0.01);
	}


	@Test
	public void
	givenCalculateVariance_whenInputIsTenNumbers_thenVarianceIsThreeHundredAndFifty() {
		
		double [] numbers = {16, 6, 16, 25, 3, 15, 7, 12};
		double expectedResult = 43.75;
		double actualResult = StandardDeviation.calculateVariance(numbers);
		
		assertEquals(expectedResult, actualResult, 0.01);
	}
	
	
	@Test
	public void
	givenCalculateStandardDeviation_whenInputIsTenNumbers_thenVarianceIsSixPointSixOne() {
		
		double [] numbers = {16, 6, 16, 25, 3, 15, 7, 12};
		double expectedResult = 6.61;
		double actualResult = StandardDeviation.calculateStandardDeviation(numbers);
		
		assertEquals(expectedResult, actualResult, 0.01);
	}
}