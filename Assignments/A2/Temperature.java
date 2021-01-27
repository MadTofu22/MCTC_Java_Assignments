/** Program: Tempurature- Object
	Author(s): Tom Stutler
	Last Date Modified: 9/17/15
*/

public class Temperature {

	private double deg;
	private char scale;
	
	public Temperature() {scale='C'; deg=0;}
	public Temperature(double num) {deg=num; scale='C';}
	public Temperature(char var) {scale=var; deg=0;}
	public Temperature(double num, char var) {deg=num; scale=var;}
	
	public double retDegC() {
		
		if(scale=='F') {
			
			return 5.0*(deg-32.0)/9.0;
		} else {
			
			return deg;
		}
	}
	
	public double retDegF() {
		
		if(scale=='C') {
			
			return (9.0*(deg)/5.0)+32.0;
		} else {
			
			return deg;
		}
	}
	
	public void setDeg(double num) {
		
		deg = num;
	}
	
	public void setScale(char var) {
	
		scale = var;
	}
	
	public void setTemp(double num, char var) {
		
		deg = num;
		scale = var;
	}
	
	public boolean equals (Temperature other) {
	
		if(this.scale==other.scale) {
			
			return this.deg==other.deg;
		} else {
			
			return (this.scale=='C')? this.deg==other.retDegC()
									: this.deg==other.retDegF();
		}
	}
	
	public boolean isLessThan(Temperature other) {
		
		if(this.scale==other.scale) {
			
			return this.deg<other.deg;
		} else {
			
			return (this.scale=='C')? this.deg<other.retDegC()
									: this.deg<other.retDegF();
		}
	}
	
	public boolean isGreaterThan(Temperature other) {
	
		if(this.scale==other.scale) {
			
			return this.deg==other.deg;
		} else {
			
			return (this.scale=='C')? this.deg>other.retDegC()
									: this.deg>other.retDegF();
		}
	}
	
	public String toString() {
	
		String s = "" + deg + scale;
		return s;
	}
}
