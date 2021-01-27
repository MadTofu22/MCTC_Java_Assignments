/** Program: Babylonian Square Root
	Author(s): Tom Stutler
	Last Date Modified: 9/3/2015
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class A1p6 {

	public static void main (String[] args) {

		DecimalFormat sigDig = new DecimalFormat("#0.00");
		Scanner iStream = new Scanner(System.in);
		double guess=0, r=0;
		int n=0;

		//Prompt the user for an number.
		System.out.print("This program makes a rough estimate for the "
			+ "square roots.\nEnter a positive integer to estimate the"
			+ " sqaure root of: \n");
		n = iStream.nextInt();
		iStream.nextLine();

		//Calculate the aproximate square root.
		guess = n/2.0;
		for (int i=0; i<5; i++) {
			r = n/guess;
			guess = (guess+r)/2.0;
		}

		//Output result
		System.out.print("The estimated square root " + n + " is "
			+ sigDig.format(guess) + "\n");
	}
}
