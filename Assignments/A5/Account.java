/** Program: Account - Object for A5p2
	Author(s): Tom Stutler
	Last Date Modified: 12/6/15
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Account {

	private double balance;
	
	public Account () {this(0);}
	public Account (double initialDeposit) {balance = initialDeposit;}
	
	public double retBalance () {return balance;}
	
	public void setBalance (int b) {balance=b;}
	
	public static Account open () {
		
		Scanner iStream = new Scanner(System.in);
		double amount = 0;
		
		try {
		
			System.out.println("Enter the intial deposit for your new account:");
			amount = iStream.nextDouble();
			iStream.nextLine();
			
			if (amount < 0) {
				throw new NonPositiveNumberException();
			} else {	
				return new Account(amount);
			}
		}
		catch (NonPositiveNumberException e) {
			
			System.out.println(e.getMessage());
			
			do {
				System.out.println("Enter a positive number:");
				amount = iStream.nextDouble();
				iStream.nextLine();
			} while (amount < 0);
			
			return new Account(amount);
		}
		catch (InputMismatchException e) {
			
			System.out.println(e.getMessage());
			
			do {
				System.out.println("Enter a positive number:");
				amount = iStream.nextDouble();
				iStream.nextLine();
			} while (amount < 0);
			
			return new Account(amount);
		}
	}
	
	public void deposit () {
		
		Scanner iStream = new Scanner(System.in);
		double amount = 0;
		
		try {
		
			System.out.println("Enter the amount you wish to deposit:");
			amount = iStream.nextDouble();
			iStream.nextLine();
			
			if (amount < 0) {
				throw new NonPositiveNumberException();
			} else {
				balance += amount;
			}
		}
		catch (NonPositiveNumberException e) {
		
			System.out.println(e.getMessage());
			
			do {
				System.out.println("Enter a positive number:");
				amount = iStream.nextDouble();
				iStream.nextLine();
			} while (amount < 0);
			
			balance += amount;
		}
		catch (InputMismatchException e) {
			
			System.out.println(e.getMessage());
			
			do {
		    		System.out.println("Enter a positive number:");
				amount = iStream.nextDouble();
				iStream.nextLine();
			} while (amount < 0);
			
			balance += amount;
		}
	}
	
	public void withdraw () {
		
		Scanner iStream = new Scanner(System.in);
		double amount = 0;
		
		try{
		
			System.out.println("Enter the intial deposit for your new account:");
			amount = iStream.nextDouble();
			iStream.nextLine();
			
			if (amount > balance) {
				throw new 	InsufficientFundsException();
			} else if (amount < 0) {
				throw new NonPositiveNumberException();
			} else {
				balance -= amount;
			}
		}
		catch (InsufficientFundsException e) {
			
			System.out.println("Not enough money.\n" +e.getMessage());
		}
		catch (NonPositiveNumberException e) {
			
			System.out.println(e.getMessage());
			
			do {
				System.out.println("Enter a positive number:");
				amount = iStream.nextDouble();
				iStream.nextLine();
			} while (amount < 0);
			
			balance  -= amount;
		}
		catch (InputMismatchException e) {
			
			System.out.println(e.getMessage());
			
			do {
				System.out.println("Enter a positive number:");
				amount = iStream.nextDouble();
				iStream.nextLine();
			} while (amount < 0);
			
			balance -= amount;
		}
	}
}
