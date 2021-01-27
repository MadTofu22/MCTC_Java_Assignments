/** Program: Smalles Value Finder
	Author(s): Tom Stutler
	Last Date Modified: 10/19/15
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class A3p3{

	public static void main (String[] args) {
		
		String repeat="", userNums="";
		Scanner iStream = new Scanner(System.in);
		StringTokenizer splitter;
		
		//Loop to repeat the process
		do{
			double smallest=0, curr=0;//Declared in loop to reset on repeat
			
			System.out.println("This program finds the smallest number in a"
				+"series of numbers.\nPlease enter a list of numbers separated"
				+"by comma and space:");
			userNums = iStream.nextLine();
			splitter = new StringTokenizer(userNums, " \n,");
			
			//Get first number to start searching for the smallest.
			smallest = Double.parseDouble(splitter.nextToken());
			
			//Loop through user input to find the smallest number
			while(splitter.hasMoreTokens()) {
			
				curr = Double.parseDouble(splitter.nextToken());
				if (smallest>curr) {
					smallest = curr;
				}
			}
			
			//Return results and prompt user to repeat
			System.out.println("\nThe smallest number is " +smallest
				+"\nDo it again? Type y for yes, n for no.");
			repeat = iStream.next();
			iStream.nextLine();
			
		} while(repeat.equalsIgnoreCase("Y"));
	}
}
