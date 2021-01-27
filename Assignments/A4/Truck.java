/** Program: Truck - Object
	Author(s): Tom Stutler
	Last Date Modified: 11/5/15
*/

public class Truck extends Vehicle {
	
	//Instance vars
	private double loadCap; //tons
	private int towCap; //pounds
	
	//Constructors
	public Truck () {this(0.0, 0);}
	public Truck (double l, int t) {
		
		super();
		loadCap = l;
		towCap = t;
	} 
	public Truck (String n, int c, Person o, double l, int t) {
		
		super(n, c, o);
		loadCap = l;
		towCap = t;
	}
	public Truck (Truck o) {
		
		this(o.retManu(), o.retCyls(), o.retOwne(), o.retLoad(), o.retTow());
	}
	
	//Acessors
	public double retLoad () {return loadCap;}
	public int retTow () {return towCap;}
	
	//Mutators
	public void setLoad (double l) {loadCap=l;}
	public void setTow (int t) {towCap=t;}
	
	public String toString () {
		
		return (retManu()+ " (" +retCyls()+ " cylinders, " +loadCap+ " ton load "
			+towCap+ " ton towing capacity) owned by " +retOwne());
	}
	
	public boolean equals (Object otherObj) {
		
		if (otherObj == null) {
			return false;
		} else if (getClass() != otherObj.getClass()) {
			return false;
		} else {
			Truck other = (Truck)otherObj;
			return (retManu().equals(other.retManu())
					&& retCyls()==other.retCyls()
					&& retOwne().equals(other.retOwne())
					&& loadCap==other.loadCap
					&& towCap==other.towCap);
		}
	}
}
