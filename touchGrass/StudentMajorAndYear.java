import java.util.Scanner;

public class StudentMajorAndYear {

	public static void main(String[] args) {
						
		String major = " ";
		String year = " ";
		String majorInFull = " ";
		String yearInFull = " ";
		
		System.out.print("""
						MAJOR
						I = Information Management
						C = Computer Science
						A = Accounting
						""");
						
		Scanner collectInput = new Scanner(System.in);

		System.out.println("Enter your Major (single letter only): ");
		major = collectInput.nextLine();
		
		System.out.print("""
						YEAR
						1 = Freshman
						2 = Sophomore
						3 = Junior
						4 = Senior
						""");
		
		System.out.println("Enter your Year (number only): ");
		year = collectInput.nextLine();
	
		switch (major) {
			
		case "I":
			majorInFull = "Information Management";
			break;
			
		case "C":
			majorInFull = "Computer Science";
			break;
			
		case "A":
		majorInFull = "Accounting";
		break;
		
		}
		
		System.out.print("Your major is " + majorInFull + " ");

		switch (year) {
			
		case "1":
			yearInFull = "Freshman";
			break;
		
		case "2":
			yearInFull = "Sophomore";
			break;
			
		case "3":
			yearInFull = "Junior";
			break;
			
		case "4":
			yearInFull = "Senior";
			break;	
			
		}
		
		System.out.print("and your year is " + yearInFull);
	}

}