/** Program: Elevator Simulator
	Author(s): Tom Stutler
	Last Date Modified: 10/27/15
*/

import java.util.Scanner;

public class A3p7 {

	private static final int NUM_OF_ELEVATORS=3;
	
	public static void main (String[] args) {
		
		Scanner iStream = new Scanner(System.in);
		Elevator[] lifts = new Elevator[NUM_OF_ELEVATORS];
		int floor=0, choice=0;
		
		do {
			//Initialize array
			for (int i=0; i<lifts.length; i++) {
				lifts[i] = new Elevator();
			}
			
			//Get selection from user
			System.out.println("Which elevator do you want (1=A, 2=B, 3=C, or"
				+" other to exit)?");
			choice = iStream.nextInt();
			iStream.nextLine();
			
			//Continue if user selected an elevator else end program
			if (choice>0 && 4>choice) {
				//Check if the elevator is at floor 1, if not move to floor 1
				if (lifts[choice-1].getPosition()!=1) {
					lifts[choice-1].serviceRequest(1);
				}
				
				//Prompt user for a destination floor
				System.out.println("Which floor do you want (1-10)?");
				floor = iStream.nextInt();
				iStream.nextLine();
				
				//Service the request if floor selection is valid
				do {
					lifts[choice-1].serviceRequest(floor);
				} while (floor<0 || floor>11);
			}
		} while (choice>0 && 4>choice);
	}
	
	public static void displayElevators (Elevator[] a) {

		System.out.println("Elevator Status\n"
			+"A\tB\tC");
		
		for (int i=0; i<NUM_OF_ELEVATORS; i++) {
			System.out.print(a[i].getPosition() +"\t");
		}
		System.out.println();
	}
}
