/** Program: Change Dispenser
	Author(s): Tom Stutler
	Last Date Modified: 9/3/2015
*/

import java.util.Scanner;

public class A1p8 {

	public static void main(String[] args) {

		Scanner iStream = new Scanner(System.in);
		int q=0, d=0, n=0, price=0, change=0;

		//Prompt user for the price.
		System.out.println("Enter price of the item"
			+ "(from 25 to 100 cents in 5-cent increments): ");
		price = iStream.nextInt();
		iStream.nextLine();

		//Calculate the change to dispense.
		change = 100-price;
		q = change/25;
		change -= q*25;
		d = change/10;
		change -= d*10;
		n = change/5;

		System.out.println("You bought an item for " + price
			+ " and gave me a dollar, so your change is\n\t"
			+ q + " quarter(s)\n\t" + d + " dime(s), and\n\t"
			+ n + " nickel(s).");
	}
}
