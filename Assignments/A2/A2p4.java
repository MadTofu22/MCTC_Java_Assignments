/** Program: Item Price Inflation Calc
	Author(s): Tom Stutler
	Last Date Modified: 9/10/15
*/

import java.util.Scanner;

public class A2p4 {

	public static void main(String[] args) { 
		
		Scanner iStream = new Scanner(System.in);
		double total=0, inflRate=0, inflAmnt=0, cost=0;
		int numYears=0;
		boolean repeat=false;
		String cont="";
		
		//Loop to repeat the program
		do {
		
			//Get cost of the item
			do {
				
				System.out.println("Enter cost of the item:");
				cost = iStream.nextFloat();
				iStream.nextLine();
				
			} while (cost<=0);
			
			//Get the number of years to calculate
			do {
				
				System.out.println("Enter the number of (whole) years until the"
					+ "item is purchased:");
				numYears = iStream.nextInt();
				iStream.nextLine();
				
			} while (numYears<=0);
			
			//Get the inflation rate as percentage.
			do {
			
				System.out.println("Enter the inflation rate as a percentage:");
				inflRate = iStream.nextFloat();
				iStream.nextLine();
				
			} while (inflRate<=0);
			
			//Calculate the total price after the specified #years
			inflRate = inflRate/100.00;
			for (int i=0; i<numYears; i++) {
				
				inflAmnt = cost*inflRate;
				total = cost+inflAmnt;
				cost = total;
			}
			
			//Output result
			System.out.printf("The estimated final cost of the item is $%1.2f\n"
				, total);
				
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
