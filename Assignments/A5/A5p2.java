/** Program: A5p2 - driver for Account
	Author(s): Tom Stutler
	Last Date Modified: 12/3/15
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class A5p2 {
	
	private static Scanner iStream = new Scanner(System.in);
	private static Account a1 = new Account();
	private static boolean valid=true;
	private static String sel = "";
	private static String repeat = "";
	
	public static void main (String[] args) {
		
		do {
			do {
				try {
				
					getMenuSelection();
					sel.toLowerCase();
					
					transaction();
					System.out.println("Your balance is: " +a1.retBalance());
				}
				catch (InputMismatchException e) {
				
					System.out.println("Invalid entry. Please select a valid option.\n");
					valid = false;
				}	
			} while (!valid);
			
			do {
				try {
			
					promptRepeat();
				}
				catch (InputMismatchException e) {
				
					System.out.println("Invalid entry - try again.\n");
					valid = true;
					iStream.nextLine();
				}
			} while (!valid);
		} while (repeat.equalsIgnoreCase("y"));
	}
	
	private static void getMenuSelection () throws InputMismatchException {
		
		System.out.println("Do you want to open an account, deposit, or withdraw?"
						+"\nEnter O for open an account, D for deposit, W for withdraw:");
		sel = iStream.next();
		iStream.nextLine();
	}
	
	private static void transaction () {
		
		switch (sel) {
		
			case "o":	a1 = Account.open();
						valid = true;
						break;
		
			case "d":	a1.deposit();
						valid = true;
						break;
					
			case "w":	a1.withdraw();
						valid = true;
						break;
		
			default:	System.out.println("Invalid entry - try again.\n");
						valid = false;
						break;
		}
	}
	
	private static void promptRepeat () throws InputMismatchException {
				
		System.out.println("More bankning? Y to continue, N to exit:");
		repeat = iStream.next();
		iStream.nextLine();
		
		if (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n")) {
			valid = false;
		} else {
			valid = true;
		}
	}
}
