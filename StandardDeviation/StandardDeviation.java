public class StandardDeviation {

	public static double sumOfNumbers(double [] numbers) {
	
		double sum = 0;
		
		for(double num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	
	public static double meanOfNumbers(double [] numbers) {
	
		double sumTotal = sumOfNumbers(numbers);
		double count = numbers.length;
		
		return sumTotal / count;
	
	}
	
	
	public static double meanDifference (double [] numbers) {
	
		double mean = meanOfNumbers(numbers);
		double sumOfMeanDifference = 0;
		
		for(double num : numbers) {
			sumofMeanDifference += (num - mean);
		}
		
		return sumOfMeanDifference;
		
	}
	
	
	public static double calculateVariance (double [] numbers) {
	
		double meanDiff = meanDifference(numbers);
		double count = numbers.length;
		
		
		return (meanDiff * meanDiff) / count;
		
	}
	
	
	public static double standardDeviation (double [] numbers) {
	
		double variance = calculateVariance(numbers);
		
		return math.sqrt(variance);
		
	}

}
