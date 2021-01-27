/** Program: Pairs - Object
	Author(s): Tom Stutler
	Last Date Modified: 11/15/15
*/

public class Pairs {

	private double a;
	private double b;
	
	public Pairs () {a=0; b=0;}
	public Pairs (double n) {a=n; b=0;}
	public Pairs (double n, double m) {a=n; b=m;}
	public Pairs (Pairs o) {a=o.retA(); b=o.retB();}
	
	public double retA () {return a;}
	public double retB () {return b;}
	
	public void setA (double n) {this.a=n;}
	public void setB (double n) {this.b=n;}
	
	public Pairs add (Pairs other) {
		
		double n = this.a + other.retA();
		double m = this.b + other.retB();	
		return new Pairs(n, m);
	}
	
	public Pairs sub (Pairs other) {
		
		double n = this.a - other.retA();
		double m = this.b - other.retB();	
		return new Pairs(n, m);
	}
	
	public boolean equals (Pairs other) {
		
		return (this.a==other.retA() && this.b==other.retB());
	}
}
