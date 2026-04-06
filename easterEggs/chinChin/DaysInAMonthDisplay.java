import java.util.Scanner;

public class DaysInAMonthDisplay {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter any month: ");
		String month = userInput.nextLine();

		System.out.print("Enter any year: ");
		int year = userInput.nextInt();	
		
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		int numOfDays = 0;

		switch (month) {
		   case "January":
		   case "March":
		   case "May":
		   case "July":
		   case "August":
		   case "October":
		   case "December":
		      numOfDays = 31;
		      break;
		   case "April":
		   case "June":
		   case "September":
		   case "November":
		      numOfDays = 30;
		      break;
		   case "February":
		      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		        numOfDays = 29;
		      }
		      else {
		         numOfDays = 28;
		      }
		}

		System.out.printf ("Number of days is: %d", numOfDays);
	}

}