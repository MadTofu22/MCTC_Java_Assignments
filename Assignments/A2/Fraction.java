/** Program: Object - Fraction
	Author(s): Tom Stutler
	Last Date Modified: 9/17/15
*/

public class Fraction {

	private int numer, denom, gcd;
	private double decimal;
	
	public Fraction() {
		
		numer = 0;
		denom = 0;
		gcd = 0;
		decimal = 0;
	}
	
	public Fraction (int num1, int num2) {
		
		numer = num1;
		denom = num2;
	}
	
	public void setNumer(int num) {
	
		numer = num;
	}
	
	public void setDenom(int num) {
	
		denom = num;
	}
	
	public int calcGCD () {
		
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
	
	public void reduce() {
	
		gcd = calcGCD();
		numer /= gcd;
		denom /= gcd;
	}
	
	public String retFraction() {
		
		return (numer + "/" + denom);
	}
	
	public double retDecimal() {
	
		return (double)numer/(double)denom;
	}
}
