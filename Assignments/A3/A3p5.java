/** Program: Standard Deviation
	Author(s): Tom Stutler
	Last Date Modified: 10/26/15
*/

import java.util.Scanner;

public class A3p5{

	public static void main (String[] args) {
		
		double[] a1 = new double[5];
		for (int i=0; i<4; i++) {
			a1[i] = 2.0;
		}
		System.out.println("The standard deviation of {"+a1[0]+","+a1[1]+","
			+a1[2]+","+a1[3]+"} = " +calcDeviation(a1, 4));
			
		double[] a2 = new double[5];
		for (int i=0; i<3; i++) {
			a2[i] = 2.0;
		}
		a2[3] = 4.0;
		System.out.println("The standard deviation of {"+a2[0]+","+a2[1]+","
			+a2[2]+","+a2[3]+"} = " +calcDeviation(a2, 4));
			
		double[] a3 = new double[5];
		for (int i=0; i<3; i++) {
			a1[i] = 2.0;
		}
		System.out.println("The standard deviation of {"+a3[0]+","+a3[1]+","
			+a3[2]+"} = " +calcDeviation(a3, 3));
			
		double[] a4 = new double[5];
		a4[0]=2.0; a4[1]=0.0; a4[2]=2.0; a4[3]=4.0;
		System.out.println("The standard deviation of {"+a4[0]+","+a4[1]+","
			+a4[2]+","+a4[3]+"} = " +calcDeviation(a4, 4));
		
		double[] a5 = new double[5];
		a5[0]=2.0; a5[1]=0.0; a5[2]=2.0;
		System.out.println("The standard deviation of {"+a5[0]+","+a5[1]+","
			+a5[2]+","+a5[3]+"} = " +calcDeviation(a5, 3));
	}
	
	public static double calcDeviation(double[] array, int used) {
		
		double avg=0, sum=0, sumDev=0, standDev=0;
		
		//Calculate the average of the 
		for (int i=0; i<used; i++) {
			sum += array[i];
		}
		avg = sum/used;
		
		//Calculate the standard deviation
		for (int i=0; i<used; i++) {
			sumDev += Math.pow((array[i]-avg), 2);
		}
		
		return Math.sqrt(sumDev/used);
	}
}
