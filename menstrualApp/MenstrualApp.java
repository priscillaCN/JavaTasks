public class MenstrualApp {
	
	public static int numberOfdaysInMonth(String month, int year) {
	
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		int daysInMonth = 0;
		
		switch (month) {
			
			case "January", "March", "May", "July", "August", "October", "December" -> {
				daysInMonth = 31;
					break;
			}
				
			
			case "April", "June", "September", "November" -> {
				daysInMonth = 30;
					break;
			}
				
				
			case "February" -> {
				if(isLeapYear) daysInMonth = 29;
					else daysInMonth = 28;
					break;
			}			  				
				
		}	
		
		return daysInMonth;
	}


	public static int calculateMonthlyMenstrualCycleLength(int firstDayOfCycle, String startMonthOfCycle, int startYearOfCycle, 
<<<<<<< HEAD
															int lastDayOfCycle, String endMonthOfCycle, int endYearOfCycle) {
=======
														   int lastDayOfCycle, String endMonthOfCycle, int endYearOfCycle) {
>>>>>>> 23b18031b8ca0288ad4fd17003b391734854197b
		
		int daysOfCycleinStartMonth = numberOfdaysInMonth(startMonthOfCycle, startYearOfCycle) - (firstDayOfCycle - 1);
		
		int totalCycleLengthInAMonth = 0;
		
			if (startMonthOfCycle == endMonthOfCycle)  {
				totalCycleLengthInAMonth = lastDayOfCycle - (firstDayOfCycle - 1);
			}
			
				else {
					totalCycleLengthInAMonth = daysOfCycleinStartMonth + lastDayOfCycle;
				}
		
	
		return totalCycleLengthInAMonth;
		
	}
	
	
	public static int averageMenstrualCycleLength(int firstMonthCycleLength, int secondMonthCycleLength, int thirdMonthCycleLength) {
			
			int averageCycleLength = (firstMonthCycleLength + secondMonthCycleLength + thirdMonthCycleLength) / 3;
			
				return averageCycleLength;
		
	}
	
	
	public static String averageCycleLengthStatusMessage(int firstMonthCycleLength, int secondMonthCycleLength, int thirdMonthCycleLength) {
		
		String message = "";
		
		int averageCycleLength = averageMenstrualCycleLength(firstMonthCycleLength, secondMonthCycleLength, thirdMonthCycleLength);
		
			if (averageCycleLength < 21 || averageCycleLength > 35) {
				message = "Abnormal cycle length";
			}	else {
				message = "Normal cycle length";
				}
				
		return message;
	}
	

}
