import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MathAppTest {
	
	public void givenCalculateSum_whenInputIs2and2_thenSumIs4() {
		
		MathApp myMathApp = new MathApp();
		
		double firstNumber = 2;
		double secondNumber = 2;
		
		assertEquals(4, myMathApp.calculateSum(2, 2));
		
	}



}