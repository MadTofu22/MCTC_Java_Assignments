/** Program: Complex Alternate Part2 - Object
	Author(s): Tom Stutler
	Last Date Modified: 10/27/15
*/
import java.util.Scanner;

public class Complex2 {
	
	private double real;
	private double imag;
	
	//Constructors
	public Complex2() {real=0.0; imag=0.0;}
	public Complex2(double num) {real=num; imag=0;}
	public Complex2(double num1, double num2) {real=num1; imag=num2;}
	public Complex2(Complex2 other) {
		
		real = other.getReal();
		imag = other.getImag();
	}
	
	//Setters
	public void setReal(double num) {real=num;}
	public void setImag(double num) {imag=num;}
	
	public static Complex2 userSet() {
		
		Scanner iStream = new Scanner(System.in);
		iStream.useDelimiter("\\+|i|\n");
		double r=0, i=0;
		
		System.out.println("Enter Complex number a+bi: ");
		r = iStream.nextFloat();
		i = iStream.nextFloat();
		iStream.nextLine();
		
		System.out.println("You input " +r+ "+" +i+ "i");
		return new Complex2(r, i);
	}
	
	//Accessors
	public double getReal() {return real;}
	public double getImag() {return imag;}

	public String toString() {
	
		return ("" +this.real+ " + " +this.imag+ "i");
	}
	
	public boolean equals(Complex2 other) {
		
		if(this.real==other.real) {
			return (this.imag==other.imag);
		} else {
			return false;
		}
	}
	
	//Mutators
	public void add(Complex2 other) {
		
		this.real += other.real;
		this.imag += other.imag;
	}
	
	public void sub(Complex2 other) {
		
		this.real -= other.real;
		this.imag -= other.imag;
	}

	public void mult(Complex2 other) {
		
		double r = this.real;
		double i = this.imag;
		this.real = (r*other.real)-(i*other.imag);
		this.imag = (r*other.imag)+(i*other.real);
	}
}
