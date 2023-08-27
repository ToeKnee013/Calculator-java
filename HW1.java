package cop2800;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a whole number: ");
		int x = userInput.nextInt();
		System.out.println("You entered " + x);
			/* Calculations */
			int multiply = (int) x * 3;
			double divide = (double) x / 3;
		System.out.println("Times three: " + multiply);
		System.out.println("Divided by three: " + divide);
	}

}
