public class DaysInAYear {

	public static int numberOfDaysInAYear(int year) {
	
		year = 1;
	
		if year ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			year = 366;
		}   
			else {
				year = 365;
			}
	
		return year;
	}


//USING THE METHOD IN A PROGRAM


	public static void main(String... args) {
		
		int numberOfDays = 0;
		
		for(int year = 2014; year <= 2034; year++) {
			
			numberOfDays = numberOfDaysInAYear(year);
			
			System.out.println(year + " has " + numberOfDays + " days.");
		}
		
		
	}

	
}