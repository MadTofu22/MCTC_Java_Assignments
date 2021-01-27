/** Program: Tempurature class test program
	Author(s): Tom Stutler
	Last Date Modified: 9/17/15
*/

public class A2p7 {

	public static void main(String[] args) {
	
		System.out.println("Test Constructors:\n"
			+ "Create an object freezingC using construcor Temperature(double,"
			+ " char):");
		Temperature freezingC = new Temperature(0.0, 'C');
		System.out.println("The values in freezingC: " + freezingC.toString());
		
		System.out.println("Create an object freezingF using constructor "
			+ "Temperature(double, char):");
		Temperature freezingF = new Temperature(32.0, 'F');
		System.out.println("The values in freezingF: " + freezingF.toString());
		
		System.out.println("Create an object coldC using constructor "
			+ "Temperature():");
		Temperature coldC = new Temperature();
		coldC.setDeg(-40.0);
		System.out.println("Create an object coldF using constructor "
			+ "Temperature():");
		Temperature coldF = new Temperature();
		coldF.setTemp(-40.0, 'F');
		System.out.printf("The values in coldC and coldF: %s (%s)%n"
			, coldC.toString(), coldF.toString());
		
		System.out.println("Create an object boilingF using constructor "
			+ "Temperature(char):");
		Temperature boilingF = new Temperature('F');
		boilingF.setDeg(212.0);
		
		System.out.println("Create an object boilingC using constructor "
			+ "Temperature(double):");
		Temperature boilingC = new Temperature(100.0);
		
		System.out.printf("The values in boilingF and boilingC: %s (%s)%n"
			, boilingF.toString(), boilingC.toString());
		
		System.out.println("\nTest equals method:\n"
			+ "Is boilingF equal to boilingF?\n"
			+ boilingF.toString() + " = " + boilingF.toString() + " ? "
			+ boilingF.equals(boilingF));
			
		System.out.println("Is freezingC equal to freezingF?\n"
			+ freezingC.toString() + " = " + freezingF.toString() + " ? "
			+ freezingC.equals(freezingF));
			
		System.out.println("Is boilingF equal to boilingC?\n"
			+ boilingF.toString() + " = " + boilingC.toString() + " ? "
			+ boilingF.equals(boilingC));
			
		System.out.println("Is boilingC equal to boilingF?\n"
			+ boilingC.toString() + " = " + boilingF.toString() + " ? "
			+ boilingC.equals(boilingF));
			
		System.out.println("Is coldC equal to coldF?\n"
			+ coldC.toString() + " = " + coldF.toString() + " ? "
			+ coldC.equals(coldF));
			
		System.out.println("\nTest isGreatherThan and isLessThan methods:\n"
			+ "Is coldC < boilingC?\n" + coldC.toString() + " < "
			+ boilingC.toString() + " ? " + coldC.isLessThan(boilingC));
			
		System.out.println("Is coldC > boilingC?\n" + coldC.toString() + " > "
			+ boilingC.toString() + " ? " + coldC.isGreaterThan(boilingC));
			
		System.out.println("Is coldC < freezingF?\n" + coldC.toString() + " < "
			+ freezingF.toString() + " ? " + coldC.isLessThan(freezingF));
			
		System.out.println("Is coldC > freezingF?\n" + coldC.toString() + " > "
			+ freezingF.toString() + " ? " + coldC.isGreaterThan(freezingF));
	}
}
