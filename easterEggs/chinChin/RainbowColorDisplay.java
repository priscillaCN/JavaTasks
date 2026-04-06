import java.security.SecureRandom;

public class TaskRainbowColorDisplay {

	public static void main(String[] args) {

		SecureRandom oneToSeven = new SecureRandom();

		int number = 1 + oneToSeven.nextInt(7);

		if (number == 1) {
		   System.out.println("Violet");
		}
		else {
		   if (number == 2) {
		      System.out.println("Indigo");
		   }
		   else {
		      if (number == 3) {
		         System.out.println("Blue");
		      }
		      else {
		         if (number == 4) {
		            System.out.println("Green");
		         }
		         else {
		            if (number == 5) {
		               System.out.println("Yellow");
		            }
		            else {
		               if (number == 6) {
		                  System.out.println("Orange");
 		               }
			       else {
		                  if (number == 7) {
		                     System.out.println("Red");
		                  }

		               }

		            }

		         }

		      }
		      
		   }

		}

	}

}