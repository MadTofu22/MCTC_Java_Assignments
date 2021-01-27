/** Program: Date - Driver
	Author(s): Tom Stutler
	Last Date Modified: 9/18/15
*/

public class A2p8 {

	public static void main (String[] args) {
		
		Date d1 = new Date();
		System.out.println("Test the constructors:\n"
			+"Default constructor: " + d1.toString());
			
		Date d2 = new Date(4, 15, 2003);
		System.out.println("Constructor with integer month: "
			+d2.toString());
			
		Date d3 = new Date("April", 15, 2003);
		System.out.println("Constructio with String month: "
			+d3.toString());
			
		Date d4 = new Date(2002);
		System.out.println("Constructor with year only: "
			+d4.toString());
		
		Date d5 = new Date(d2);
		System.out.println("Copy constructor: " + d5.toString());
		
		Date d6 = new Date();
		d6.setDate(7, 4, 2000);
		System.out.println("\nTest the setter methods:\n"
			+"After setDate with int month: " + d6.toString());
		
		Date d7 = new Date();
		d7.setDate("September", 6, 2000);
		System.out.println("After setDate with String month: "
			+d7.toString());
			
		Date d8 = new Date();
		d8.setDate(1995);
		System.out.println("After setDate with year only: "
			+d8.toString());
			
		Date d9 = new Date();
		d9.setYear(1980);
		System.out.println("After setYear: " + d9.toString());
		d9.setMonth(8);
		System.out.println("After setMonth: " + d9.toString());
		d9.setDay(8);
		System.out.println("After setDay: " + d9.toString()
			+"\nMonth is: " + d9.getMonth()
			+"\nDay is: " + d9.getDay()
			+"\nYear is: " + d9.getYear());
		
		System.out.println("\nTest equals and precedes:\n"
			+d9.toString() + " = " + d9.toString() + "? "
			+d9.equals(d9));
		
		System.out.println(d9.toString() + " = " + d4.toString() + "? "
			+d9.equals(d4));
		
		System.out.println(d9.toString() + " precedes " + d9.toString()
			+"? " + d9.precedes(d9));
		
		System.out.println(d9.toString() + " precedes " + d4.toString()
			+"? " + d9.precedes(d4));
		
		System.out.println(d4.toString() + " precedes " + d9.toString()
			+"? " + d4.precedes(d9));
			
		System.out.println("\nTest input:");
		d1.readInput();
		System.out.println("You entered: " + d1.toString());
	}
}
