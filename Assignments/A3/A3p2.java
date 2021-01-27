/** Program: Complex - Tester
	Author(s): Tom Stutler
	Last Date Modified: 10/27/15
*/

public class A3p2{

	public static void main (String[] args) {
		
		//Constructor tests
		Complex1 var1 = Complex1.userSet();
		System.out.println("var1 is: " +var1);
		Complex1 var2 = Complex1.userSet();
		System.out.println("var2 is: " +var2);
		Complex1 var3 = Complex1.userSet();
		System.out.println("var3 is: " +var3);
		
		//Setter and getter tests
		System.out.println("var1's real part is: " +var1.getReal()
			+"\nvar1's imaginary part is: " +var1.getImag()
			+"\nChanging var1's real part.");
		var1.setReal(3.0);
		System.out.println("var1 is: " +var1
			+"\nChanging var1's imaginary part.");
		var1.setImag(4.0);
		System.out.println("var1 is: " +var1);
		
		//Bool tests
		Complex1 var4 = new Complex1(var2);
		System.out.println("var1 equal to var2? " +var1.equals(var2)
			+"\nTest copy constructor: a copy of var2 is equal to var2? "
			+var4.equals(var2));
		
		//Math function tests	
		Complex1 var5 = Complex1.add(var3, var1);
		System.out.println("Adding " +var3+ " and " +var1+ ": " +var5);
		Complex1 var6 = Complex1.sub(var1, var3);
		System.out.println("Subtract " +var1+ " and " +var3+ ": " +var6);
		Complex1 var7 = Complex1.mult(var3, var1);
		System.out.println("Multiply " +var3+ " and " +var1+ ": " +var7);
		
		//Overload tests
		Complex1 var8 = var3.add(var1);
		System.out.println("Overload - Adding " +var3+ " and " +var1+ ": "
			+var8);
		Complex1 var9 = var1.sub(var3);
		System.out.println("Overload - Subtract " +var1+ " and " +var3+ ": "
			+var9);
		Complex1 var10 = var3.mult(var1);
		System.out.println("Overload - Multiply " +var3+ " and " +var1+ ": "
			+var10);
			
		//Overload alt part 2 tests, 
		Complex2 c1 = new Complex2(1.0,4.0);
		Complex2 c2 = new Complex2(3.0, 4.0);
		System.out.print("Alernate overload - Adding " +c1+ " and " +c2+ ": ");
		c1.add(c2);
		System.out.println(c1);
		c1.setReal(1.0);
		c1.setImag(4.0);
		System.out.print("Alternate overload - Subtract " +c2+ " and " +c1
			+": ");
		c2.sub(c1);
		System.out.println(c2);
		c2.setReal(3.0);
		c2.setImag(4.0);
		System.out.print("Alternate overload - Multiply " +c1+ " and " +c2
			+": ");
		c1.mult(c2);
		System.out.println(c1);
	}
}
