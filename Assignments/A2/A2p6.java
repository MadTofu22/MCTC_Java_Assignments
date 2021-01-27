/** Program: GCD calc
	Author(s): Tom Stutler
	Last Date Modified: 9/17/15
*/

import java.util.Scanner;

public class A2p6 {

	public static void main (String[] args) {
		
		Scanner iStream = new Scanner(System.in);
		boolean repeat=false;
		String cont="";
		
		do {
			
			System.out.println("Create a fraction with numerator 4 and"
				+ " denominator 2");
			Fraction f1 = new Fraction(4, 2);
			System.out.println("Fraction f1: " + f1.retFraction());
			
			System.out.println("Create a fraction with numerator 4 and"
				+ " denominator 2");
			Fraction f2 = new Fraction(0, 1);
			System.out.println("Fraction f2: " + f2.retFraction());
			
			System.out.println("Output f1 as double: " + f1.retDecimal());
			f1.reduce();
			System.out.println("Output f1 as reduced fraction: "
				+ f1.retFraction());
				
			System.out.println("Reset fraction f2 numerator: 20");
			f2.setNumer(20);
			
			System.out.println("Reset fraction f2 denominator: 60");
			f2.setNumer(60);
			
			System.out.println("Output f2 as double: " + f2.retDecimal());
			f2.reduce();
			System.out.println("Output f2 as reduced fraction: "
				+ f1.retFraction());
			
			//Prompt user to repeat
			do {
			
				System.out.println("Continue (y or n):");
				cont = iStream.next();
				iStream.nextLine();
				cont = cont.toUpperCase();

			} while (!cont.equals("Y") && !cont.equals("N"));
			
			repeat = cont.equals("Y");
			
		} while (repeat);	
	}
}
