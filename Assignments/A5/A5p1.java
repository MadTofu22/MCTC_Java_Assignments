/** Program: A5p1 - Driver for Fraction and DivideByZeroErr
	Author(s): Tom Stutler
	Last Date Modified: 12/3/15
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class A5p1 {
	
	private static Scanner iStream = new Scanner(System.in);
	private static int a=0, b=0;
	private static String repeat="";
	
	public static void main (String[] args) {
		
		do {
			
			getNumerator();
			getDenominator();
			Fraction f = new Fraction(a,b);
			System.out.println("The fraction reduced is " +f);
			
			System.out.println("\nEnter 'Y' to go again, anything else to exit.");
			repeat = iStream.next();
			iStream.nextLine();
			
		} while (repeat.equalsIgnoreCase("y"));
	}
	
	private static void getNumerator () {
	
		try {
			
			System.out.println("Enter a numerator:");
			a = iStream.nextInt();
			iStream.nextLine();
		}
		catch (InputMismatchException e) {
			
			System.out.println("\nPlease try again with a valid integer.");
			iStream.nextLine();
			getNumerator();
		}
	}
	
	private static void getDenominator () {
	
		try {
			
			System.out.println("Enter a denominator:");
			b = iStream.nextInt();
			iStream.nextLine();
		}
		catch (InputMismatchException e) {
			
			System.out.println("\nPlease try again with a valid integer.");
			iStream.nextLine();
			getDenominator();
		}
	}
}
