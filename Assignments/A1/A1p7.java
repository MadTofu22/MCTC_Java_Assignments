/** Program: Yearly Depreciation Calc
	Author(s): Tom Stutler
	Last Date Modified: 9/3/2015
*/

import java.text.NumberFormat;
import java.util.Scanner;

public class A1p7 {

	public static void main(String[] args) {

		Scanner inStream = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		double deprec=0, price=0, salVal=0, years=0;

		//Get user input.
		System.out.println("Enter the purchase price"
			+ " (without the $ symbol): ");
		price = inStream.nextDouble();
		System.out.println("Enter the expected number of years of "
			+ "service: ");
		years = inStream.nextDouble();
		System.out.println("Enter the salvage value: ");
		salVal = inStream.nextDouble();

		//Calculate the depreciation per year.
		deprec = (price - salVal)/years;

		System.out.println("The yearly depreciation is "
			+ formatter.format(deprec));
	}
}
