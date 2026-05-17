import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MathAppTest {
	
	MathApp myMathApp;
	
	@BeforeEach 
	void setUp() {
		myMathApp = new MathApp();
	}
	
	
	@Test
	public void givenCalculateSum_whenInputIs10And2_thenExpectedResultIs12() {
		
		myMathApp.calculateSum();
		
		assertEquals(12, myMathApp.getOperator('+'));
		
	}

	
	@Test
	public void givenCalculateSubtraction_whenInputIs10And2_thenExpectedResultIs8() {
		
		myMathApp.calculateSubtraction();
		
		assertEquals(8, myMathApp.getOperator('-'));
		
	}
	
	
	@Test
	public void givenCalculateMultiplication_whenInputIs10And2_thenExpectedResultIs20() {
		
		myMathApp.calculateMultiplication();
		
		assertEquals(20, myMathApp.getOperator('*'));
		
	}
	
	
	@Test
	public void givenCalculateDivision_whenInputIs10And2_thenExpectedResultIs5() {
		
		myMathApp.calculateDivision();
		
		assertEquals(5, myMathApp.getOperator('/'));
		
	}
	
	
	@Test
	public void givenGetOperator_whenOperatorIsPlusAndInputIs10And2_thenTheExpectedResultIs12() {
		
		char operator = '+';
		myMathApp.calculateSum();
		
		assertEquals(12, myMathApp.getOperator(operator));
			
	}
	
	
	@Test
	public void givenGetOperator_whenOperatorIsMinusAndInputIs10And2_thenTheExpectedResultIs8() {
		
		char operator = '-';
		myMathApp.calculateSubtraction();
		
		assertEquals(8, myMathApp.getOperator(operator));
			
	}
	
	
	@Test
	public void givenGetOperator_whenOperatorIsMultiplyAndInputIs10And2_thenTheExpectedResultIs20() {
		
		char operator = '*';
		myMathApp.calculateMultiplication();
		
		assertEquals(20, myMathApp.getOperator(operator));
			
	}
	
	
	@Test
	public void givenGetOperator_whenOperatorIsDivideAndInputIs10And2_thenTheExpectedResultIs5() {
		
		char operator = '/';
		myMathApp.calculateDivision();
		
		assertEquals(5, myMathApp.getOperator(operator));
			
	}
	
	
	@Test
	public void givenGetOperator_whenOperatorIsinvalid_thenNegativeOperationexceptionIsThrown() {
		
		char operator = '%';
		myMathApp.calculateMultiplication();
		
		assertThrows(IllegalArgumentException.class, ()-> myMathApp.getOperator(operator) );
		
	}


}