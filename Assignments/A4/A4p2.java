/** Program: Pairs - Driver
	Author(s): Tom Stutler
	Last Date Modified: 11/15/15
*/

import java.util.Scanner;

public class A4p2 {
	
	private static final int MAX = 26;
	private static Scanner iStream = new Scanner(System.in);
	private static boolean cORv; //true for complex; false for vector
	//private static String oper="";
	private static int index=0;
	private static int sel=0;	
	
	public static void main (String[] args) {
		
		do {
			System.out.println("Select an option:"
				+"\n\t(1) perform complex number actions"
				+"\n\t(2) perform vector actions"
				+"\n\t(3) exit");
			sel = iStream.nextInt();
			iStream.nextLine();
			
			switch (sel) {
				
			case 1:	
				cactions();
				cORv = true;
				break;

			case 2:
				vactions();
				cORv = false;
				break;
				
			case 3:
				System.out.println("Bye...");
				break;

			default:
				System.out.println("Invalid input - try again.");
				break;
			}				
		} while (sel!=3);
	}
	
	public static void cactions () {
	
		Complex[] cArray = new Complex[MAX];
		int c1=0, c2=0, c3=0;
		double real=0, imag=0;
		String oper="";
		
		
		for (Complex e : cArray) {
			e = new Complex();
		}
		
		do {
			System.out.println("Select an option:"
				+"\n\t\t(1) Enter a complex number"
				+"\n\t\t(2) Display a complex number"
				+"\n\t\t(3) Perform arithmetic or equality check"
				+"\n\t\t(4) Exit");
			sel = iStream.nextInt();
			iStream.nextLine();
		
			switch (sel) {
		
				case 1:	
					System.out.println("Enter real:");
					real = iStream.nextDouble();
					iStream.nextLine();
					System.out.println("Enter imaginary:");
					imag = iStream.nextDouble();
					iStream.nextLine();
					System.out.println("Where do you want to store this (1-26):");
					index = getIndex();
					cArray[index] = new Complex(real, imag);
					break;
		
				case 2:	
					System.out.println("Which one do you want to display (1-26)");
					index = getIndex();
					System.out.println("\t" +cArray[index]);
					break;
					
				case 3: 
					oper = getOper(cORv);
					System.out.println("Enter first number (1-26):");
					c1 = getIndex();
					System.out.println("Enter second number (1-26):");
					c2 = getIndex();
				
					if (oper.equals("=")) {
						if (cArray[c1].equals(cArray[c2])) {
							System.out.println("\t" +cArray[c1]+ " does equal "
								+cArray[c2]);
						} else {
							System.out.println("\t" +cArray[c1]+ " does not equal "
								+cArray[c2]);
						}
					} else {
						System.out.println("Enter result location (1-26):");
						c3 = getIndex();
						cArray[c3] = calcComplex(cArray[c1], cArray[c2], oper);
					}
					break;
		
				case 4:	
					System.out.println("Returning to main menu...");
					break;
					
				default:
					System.out.println("Invalid input - try again.");
					break;
			}
		} while (sel!=4);
	}
	
	public static void vactions () {
		
		Vector[] vArray = new Vector[MAX];
		int v1=0, v2=0, v3=0;
		double i=0, j=0, scalar=0;
		String oper="";
		
		for (Vector e : vArray) {
			e = new Vector();
		}
		
		do {
			System.out.println("Select an option:"
				+"\n\t(1) Enter a vector"
				+"\n\t(2) Display a vector"
				+"\n\t(3) Display scalar"
				+"\n\t(4) Perform arithmetic or equality check"
				+"\n\t(5) Exit");
			sel = iStream.nextInt();
			iStream.nextLine();
		
			switch (sel) {
			
				case 1:
					System.out.println("Enter first number:");
					i = iStream.nextDouble();
					iStream.nextLine();
					System.out.println("Enter second number:");
					j = iStream.nextDouble();
					iStream.nextLine();
					System.out.println("Where do you want to store this (1-26):");
					index = iStream.nextInt();
					iStream.nextLine();
					vArray[index] = new Vector(i, j);
					break;
			
				case 2:
					System.out.println("Which one do you want to display (1-26):");
					index = iStream.nextInt();
					iStream.nextLine();
					System.out.println("\t" +vArray[index]);
					break;
				
				case 3:
					System.out.println("\tScalar = " +scalar);
					break;
				
				case 4:
					oper = getOper(cORv);
					System.out.println("Enter first number (1-26):");
					v1 = getIndex();
					
					if (oper.equals("*")) {
						System.out.println("Enter scalar to multiply:");
						scalar = iStream.nextDouble();
						iStream.nextLine();
					} else {
						System.out.println("Enter second number (1-26):");
						v2 = getIndex();
					}
					if (oper.equals("=")) {
						if (vArray[v1].equals(vArray[v2])) {
							System.out.println("\t" +vArray[v1]+ "does equal "
								+vArray[v2]);
						} else {
							System.out.println("\t" +vArray[v1]+
								" does not equal " +vArray[v2]);
						}	
					} else if (oper.equals(".")) {
						scalar = vArray[v1].mult(vArray[v2]);
					} else {
						System.out.println("Enter result location (1-26):");
						v3 = getIndex();
						vArray[v3] = calcVector(vArray[v1], vArray[v2], scalar, oper);
					}
					break;
					
				case 5:
					System.out.println("Returning to main menu...");
					break;
				
				default:
					System.out.println("Invalid input - try again.");
					break;
			}
		} while (sel!=5);
	}
	
	public static String getOper (boolean d) {
		
		String s="";
		if(d) {	
			System.out.println("Enter an operation:\t+\t-\t*\t/\t=");
		} else {
			System.out.println("Enter an operation:\t+\t-\t. (dot prod)\t* (scalar)\t=");
		}
		s = iStream.next();
		iStream.nextLine();
		return s;
	}
	
	public static int getIndex () {
		int n=0;
		
		do {
			n = iStream.nextInt();
			if (n<1 && n>26) {
				System.out.println("Invalid - try again!");
			}
		} while (n<1 && n>26);
		
		return (n-1);
	}
	
	public static Complex calcComplex (Complex n, Complex m, String o) {
	
		Complex temp = new Complex();
		switch (o) {
			
			case "+":
				temp = new Complex(n.add(m));
				break;
			
			case "-":
				temp = new Complex(n.sub(m));
				break;

			case "*":
				temp = new Complex(n.mult(m));
				break;
			
			case "/":
				temp = new Complex(n.div(m));
				break;
			
			default:
				System.out.println("Invalid input - try again.");
				break;
			}
			return new Complex(temp);
	}
	
	public static Vector calcVector (Vector n, Vector m, double s, String o) {
		
		Vector temp;
		switch (o) {
			
			case "+":
				temp = new Vector(n.add(m));
				break;
			
			case "-":
				temp = new Vector(n.sub(m));
				break;
			
			case "*":
				temp = new Vector(n.mult(s));
				break;
			
			default:
				System.out.println("Invalid input - try again.");
				temp = new Vector();
				break;
		}
		return new Vector(temp);
	}
}
