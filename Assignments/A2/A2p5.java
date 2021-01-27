/** Program: Raffle Simulator
	Author(s): Tom Stutler
	Last Date Modified: 9/10/15
*/

import java.util.Scanner;
import java.util.Random;

public class A2p5 {

	public static void main (String[] args) {
		
		Scanner iStream = new Scanner(System.in);
		Random randGen = new Random();
		int maxNum=30, numWins=3, win1=0, win2=0, win3=0;
		boolean repeat=false;
		String cont="";
		
		//Start program
		System.out.println("This program pick three numbers at random "
				+ "from the 30 finalist. Keep picking if any two numbers "
				+ "are the same.");
				
		do {
			
			//Pick winners and display them
			do {
				
				win1 = randGen.nextInt(maxNum)+1;
				win2 = randGen.nextInt(maxNum)+1;
				win3 = randGen.nextInt(maxNum)+1;
				
			} while (win1==win2 || win2==win3 || win1==win3);
			
			//Output winners
			System.out.printf("%d,%d,%d%n", win1, win2, win3);
			
			//Prompt user to repeat
			do {
			
				System.out.println("Continue (y or n):");
				cont = iStream.next();
				iStream.nextLine();
				cont = cont.toUpperCase();

			} while (!cont.equals("Y") && !cont.equals("N"));
			
			repeat = cont.equals("Y");
			
		} while (repeat);
	}
}
