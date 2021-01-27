/** Program: Babylonian Square Root W/ Tolerance
	Author(s): Tom Stutler
	Last Date Modified: 9/3/2015
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class A2p1 {

	public static void main(String[] args) {
	
		Scanner iStream = new Scanner(System.in);
		DecimalFormat tolerance = new DecimalFormat("0.00000");
		double guess=0, prevGuess=0, n=0, r=0;
		boolean accurate=false;
		
		System.out.println("This program estimates square roots.\n");
		
		//Prompt for input and repeat if entry is invalid
		do {
		
			System.out.println("Enter a positive integer to estimate"
				+ "the square root of:");
			n = iStream.nextFloat();
			iStream.nextLine();
		} while (n<=0);
		
		//Initial guess
		guess = n/2.0;
		
		//Calculate guess and check tolerance, repeat if not accurate
		do {
		
			r = n/guess;
			guess = (guess+r)/2.0;
			System.out.println("Current guess: " + guess);
			
			if (Math.abs(guess-prevGuess) > 0.00001) {
				
				prevGuess = guess;
			} else {
			
				accurate = true;
			}
		} while (accurate == false);
		
		System.out.println("The estimated square root of " + n + " is "
			+ tolerance.format(guess));
	}
}
