/** Program: Can -object
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

import java.util.Scanner;

public class Can extends Shape {

	private double radius;
	private double height;
	
	public Can () {this(0,0);}
	public Can (double r) {this(r,0);}
	public Can (Can o) {this(o.retRadius(), o.retHeight());}
	public Can (double r, double h) {
		
		super();
		radius = r;
		height = h;
	}
	
	public double retRadius () {return radius;}
	public double retHeight () {return height;}
	
	public void setRadius (double r) {radius=r;}
	public void setHeight (double h) {height=h;}
	
	public void display () {
		
		System.out.println("Shape=Can\tRadius=" +radius+ "\tHeight=" +height);
		area();
		volume();
	}
	
	public void getDimensions () {
		
		Scanner iStream = new Scanner(System.in);
		
		System.out.println("Input for Can - enter radius and height "
			+"(separated by space):");
		radius = iStream.nextDouble();
		height = iStream.nextDouble();
		iStream.nextLine();
	}
	
	public void area () {
		
		this.setArea(Math.PI*2*(Math.pow(radius,2) + radius*height));
		System.out.println("Surface area = " +this.retArea());
	}
	
	public void volume () {
		
		this.setVolume((4*Math.PI*Math.pow(radius,3))/3);
		System.out.println("Volume = " +this.retVolume());
	}
	
	public void perimeter () {this.setPerim(0);}
}
