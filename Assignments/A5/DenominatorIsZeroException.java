/** Program: DenominatorIsZeroException - Object for A5p1
	Author(s): Tom Stutler
	Last Date Modified: 12/3/15
*/

public class DenominatorIsZeroException extends Exception {

	public DenominatorIsZeroException () {this("!!!DIVIDE BY ZERO ERROR!!!");}
	public DenominatorIsZeroException (String s) {super(s);}
}
