public class LoopsPractice {
	
	public static void main(String[] args) {
		
		for(int line = 1; line <= 3; line++) {
			
			for(int star = 1; star <= 4; star++) {
				
			System.out.print("* ");	
			
			}
			
		System.out.println();
			
		}
		
		System.out.println();
		
		
		for(int line = 1; line <= 4; line++) {
			
			for(int star = 1; star <= line; star++) {
			
			System.out.print("*");
			
			}
			
		System.out.println();	
			
		}
		
		System.out.println();
		
		
		for(int line = 1; line <= 4; line++) {
			
			for(int star = 4; star >= line; star--) {
			
			System.out.print("*");
			
			}
			
		System.out.println();	
			
		}
		
		System.out.println();
		
		
		for(int line = 1; line <= 5; line++) {
			
			for(int star = 1; star <= line; star++) {
			
			System.out.print("  " + "*" + "  ");
			
			}
			
		System.out.println();	
			
		}
		
		System.out.println();
		
		
		
		String[][] fancyColors = { { "Red", "Blue", "Green" }, { "Cyan", "Magenta", "Turqiouse" } };

		for(int row = 0; row < 2; row++) {
			
			for(int column = 0; column < 3; column++) {
				System.out.print(fancyColors[row][column] + "		");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		//SIMPLE LOOP EXERCISES
		
		//number 1
		
		for(int number = 1; number <=10; number++) {
			System.out.println(number);
		}

		System.out.println();
		
		
		
		//number 2

		for(int number = 10; number >=1; number--) {
			System.out.println(number);
		}

		System.out.println();	
		
		
		
		//number 3

		for(int number = 2; number <=20; number+= 2) {
			System.out.print(number + " ");
		}

		System.out.println();


		System.out.println();
		
		
		
		//number 4

		for(int number = 1; number <=20; number+= 2) {
			System.out.print(number + " ");
		}

		System.out.println();
		
		System.out.println();
		
		
		
		
		//number 5
		
		int sum = 0;
		
			for(int number = 1; number <=10; number++) {
				sum+=number;
			}
			
		System.out.println("The sum of numbers from 1 to 10 is: " + sum);
		
		
		
		//number 6
		
		System.out.println();
		
			int number = 5;
			int multiple = 0;
			
			for(int count = 1; count <=12; count++) {				
				multiple = number * count;				
				System.out.println("5 x " + count + " = " + multiple);
			}
			
			
		System.out.println();
		
		
		
		//number 7

		java.util.Scanner collectInput = new java.util.Scanner(System.in);
		
		System.out.print("Enter any number: ");
		number = collectInput.nextInt();
		
		for(int count = 1; count <= number; count++) {
			System.out.println(count);
		} 

		System.out.println();




		//number 8
		
		collectInput = new java.util.Scanner(System.in);
		
		System.out.print("Enter any number: ");
		number = collectInput.nextInt();
		
		
		for(int count = 1; count <= 12; count++) {
			
			multiple = number * count;
			
			System.out.println(number + " x " + count + " = " + multiple);
		} 

		System.out.println();	
		
	
	
	//number 9
	
	int count = 0; 
	for(number = 1; number <= 50; number++) {
		if (number % 2 == 0) 
		count++;
			
		} 
		
		System.out.println(" There are " + count + " even numbers between 1 and 50");
	

		System.out.println();	
		
		
		
	//number 10
	
		String userInput = "word";
		collectInput = new java.util.Scanner(System.in);
	 
		while(!userInput.equals("done")) {
			
			System.out.println("Enter a word or 'done' to stop: ");
			userInput = collectInput.next();
		
		}
		
		System.out.println();	
		
		
		
		
		//INTERMEDIATE LOOP EXERCISES
		
		//number 1
		
		sum = 0;
		for(number = 1; number <= 100; number++) {
			
			if (number % 2 == 0) sum += number;
		}
		System.out.println("The sum of even mumbers from 1 to 100 is: " + sum);
		
		System.out.println();	
		
		
		//number 2
		
		sum = 0;
		for(number = 1; number <= 100; number++) {
			
			if (number % 2 != 0) sum += number;
		}
		System.out.println("The sum of odd mumbers from 1 to 100 is: " + sum);
		
		
		System.out.println();
		
		
		
		//number 3
		
		int total = 0;
		
		collectInput = new java.util.Scanner(System.in);
	 
		for(count = 1; count <= 5; count++) {
			
			System.out.print("Enter number " + count + ": ");
			number = collectInput.nextInt();
			
			total += number;
		
		}
		
		System.out.println("Total = " + total);
		
		
		System.out.println();
		
		
		
		//number 4
		
		collectInput = new java.util.Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int largest = collectInput.nextInt();
	 
		for(count = 2; count <= 5; count++) {
			
			System.out.print("Enter number " + count + ": ");
			number = collectInput.nextInt();
			
			if(number > largest) largest = number;
		
		}
		
		System.out.println("The largest number is: " + largest);
		
		
		System.out.println();	



		//number 5
		
		collectInput = new java.util.Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int smallest = collectInput.nextInt();
	 
		for(count = 2; count <= 5; count++) {
			
			System.out.print("Enter number " + count + ": ");
			number = collectInput.nextInt();
			
			if(number < smallest) smallest = number;
		
		}
		
		System.out.println("The smallest number is: " + smallest);
		
		
		System.out.println();		
		
		
		//number 6
		
		for(number = 1; number <= 30; number++) {
			
			if(number % 3 == 0) continue;
				System.out.print(number +" ");
			
		}
		
		System.out.println();	
		
		System.out.println();
		
		
		//number 7
	
		userInput = "word";
		collectInput = new java.util.Scanner(System.in);
	 
		while(true) {
			
			System.out.println("Enter password: ");
			userInput = collectInput.next();
			
			if(!userInput.equals("java123")) {
				System.out.println("Wrong password.");
				System.out.println();
			}	
			else {
				System.out.println("Access granted.");
					break;
			}
		
		}
		
		System.out.println();	
		
		
		//number 8
		
		total = 0;
		
		while(number != 0) {
			
			System.out.print("Enter a number or '0' to stop: ");
			number = collectInput.nextInt();

			total += number;
		}
		
		System.out.println("Total = " + total);

		System.out.println();		
		
	}

}