/** Program: Ball - object
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

import java.util.Scanner;

public class Ball extends Shape {

	private double radius;
	
	public Ball () {this(0);}
	public Ball (Ball o) {this(o.retRadius());}
	public Ball (double r) {
		
		super();
		radius = r;
	}
	
	public double retRadius () {return radius;}
	
	public void setRadius (double r) {radius=r;}
	
	public void display () {
		
		System.out.println("Shape=Ball\tRadius=" +radius);
		area();
		volume();
	}
	
	public void getDimensions () {
		
		Scanner iStream = new Scanner(System.in);
		
		System.out.println("Input for Ball - enter radius:");
		radius = iStream.nextDouble();
		iStream.nextLine();
	}
	
	public void area () {
		
		this.setArea(4*Math.PI*Math.pow(radius,2));
		System.out.println("Surface Area = " +this.retArea());
	}
	
	public void volume () {
		
		this.setVolume((4*Math.PI*Math.pow(radius,3))/3);
		System.out.println("Volume = " +this.retVolume());
	}
	
	public void perimeter () {this.setPerim(0);}
}
