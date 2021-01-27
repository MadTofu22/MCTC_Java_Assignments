/** Program: Bike Speed Calc
	Author(s): Tom Stutler
	Last Date Modified: 9/3/2015
*/

public class A1p5 {

	public static final double PI=3.145;

	public static void main(String[] args) {

		double speed=0.0, gearSize=100.0, cadence=90.0;

		//convert gearSize from inches to miles, and minutes to hours.
		speed = gearSize*PI*(1.0/12.0)*(1.0/5280.0)*cadence*60.0;

		System.out.println("With a gear size of " + gearSize
			+ " and a cadence of "+ cadence + " you will bike "
			+ speed + "mph.");
	}
}