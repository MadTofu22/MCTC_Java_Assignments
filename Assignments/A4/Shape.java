/** Program: Shape - Abstract Object
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

import java.util.Scanner;

public abstract class Shape {

	private static int numOfShapes=0;
	private double area;
	private double perim;
	private double volume;
	
	public Shape () {this(0,0,0);}
	public Shape (double a) {this(a,0,0);}
	public Shape (double a, double p) {this(a,p,0);}
	public Shape (Shape o) {this(o.retArea());}
	public Shape (double a, double p, double v) {
		
		numOfShapes++;
		area = a;
		perim = p;
		volume = v;
	}
	
	public double retArea () {return area;}
	public double retPerim () {return perim;}
	public double retVolume () {return volume;}
	public static int retNumOfShapes () {return numOfShapes;}
	
	public void setArea (double a) {area=a;}
	public void setPerim (double p) {perim=p;}
	public void setVolume (double v) {volume=v;}
	
	public abstract void display ();
	public abstract void getDimensions ();
	public abstract void perimeter ();
	public abstract void area ();
	public abstract void volume ();
}
