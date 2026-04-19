import java.util.Scanner;

	public class AverageOfNumbers{
		
		public static void main(String[] args){

		Scanner collectInput = 	new Scanner(System.in);


		System.out.println("Enter number: ");
		int number = collectInput.nextInt();
		
		int count = 1;

		int sum = 0;

		double numbersAverage = 0;
		
		while (number > 0) {

			sum = sum + number;

			numbersAverage = sum / count;

			System.out.println("Enter number: ");
			number = collectInput.nextInt();

			if (number < 0) {
			    break;
			}

			count++;
		}
		
		System.out.print("The average is: " + numbersAverage);
		
		
		}
		
	}