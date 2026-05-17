public class MathApp {
	
	double firstNumber = 10;
	double secondNumber = 2;
	
	
	public double getOperator (char operator){
		
		double answer = 0;
		
		switch (operator) {
		
			case '+' -> {answer = calculateSum(); return answer;}
			case '-' -> {answer = calculateSubtraction(); return answer;}
			case '*' -> {answer = calculateMultiplication(); return answer;}
			case '/' -> {answer = calculateDivision(); return answer;}
			default -> {throw new IllegalArgumentException("Invalid Operator");}
			
		}	
		
	}	
	
	public double calculateSum() {
		return firstNumber + secondNumber;		
	}

	public double calculateSubtraction() {
		return firstNumber - secondNumber;				
	}
	
	public double calculateMultiplication() {
		return firstNumber * secondNumber;			
	}
	
	public double calculateDivision() {
		return firstNumber / secondNumber;			
	}

}