/** Program: Itemized Receipt Table
	Author(s): Tom Stutler
	Last Date Modified: 9/3/2015
*/

import java.util.Scanner;

public class A1p9 {

	public static void main(String[] args) {

		Scanner iStream = new Scanner(System.in);
		String name1, name2, name3;
		int qty1, qty2, qty3;
		double price1, price2, price3, tax, total;

		//Get input for item 1
		System.out.println("Name of item 1: ");
		name1 = iStream.next();
		iStream.nextLine();
		System.out.println("Quantity of item 1: ");
		qty1 = iStream.nextInt();
		iStream.nextLine();
		System.out.println("Price of item 1: ");
		price1 = iStream.nextDouble();
		iStream.nextLine();

		//Get input for item 2
		System.out.println("Name of item 2: ");
		name2 = iStream.next();
		iStream.nextLine();
		System.out.println("Quantity of item 2: ");
		qty2 = iStream.nextInt();
		iStream.nextLine();
		System.out.println("Price of item 2: ");
		price2 = iStream.nextDouble();
		iStream.nextLine();

		//Get input for item 3
		System.out.println("Name of item 3: ");
		name3 = iStream.next();
		iStream.nextLine();
		System.out.println("Quantity of item 3: ");
		qty3 = iStream.nextInt();
		iStream.nextLine();
		System.out.println("Price of item 3: ");
		price3 = iStream.nextDouble();
		iStream.nextLine();

		//Calculate sub-total and tax to be paid
		total = (qty1*price1)+(qty2*price2)+(qty3*price3);
		tax = total*0.0625;

		//Output the itemized bill in table format.
		System.out.printf("%-30s%-10s%-10s%-10s%n"
			, "Item", "Quantity", "Price", "Total");
		System.out.printf("%-30s%-10d%-10.2f%-10.2f%n"
			, name1, qty1, price1, (qty1*price1));
		System.out.printf("%-30s%-10d%-10.2f%-10.2f%n"
			, name2, qty2, price2, (qty2*price2));
		System.out.printf("%-30s%-10d%-10.2f%-10.2f%n"
			, name3, qty3, price3, (qty3*price3));
		System.out.printf("%-50s%-10.2f%n", "Sub-Total", total);
		System.out.printf("%-50s%-10.2f%n", "6.25 Sales Tax", tax);
		System.out.printf("%-50s%-10.2f%n", "Total", (total+tax));
	}
}