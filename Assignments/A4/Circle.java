/** Program: Circle - Object
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

import java.util.Scanner;

public class Circle extends Shape {

	private double radius;
	
	public Circle () {this(0);}
	public Circle (Circle o) {this(o.retRadius());}
	public Circle (double r) {
		
		super();
		radius = r;
	}
	
	public double retRadius () {return radius;}
	
	public void setRadius (double r) {radius=r;}
	
	public void display () {
		
		System.out.println("Shape=Circle\tRadius=" +radius);
	}
	
	public void getDimensions () {
		
		Scanner iStream = new Scanner(System.in);
		
		System.out.println("Input for Circle - enter radius:");
		radius = iStream.nextDouble();
		iStream.nextLine();
	}
	
	public void perimeter () {
		
		this.setPerim(2*Math.PI*radius);
		System.out.println("Circumfrence = " +this.retPerim());
	}
	
	public void area () {
		
		this.setArea(Math.PI*Math.pow(radius,2));
		System.out.println("Area = " +this.retArea());
	}
	
	public void volume () {this.setVolume(0);}
}
