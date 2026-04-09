import java.util.Scanner;

public class FirstAndLastDigitsSum {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a five digit number: ");
		int userNum = userInput.nextInt();

		int divideNum1 = userNum / 10;
		int remainNum1 = userNum % 10;
		int divideNum2 = divideNum1 / 10;
		int remainNum2 = remainNum1 % 10;
		int divideNum3 = divideNum2 / 10;
		int remainNum3 = remainNum2 % 10;
		int divideNum4 = divideNum3 / 10;
		int remainNum4 = remainNum3 % 10;
		int divideNum5 = divideNum4 / 10;
		int remainNum5 = remainNum4 % 10;

		System.out.printf("The sum of the first and last digits in %d is: %d+%d= %d",userNum, divideNum4, remainNum1, divideNum4 + remainNum1);		

	}

}