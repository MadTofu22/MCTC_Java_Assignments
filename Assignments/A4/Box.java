/** Program: Box - object
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

import java.util.Scanner;

public class Box extends Shape {

	private double length;
	private double width;
	private double height;
	
	public Box () {this(0,0,0);}
	public Box (double l) {this(l,0,0);}
	public Box (double l, double w) {this(l,w,0);}
	public Box (Box o) {this(o.retLength(), o.retWidth(), o.retHeight());}
	public Box (double l, double w, double h) {
		
		super();
		length = l;
		width = w;
		height = h;
	}
	
	public double retLength () {return length;}
	public double retWidth () {return width;}
	public double retHeight () {return height;}
	
	public void setLength (double l) {length=l;}
	public void setWidth (double w) {width=w;}
	public void setHeight (double h) {height=h;}
	
	public void display () {
		
		System.out.println("Shape=Box\tLength=" +length+ "\tWidth=" +width+ "\tHeight="
			+height);
		area();
		volume();	
	}
	
	public void getDimensions () {
		
		Scanner iStream = new Scanner(System.in);
		
		System.out.println("Box input - enter length, width, and height "
			+"(separated by space):");
		length = iStream.nextDouble();
		width = iStream.nextDouble();
		height = iStream.nextDouble();
		iStream.nextLine();
	}
	
	public void area () {
		
		this.setArea(2*(length*width + length*height + height*width));
		System.out.println("Surface Area = " +this.retArea());
	}
	
	public void volume () {
		
		this.setVolume(length*width*height);
		System.out.println("Volume = " +this.retVolume());
	}
	
	public void perimeter () {this.setPerim(0);}
}
