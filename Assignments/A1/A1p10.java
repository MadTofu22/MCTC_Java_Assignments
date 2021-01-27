/** Program: Pig Lantin Translator
	Author(s): Tom Stutler
	Last Date Modified: 9/3/2015
*/

import java.util.Scanner;

public class A1p10 {

	public static void main(String[] args) {

		Scanner iStream = new Scanner(System.in);
		String firstName, lastName, newFirst, newLast;

		//Prompt user for their name.
		System.out.println("Enter your first name: ");
		firstName = iStream.next();
		iStream.nextLine();
		System.out.println("Enter your last name: ");
		lastName = iStream.next();
		iStream.nextLine();

		//Duplicate and set lowercase to preserve original name.
		newFirst = firstName.toLowerCase();
		newLast = lastName.toLowerCase();

		//Translate the name to Pig Latin
		newFirst = newFirst.substring(1,2).toUpperCase()
			+ newFirst.substring(2) + newFirst.charAt(0) + "ay";
		newLast = newLast.substring(1,2).toUpperCase()
			+ newLast.substring(2) + newLast.charAt(0) + "ay";

		System.out.println(firstName + " " + lastName
			+ " turned into Pig Latin is:\n" + newFirst
			+ " " + newLast);
	}
}
