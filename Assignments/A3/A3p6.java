/** Program: Dice Rolling Sim
	Author(s): Tom Stutler
	Last Date Modified: 10/26/15
*/

import java.util.Scanner;

public class A3p6{
	
	private static final int MAX_ROLLS=100000;
	private static final int POSSIBLE_SUMS=13;
	
	public static void main (String[] args) {
		
		Scanner iStream = new Scanner(System.in);
		int[] die1 = new int[MAX_ROLLS];
		int[] die2 = new int[MAX_ROLLS];
		int[] sumRolls = new int[MAX_ROLLS];
		int[] sumCount = new int[POSSIBLE_SUMS];
		int qtyRolls=0;
		String repeat="";
		
		do {
			//Initialize arrays to 0
			for (int e : die1) {e=0;}
			for (int e : die2) {e=0;}
			for (int e : sumRolls) {e=0;}
			for (int e : sumCount) {e=0;}
	
			//Get number of tosses from user
			do {
				System.out.println("Enter number of tosses (1-100000): ");
				qtyRolls = iStream.nextInt();
				iStream.nextLine();
			} while (qtyRolls<1 || qtyRolls>100000);
		
			//Simulate dice rolls
			rollDie(die1, qtyRolls);
			rollDie(die2, qtyRolls);
		
			//Calculate the sums of the two dice
			findSum(die1, die2, sumRolls, qtyRolls);
		
			//Tally counts of each sum
			tossCount(sumRolls, sumCount, qtyRolls);
		
			//Display the results
			display(sumCount, qtyRolls);
			
			do {
				System.out.println("Do another simulation? (yes or no): ");
				repeat = iStream.next();
			} while (!repeat.equalsIgnoreCase("yes")
					&& !repeat.equalsIgnoreCase("no"));
		} while (repeat.equalsIgnoreCase("yes"));
	}
	
	public static void rollDie (int[] d, int used) {
		
		for (int i=0; i<used; i++) {
			d[i] = (int)(Math.random()*6+1);
		}
	}
	
	public static void findSum (int[] d1, int[] d2, int[] sums, int used) {
		
		for (int i=0; i<used; i++) {
			sums[i] = d1[i]+d2[i];
		}
	}
	
	public static void tossCount (int[] sums, int[] counts, int used) {
		
		for (int i=0; i<used; i++) {
			counts[sums[i]]++;
		}
	}
	
	public static void display (int[] counts, int used) {
		
		double prob=0;
		
		System.out.println("Total number of tosses = " +used
			+"\n\tToss\tCount\tProbability");
		
		for (int i=2; i<POSSIBLE_SUMS; i++) {
			prob = ((double)counts[i]/(double)used)*100;
			System.out.println("\t" +i+ "\t" +counts[i]+ "\t" +prob);
		}
	}
}
