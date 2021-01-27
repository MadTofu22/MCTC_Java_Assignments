/** Program: InsufficientFundsException - Exception for Account
	Author(s): Tom Stutler
	Last Date Modified: 12/6/15
*/

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException () {this("InsufficientFundsExcetption: Insufficient"
												+" funds to withdraw this amount.");}
	public InsufficientFundsException (String s) {super(s);}
}
