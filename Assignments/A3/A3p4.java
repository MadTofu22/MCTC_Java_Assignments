/** Program: Char Analysis
	Author(s): Tom Stutler
	Last Date Modified: 10/20/15
*/

import java.util.Scanner;

public class A3p4 {

	public static void main (String[] args) {
		
		Scanner iStream = new Scanner(System.in);
		int numUpper=0, numLower=0, numDigit=0, numWhite=0, numOther=0;
		String userInput="";
		
		//Prompt user for input
		System.out.println("Enter multiple lines before hitting enter!");
		userInput = iStream.nextLine();
		
		//Gather data from input
		//for (int i=0; i<userInput.length(); i++) {
		for (char element : userInput.toCharArray()) {
			if (Character.isDigit(element)) {
				numDigit++;
			} else if (Character.isWhitespace(element)) {
				numWhite++;
			} else if (Character.isLetter(element)) {
				if (Character.isUpperCase(element)) {
					numUpper++;
				} else {
					numLower++;
				}
			} else {
				numOther++;
			}
		}
		
		//Display results
		System.out.println("\n" +userInput 
			+"\n\nThere were " +userInput.length()+ " total characters."
			+"\nThere were " +numUpper+ " upper case letters."
			+"\nThere were " +numLower+ " lower case letters."
			+"\nThere were " +numDigit+ " digits."
			+"\nThere were " +numWhite+ " white space characters."
			+"\nThere were " +numOther+ " other characters.");
	}
}
