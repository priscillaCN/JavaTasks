import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BackToSenderTest {


    @Test
    public void givenThatTheAllowanceCalculator_isGivenAnInputBelowFiftyPercentWithAValueOfThirty_assertThatTheExpectedResultIsNineThousandEightHundred() {
    
        int numberOfSuccessfulDeliveries = 30;
        int expectedResult = 9800;
        BackToSender backToSender = new BackToSender();
        int actualResult = backToSender.calculateAllowance(numberOfSuccessfulDeliveries);
        
        assertEquals(expectedResult, actualResult);  

    }


    @Test
    public void 
    givenThatTheAllowanceCalculator_isGivenAnInputBetweenFiftyAndFiftyNinePercentWithAValueOfFiftyFive_assertThatTheExpectedResultIsSixteenThousand() {

        int numberOfSuccessfulDeliveries = 55;
        int expectedResult = 16000;
        BackToSender backToSender = new BackToSender();
        int actualResult = backToSender.calculateAllowance(numberOfSuccessfulDeliveries);
        
        assertEquals(expectedResult, actualResult);  

    }


    @Test
    public void givenThatTheAllowanceCalculator_isGivenAnInputBetweenSixtyAndSixtyNinePercentWithAValueOfSixtyFive_assertThatTheExpectedResultIsTwentyOneThousandTwoHundredAndFifty() {

        int numberOfSuccessfulDeliveries = 65;
        int expectedResult = 21250;
        BackToSender backToSender = new BackToSender();
        int actualResult = backToSender.calculateAllowance(numberOfSuccessfulDeliveries);
        
        assertEquals(expectedResult, actualResult);  

    }


    @Test
    public void givenThatTheAllowanceCalculator_isGivenAnInputAboveSeventyPercentWithAValueOfSeventyFive_assertThatTheExpectedResultIsFortyTwoThousandFiveHundred() {

        int numberOfSuccessfulDeliveries = 75;
        int expectedResult = 42500;
        BackToSender backToSender = new BackToSender();
        int actualResult = backToSender.calculateAllowance(numberOfSuccessfulDeliveries);
        
        assertEquals(expectedResult, actualResult); 

        }

}
