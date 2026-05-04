import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	public class DaysInAYearTest {
		
		
		@Test
		public void
		givenThatNumberOfDaysInAYear_isGivenAnInputOfYear2015_assertThatTheExpectedResultIsThreeHundredAndSixtyFiveDays() {
			
			int year = 2015;
			int expectedResult = 365;
			DaysInAYear daysInAYear = new DaysInAYear();
			int actualResult = DaysInAYear.numberOfDaysInAYear(year);
			
			assertEquals(expectedResult, actualResult);
		}
	}