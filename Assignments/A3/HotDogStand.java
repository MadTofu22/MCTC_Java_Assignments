/** Program: HotDog Stand - Object
	Author(s): Tom Stutler
	Last Date Modified: 10/8/15
*/

public class HotDogStand {

	private int id;
	private int numSold;
	private static int totalSold=0;
	
	//Constructors
	public HotDogStand() {id=0; numSold=0;}
	public HotDogStand(int num) {id=num; numSold=0;}
	public HotDogStand(int num1, int num2) {id=num1; numSold=num2;}
	
	//Accessors
	public int getID() {return id;}
	public int getSold() {return numSold;}
	public static int getTotal() {return totalSold;}
	
	//Mutators
	public void setID(int num) {id=num;}
	public void setSold(int num) {numSold=num;}
	public void justSold() {numSold++; upTotal();}
	public static void upTotal() {totalSold++;}
	
	//equals() and toString()
	public boolean equals(HotDogStand other) {
		if (this.id==other.id) {
			return this.numSold==other.numSold;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return ("ID: " +id+ " numberSold: " +numSold);
	}
}
