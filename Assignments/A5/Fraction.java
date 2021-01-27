/** Program: Object - Fraction for A5p1
	Author(s): Tom Stutler
	Last Date Modified: 12/3/15
*/

import java.util.Scanner;

public class Fraction {

	private int numer;
	private int denom;
	private int gcd;
	private double decimal;
	
	public Fraction (){this(1,1);}
	public Fraction (int n) {this(n,1);}
	public Fraction (Fraction o) {this(o.retNumer(), o.retDenom());}
	public Fraction (int n, int d) {
		
		this.setNumer(n);
		this.setDenom(d);
		gcd = calcGCD();
		decimal = (double)n/(double)d;
	}
	
	public void setNumer(int n) {numer = n;}
	public void setDenom(int d) {
		try {
		
			if (d==0) {
				throw new DenominatorIsZeroException("You cannot enter 0 in the "
				+"denominator!\nPlease enter a valid denominator:");
			} else {
				denom = d;
				System.out.println("The denominator has been set to: " +this.retDenom());
			}
		}
		catch (DenominatorIsZeroException e) {
		
			Scanner iStream = new Scanner(System.in);
			int newD = 0;
			
			System.out.println(e.getMessage());
			newD = iStream.nextInt();
			iStream.nextLine();
			
			this.setDenom(newD);
		}
	}
		
		
	
	public int retNumer () {return numer;}
	public int retDenom () {return denom;}
	public int retGCD () {return gcd;}
	public double retDecimal () {return decimal;}
	
	private int calcGCD () {
		
		int rem=1, var1=0, var2=0;
		
		var1 = (numer>denom)? numer : denom;
		var2 = (numer<denom)? numer : denom;
		
		do {
			rem = var1%var2;
			
			if (rem != 0) {
				var1 = var2;
				var2 = rem;
			}
		} while (rem != 0);
		
		return var2;
	}
	
	public void reduce () {
	
		gcd = calcGCD();
		numer /= gcd;
		denom /= gcd;
	}
	
	public String toString () {
		
		this.reduce();
		return ("" +numer+ "/" +denom);
	}
}
