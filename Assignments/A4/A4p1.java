/** Program: Problem 1 - Driver
	Author(s): Tom Stutler
	Last Date Modified: 11/5/15
*/

public class A4p1 {

	public static void main (String[] args) {
		
		Person p1 = new Person("John Doe");
		Person p2 = new Person("Joe Smith");
		Person p3 = new Person("Jane Doe");
		
		Vehicle v1 = new Vehicle();//Geo
		Vehicle v2 = new Vehicle("Jaguar", 12, p1);//jaguar
		Vehicle v3 = new Vehicle(v2);//other jaguar
		
		System.out.println("\nTest the Vehicle constructors:\n"
			+"\nNo arg constructor: " +v1
			+"\nThree arg constructor: " +v2
			+"\nCopy constructor: " +v3);
		
		System.out.println("\nTest the equality methods:\n"
			+"\njaguar == otherJaguar ? " +(v2==v3)
			+"\njaguar.equals(otherJaguar) ? " +v2.equals(v3)
			+"\notherJaguar.equals(jaguar) ? " +v3.equals(v2)
			+"\njaguar.equals(null) ? " + v2.equals(null)
			+"\njaguar.equals(geo) ? " + v2.equals(v1)
			+"\njaguar.equals(\"jaguar\") ? " +v2.equals("jaguar"));
		
		v1.setManu("Geo");
		v1.setCyls(2);
		v1.setOwne(p2);
		
		System.out.println("\nTest the getter and setter methods:\n"
			+"\nAfter setters: " +v1
			+"\nGeo's manufacturer: " +v1.retManu()
			+"\nNumber of cylinders in a Geo: " +v1.retCyls()
			+"\nGeo's owner: " +v1.retOwne());
		
		v3.setOwne(p3);
		
		System.out.println("\nTry changing an owner name:\n"
			+"\nAfter changing otherJaguar's owner name:"
			+"\njaguar: " +v2
			+"\notherJaguar: " +v3
			+"\notherJaguar.equals(jaguar): " +v3.equals(v2));
		
		Truck t1 = new Truck();
		Truck t2 = new Truck("Ford", 8, p1, 0.5, 2);
		Truck t3 = new Truck(t2);
		Vehicle v4 = new Vehicle("Ford", 8, p1);
		
		System.out.println("\nTest Trucks:\n"
			+"\nNo arg constructor: " +t1
			+"\nFive-arg constructor: " +t2
			+"\nCreate a Vehicle vFord with Manufacturer: \"Ford\", "
			+"number of cylinders: 8, Owner: John Doe"
			+"\nVehicle vFord: " +v4);
		
		System.out.println("\nTest equality:\n"
			+"\nford.equals(chevy) ? " +t2.equals(t1)
			+"\nford.equals(otherFord) ? " +t2.equals(t3)
			+"\nvFord.equals(ford) ? " +t2.equals(v4)
			+"\nford.equals(vFord) ? " +v4.equals(t2)
			+"\nford.equals(null) ? " +t2.equals(null));
		
		t1.setManu("Chevy");
		t1.setCyls(6);
		t1.setTow(2);
		t1.setLoad(0.75);
		
		System.out.println("\nTest getters and setter:\n"
			+"\nAfter setting fields, chevy: " +t1
			+"\nChevy's towing capacity: " +t1.retTow()
			+"\nChevy's load capacity: " +t1.retLoad());
	}
}
