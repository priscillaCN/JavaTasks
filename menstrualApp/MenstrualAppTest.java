import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenstrualAppTest {
	
	@Test
	public void 
	givenThatNumberOfDaysInMonth_isGivenAnInputOfMonthJanuaryandYear2026_assertThatTheExpectedResultIsThirtyOneDays() {
	
		String month = "January";
		int year = 2026;
		int expectedResult = 31;
		MenstrualApp menstrualApp = new MenstrualApp ();
		int actualResult = menstrualApp.numberOfdaysInMonth(month, year);
	
		assertEquals(expectedResult, actualResult);
	 
	}
	
	@Test
	public void 
	givenThatNumberOfDaysInMonth_isGivenAnInputOfMonthFebruaryandLeapYear2028_assertThatTheExpectedResultIsTwentyNineDays() {
	
		String month = "February";
		int year = 2028;
		int expectedResult = 29;
		MenstrualApp menstrualApp = new MenstrualApp ();
		int actualResult = menstrualApp.numberOfdaysInMonth(month, year);
	
		assertEquals(expectedResult, actualResult);
	 
	}
	
	
	@Test
	public void
	givenThatcalculateMenstrualCycleLength_isGivenAnInputOfStartDateToBeFifthNovember2025AndEndDateToBeThirdDecember2025_assertThatTheExpectedResultIsTwentyNinedays() {
		
		int firstDayOfCycle = 5;
		String firstMonthOfCycle = "November";
		int firstYearOfCycle = 2025;
		int lastDayOfCycle = 3;
		String nextMonthOfCycle = "December";
		int nextYearOfCycle = 2025;
		int expectedResult = 29;
		MenstrualApp menstrualApp = new MenstrualApp ();
		int actualResult = menstrualApp.calculateMenstrualCycleLength(firstDayOfCycle, firstMonthOfCycle, firstYearOfCycle, 
																	  lastDayOfCycle, nextMonthOfCycle, nextYearOfCycle);
		assertEquals(expectedResult, actualResult);	
			
	}
	
		@Test
	public void
	givenThatcalculateMenstrualCycleLength_isGivenAnInputOfStartDateToBeSecondMarch2026AndEndDateToBeThirtiethMarch2026_assertThatTheExpectedResultIsTwentyNinedays() {
		
		int firstDayOfCycle = 2;
		String startMonthOfCycle = "March";
		int startYearOfCycle = 2026;
		int lastDayOfCycle = 30;
		String endMonthOfCycle = "March";
		int endYearOfCycle = 2026;
		int expectedResult = 29;
		MenstrualApp menstrualApp = new MenstrualApp ();
		int actualResult = menstrualApp.calculateMenstrualCycleLength(firstDayOfCycle, startMonthOfCycle, startYearOfCycle, 
																	  lastDayOfCycle, endMonthOfCycle, endYearOfCycle);
		assertEquals(expectedResult, actualResult);	
			
	}
	
	@Test
	public void
	givenThatAverageMensturalCycleLength_isGivenTwentyNineDaysForFirstMonthThirtyDaysForSecondMonthAndTwentyNineDaysForThirdMonth_assertThatTheExpectedResultIsTwentyNineDays() {
	
		int firstMonthCycleLength = 29;
		int secondMonthCycleLength = 30;
		int thirdMonthCycleLength = 29;
		int expectedResult = 29;
		MenstrualApp menstrualApp = new MenstrualApp ();
		int actualResult = menstrualApp.averageMenstrualCycleLength(firstMonthCycleLength, secondMonthCycleLength, thirdMonthCycleLength);
		
		assertEquals(expectedResult, actualResult);	
		
	}


	@Test
	public void
	givenThatPrintAverageCycleLengthStatusMessage_isGivenAnAverageCycleLengthOfForty_assertThatExpectedResultReturnsAbnormalCycleLengthMessage() {
	
		int averageCycleLength = 40;
		String expectedResult = "Abnormal cycle length";
		MenstrualApp menstrualApp = new MenstrualApp ();
		String actualResult = menstrualApp.printAverageCycleLengthStatusMessage(40, 39, 40);
		
		assertEquals(expectedResult, actualResult);	
		
	}
	
	
	@Test
	public void
	givenThatPrintAverageCycleLengthStatusMessage_isGivenAnAverageCycleLengthOfTwentyEight_assertThatExpectedResultReturnsNormalCycleLengthMessage() {
	
		int averageCycleLength = 25;
		String expectedResult = "Normal cycle length";
		MenstrualApp menstrualApp = new MenstrualApp ();
		String actualResult = menstrualApp.printAverageCycleLengthStatusMessage(28, 29, 28);
		
		assertEquals(expectedResult, actualResult);	
		
	}


}