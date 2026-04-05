public class TaskNineteen {

	public static void main(String[] args) {

		double amount = 2568724.86;
		double interestPerYear = 0.125;
		double interestPerMonth = interestPerYear / 12;
		double years = 8;

		System.out.printf("Future investment value is: %.2f", amount * Math.pow (1 + interestPerMonth, years * 12));

	}

}