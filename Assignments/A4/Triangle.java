/** Program: Triangle
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

import java.util.Scanner;

public class Triangle extends Shape {

	private double a;
	private double b;
	private double c;
	
	public Triangle () {this(0,0,0);}
	public Triangle (double x) {this(x,0,0);}
	public Triangle (double x, double y) {this(x,y,0);}
	public Triangle (Triangle o) {this(o.retA(), o.retB(), o.retC());}
	public Triangle (double x, double y, double z) {
		
		super();
		a=x;
		b=y;
		c=z;
	}
	
	public double retA () {return a;}
	public double retB () {return b;}
	public double retC () {return c;}
	
	public void setA (double n) {a=n;}
	public void setB (double n) {b=n;}
	public void setC (double n) {c=n;}
	
	public void display () {
		
		System.out.println("Shape=Triangle\t Side1=" +a+ "\tSide2=" +b+ "\tSide3=" +c);
		perimeter();
		area();
	}
	
	public void getDimensions () {
		
		Scanner iStream = new Scanner(System.in);
		
		System.out.println("Input for Triangle - enter 3 side lengths "
			+"(separated by space):");
		a = iStream.nextDouble();
		b = iStream.nextDouble();
		c = iStream.nextDouble();
		iStream.nextLine();
	}
	
	public void perimeter () {
		
		this.setPerim(a+b+c);
		System.out.println("Perimeter = " +this.retPerim());
	}
	
	public void area () {
		
		double s = (a+b+c)/2;
		this.setArea(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
		System.out.println("Area = " +this.retArea());
	}
	
	public void volume () {this.setVolume(0);}
}
