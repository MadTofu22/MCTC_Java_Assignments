/** Program: Complex - object
	Author(s): Tom Stutler
	Last Date Modified: 11/12/15
*/

public class Complex extends Pairs {
	
	public Complex () {this(0,0);}
	public Complex (double n) {this(n,0);}
	public Complex (double n, double m) {super(n,m);}
	public Complex (Complex o) {super(o);}
	public Complex (Pairs o) {super(o);}
	
	public Complex mult (Complex other) {
		
		double n = (this.retA()*other.retA() - this.retB()*other.retB());
		double m = (this.retA()*other.retB() + this.retB()*other.retA());
		return new Complex(n,m);
	}
	
	public Complex div (Complex other) {
		
		double d = Math.pow(other.retA(), 2) + Math.pow(other.retB(), 2);
		double n = (this.retA()*other.retA() + this.retB()*other.retB())/d;
		double m = (this.retB()*other.retA() - this.retA()*other.retB())/d;
		return new Complex(n,m);
	}
	
	public String toString () {
		
		return ("" +this.retA()+ " + " +this.retB()+ "i");
	}
}
