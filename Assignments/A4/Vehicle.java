/** Program: Vehicle - Object
	Author(s): Tom Stutler
	Last Date Modified: 10/31/15
*/

public class Vehicle {

	//Instance vars
	private String manuName;
	private int numOfCyls;
	private Person owner;
	
	//Constructors
	public Vehicle () {this("unknown", 0, new Person());}
	public Vehicle (String n, int c, Person o) {
		
		manuName = n;
		numOfCyls = c;
		owner = new Person(o);
	}
	public Vehicle (Vehicle other) {
		
		this(other.retManu(), other.retCyls(), other.retOwne());
	}
	
	//Accessors
	public String retManu () {return manuName;}
	public int retCyls () {return numOfCyls;}
	public Person retOwne () {return owner;}
	
	//Mutators
	public void setManu (String n) {manuName=n;}
	public void setCyls (int c) {numOfCyls=c;}
	public void setOwne (Person p) {owner=p;}
	
	public String toString () {
		
		return (manuName+ " (" +numOfCyls+ " cylinders) owned by " +owner);
	}
	
	public boolean equals (Object otherObj) {
		
		if (otherObj == null) {
			return false;
		} else if (getClass() != otherObj.getClass()) {
			return false;
		} else {
			Vehicle other = (Vehicle)otherObj;
			return (manuName.equals(other.retManu())
					&& numOfCyls==other.retCyls()
					&& owner.equals(other.retOwne()));
		}
	}
}
