/** Program: Complex Part1 - Object
	Author(s): Tom Stutler
	Last Date Modified: 10/12/15
*/
import java.util.Scanner;

public class Complex1{
	
	private double real;
	private double imag;
	
	//Constructors
	public Complex1() {real=0.0; imag=0.0;}
	public Complex1(double num) {real=num; imag=0;}
	public Complex1(double num1, double num2) {real=num1; imag=num2;}
	public Complex1(Complex1 other) {
		
		real = other.getReal();
		imag = other.getImag();
	}
	
	//Setters
	public void setReal(double num) {real=num;}
	public void setImag(double num) {imag=num;}
	
	public static Complex1 userSet() {
		
		Scanner iStream = new Scanner(System.in);
		iStream.useDelimiter("\\+|i|\n");
		double r=0, i=0;
		
		System.out.println("Enter Complex number a+bi: ");
		r = iStream.nextFloat();
		i = iStream.nextFloat();
		iStream.nextLine();
		
		System.out.println("You input " +r+ "+" +i+ "i");
		return new Complex1(r, i);
	}
	
	//Accessors
	public double getReal() {return real;}
	public double getImag() {return imag;}

	public String toString() {
	
		return ("" +this.real+ " + " +this.imag+ "i");
	}
	
	public boolean equals(Complex1 other) {
		
		if(this.real==other.real) {
			return (this.imag==other.imag);
		} else {
			return false;
		}
	}
	
	//Mutators
	public static Complex1 add(Complex1 c1, Complex1 c2) {
		
		double r = c1.getReal()+c2.getReal();
		double i = c1.getImag()+c2.getImag();
		
		return new Complex1(r, i);
	}
	public Complex1 add(Complex1 other) {
		
		double r = this.real+other.real;
		double i = this.imag+other.imag;
		
		return new Complex1(r, i);
	}

	public static Complex1 sub(Complex1 c1, Complex1 c2) {
		
		double r = c1.getReal()-c2.getReal();
		double i = c1.getImag()-c2.getImag();
		
		return new Complex1(r, i);
	}
	public Complex1 sub(Complex1 other) {
		
		double r = this.real-other.real;
		double i = this.imag-other.imag;
		
		return new Complex1(r, i);
	}

	public static Complex1 mult(Complex1 c1, Complex1 c2) {
		
		double r = (c1.getReal()*c2.getReal())-(c1.getImag()*c2.getImag());
		double i = (c1.getReal()*c2.getImag())+(c1.getImag()*c2.getReal());
		
		return new Complex1(r, i);
	}
	public Complex1 mult(Complex1 other) {
		
		double r = (this.real*other.real)-(this.imag*other.imag);
		double i = (this.real*other.imag)+(this.imag*other.real);
		
		return new Complex1(r, i);
	}
}
