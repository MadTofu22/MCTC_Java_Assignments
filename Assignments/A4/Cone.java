/** Program: Cone - object
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

import java.util.Scanner;

public class Cone extends Shape {

	private double radius;
	private double height;
	
	public Cone () {this(0,0);}
	public Cone (double r) {this(r,0);}
	public Cone (Cone o) {this(o.retRadius(), o.retHeight());}
	public Cone (double r, double h) {
		
		super();
		radius = r;
		height = h;
	}
	
	public double retRadius () {return radius;}
	public double retHeight () {return height;}
	
	public void setRadius (double r) {radius=r;}
	public void setHeight (double h) {height=h;}
	
	public void display () {
		
		System.out.println("Shape=Cone\tRadius=" +radius+ "\tHeight=" +height);
		area();
		volume();
	}
	
	public void getDimensions () {
		
		Scanner iStream = new Scanner(System.in);
		
		System.out.println("Input for Cone - enter radius and height "
			+"(separated by space):");
		radius = iStream.nextDouble();
		height = iStream.nextDouble();
		iStream.nextLine();
	}
	
	public void area () {
		
		double s = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
		this.setArea(Math.PI*(radius*s + Math.pow(radius,2)));
		System.out.println("Surface Area = " +this.retArea());
	}
	
	public void volume () {
		
		this.setVolume((Math.PI*Math.pow(radius,2)*height)/3);
		System.out.println("Volume = " +this.retVolume());
	}
	
	public void perimeter () {this.setPerim(0);}
}
