/** Program: Vect - object
	Author(s): Tom Stutler
	Last Date Modified: 11/15/15
*/

public class Vector extends Pairs {
	
	public Vector () {this(0,0);}
	public Vector (double n) {this(n,0);}
	public Vector (double n, double m) {super(n,m);}
	public Vector (Vector o) {super(o);}
	public Vector (Pairs o) {super(o);}
	
	public double mult (Vector other) { //dot prod
		
		return (this.retA()*other.retA() + this.retB()*other.retB());
	}
	public Vector mult (double n) { //scalar
		
		return new Vector(n*this.retA(), n*this.retB());
	}
	
	public boolean equals (Vector other) {
		
		return (this.retA()==other.retA() & this.retB()==other.retB());
	}
	
	public String toString () {
		
		return ("<" +this.retA()+ ", " +this.retB()+ ">");
	}
}
