/** Program: Fibonacci Finder
	Author(s): Tom Stutler
	Last Date Modified: 9/10/2015
*/

import java.util.Scanner;

public class A2p2 {

	public static void main(String[] args) {
		
		Scanner iStream = new Scanner(System.in);
		String cont = "";
		
		do {
			int n=0, currTerm=1, prevTerm=0, result=0;
			
			//Prompt the user for a term to search for
			do {
				
				System.out.println("Enter a positive integer:");
				n = iStream.nextInt();
				iStream.nextLine();
				 
			} while (n <= 0);
			
			//Get Fibonacci term
			switch (n) {

				case 1: result = 0; //Returns 0 for term 1
						break;
				
				case 2: result = 1; //Returns 1 for term 2
						break;
				
				default: for (int i=0; i<n-2; i++) { //Calculates term n
							
							result = prevTerm + currTerm;
							prevTerm = currTerm;
							currTerm = result;
						}
						break;
			}
			
			//Display result to user
			System.out.println("Term " + n + " of the Fibonacci Sequence "
				+ "is " + result);
				
			//Prompt user to repeat program
			do {
			
				System.out.println("Continue? (y or n): ");
				repPrompt = iStream.next();
				iStream.nextLine();
				cont = cont.toUpperCase();
				
			} while (!cont.equals("Y") && !cont.equals("N"));
			
		} while (cont.equals("Y"));
	}
}
