/** Program: Person - Object
	Author(s): Tom Stutler, Textbook
	Last Date Modified: 10/31/15
*/

public class Person {

	//Instance vars
	private String name;
	
	//Constructors
	public Person () {this("nobody");}
	public Person (String theName) {
		
		name = theName;
	}
	public Person (Person theObject) {
		
		this(theObject.getName());
	}
	
	//Accessors
	public String getName () {return name;}
	
	//Mutators
	public void setName (String theName) {name=theName;}
	
	public String toString () {
	
		return name;
	}
	
	public boolean equals (Object other) {
	
		if (other == null) {
			return false;
		} else if (getClass() != other.getClass()) {
			return false;
		} else {
			Person p = (Person)other;
			return name.equals(p.getName());
		}
	}
}
