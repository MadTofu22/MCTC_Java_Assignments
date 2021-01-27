/** Program: Fraction Calc
	Author(s): Tom Stutler
	Last Date Modified: 9/10/2015
*/

import java.util.Scanner;

public class A2p3 {

	public static void main(String[] args) {
		
		Scanner iStream = new Scanner(System.in);
		boolean repeat=false;
		
		//Loop to repeat program.
		do {
		
			int a=0, b=0, c=0, d=0, numer=0, denom=0;
			String op="", cont="";
			
			//Get frst fraction
			do {
				
				System.out.println("Enter fraction one in the form a/b:");
				iStream.useDelimiter("/|\n");
				a = iStream.nextInt();
				b = iStream.nextInt();
				iStream.nextLine();
								
			} while (a<=0 || b<=0);
			
			//Get operation choice
			do {
				System.out.println("Enter operation: ");
				op = iStream.next();
				iStream.nextLine();
				
			} while (!"+-/*".contains(op));
			
			//Get second fraction
			do {
				
				System.out.println("Enter fraction two in the form c/d:");
				iStream.useDelimiter("/|\n");
				c = iStream.nextInt();
				d = iStream.nextInt();
				iStream.nextLine();
				
			} while (c<=0 || d<=0);
			
			switch (op) {
				
				case "+":	numer = a*d + b*c;
							denom = b*d;
							System.out.println("Sum = " + numer + "/" + denom);
							break;
							
				case "-":	numer = a*d - b*c;
							denom = b*d;
							System.out.println("Difference = " + numer + "/"
								+ denom);
							break;
							
				case "*":	numer = a*c;
							denom = b*d;
							System.out.println("Product = " + numer + "/"
								+ denom);
							break;
							
				case "/":	numer = a*d;
							denom = b*c;
							System.out.println("Quotient = " + numer + "/"
								+ denom);
							break;
			}
			
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
