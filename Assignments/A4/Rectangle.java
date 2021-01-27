/** Program: Rectangle - Object
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

import java.util.Scanner;

public class Rectangle extends Shape {

	private double length;
	private double width;
	
	public Rectangle () {this(0,0);}
	public Rectangle (double l) {this(l,0);}
	public Rectangle (Rectangle o) {this(o.retLength(), o.retWidth());}
	public Rectangle (double l, double w) {

		super();
		length = l;
		width = w;
	}
	
	public double retLength () {return length;}
	public double retWidth () {return width;}
	
	public void setLength (int l) {length=l;}
	public void setWidth (int w) {width=w;}
	
	public void display () {
		
		System.out.println("Shape=Rectangle\tLength=" +length+ "\tWidth=" +width);
		perimeter();
		area();
	}
	
	public void getDimensions () {
		
		Scanner iStream = new Scanner(System.in);
		
		System.out.println("Input for Rectangle - enter length and width"
			+"(separated by space):");
		length = iStream.nextDouble();
		width = iStream.nextDouble();
		iStream.nextLine();
	}
	
	public void perimeter () {
		
		this.setPerim(2*(length+width));
		System.out.println("Perimeter = " +this.retPerim());
	}
	
	public void area () {
		
		this.setArea(length*width);
		System.out.println("Area = " +this.retArea());
	}
	
	public void volume () {this.setVolume(0);}
}
