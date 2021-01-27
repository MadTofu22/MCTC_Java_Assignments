/** Program: NonPositiveNumberException - Exception for Account
	Author(s): Tom Stutler
	Last Date Modified: 12/6/15
*/

public class NonPositiveNumberException extends Exception {
	
	public NonPositiveNumberException () {this("NonPositiveNumberExcetption: Deposit "
												+"amount must be positive.");}
	public NonPositiveNumberException (String s) {super(s);}
}
