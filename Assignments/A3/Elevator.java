/** Program: Elevator Object
	Author(s): Tom Stutler
	Last Date Modified: 10/27/15
*/

public class Elevator {

	private int position=1;
	
	public Elevator () {position=1;}
	public Elevator (int num) {position=num;}
	
	public int getPosition() {return position;}
	
	public void serviceRequest(int destination) {
		 
		if (position<destination) {
			
			System.out.println("Starting at floor " +position);
			
			for (;position<destination; ++position) {
				System.out.println("Going up - now at floor " +position);
			}
			System.out.println("Stopping at floor " +position);
		} else if (position>destination) {
			
			System.out.println("Starting at floor " +position);
			
			for (;position>destination; --position) {
				System.out.println("Going down - now at floor " +position);
			}
			System.out.println("Stopping at floor " +position);
		} else {
		
			System.out.println("The elevator is alread on that floor.");
		}
	}
}
