/** Program: A5p4 - Blanks remover
	Author(s): Tom Stutler, Jack Stutler
	Last Date Modified: 12/10/15
*/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class A5p4 {
	
	private static Scanner iStream = new Scanner(System.in);
	private static Scanner input;
	private static PrintWriter output;
	private static File temp;
	private static String tempFile;
	private static String userFile;
	
	public static void main (String[] args) {
		
		System.out.println("Enter filename of file to remove blanks:");
		userFile = iStream.next();
		iStream.nextLine();
		
		System.out.println("\nText file " +userFile +"'s content before removing extra "
			+"blanks:\n");
		
		openInput(userFile);
		while (input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		input.close();
		
		removeBlanks();
		
		System.out.println("\nText file " +userFile +"'s content after removing extra "
			+"blanks:\n");
		openInput(userFile);
		while (input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		input.close();
	}
	
	private static void openInput (String s) {
		
		try {
			
			input = new Scanner(new FileInputStream(s));
		}
		catch (FileNotFoundException e) {
			
			System.out.println("Could not open or find file " +s);
			System.exit(0);
		}
	}
	
	private static void openOutput (String s) {
		
		try {
			
			output = new PrintWriter(new FileOutputStream(s));
		}
		catch (FileNotFoundException e) {
			
			System.out.println("Could not open or find file " +s);
			System.exit(0);
		}
	}
	
	private static String createTempFile (String s) {
	
		temp = new File(s);
		
		if (temp.exists()){
			s += "X";
			createTempFile(s);
		}
		return s;
	}
	
	private static void removeBlanks () {
		
		String current="";
		int wordCount=0;
		
		tempFile = createTempFile("Temp");
		
		openOutput(tempFile);
		openInput(userFile);
		while (input.hasNext()) {
			current = input.next();
			
			if (!Character.isLetter(current.charAt(current.length()-1))) {
				output.print(current +"\n");
			} else {
				output.print(current +" ");
			}
		}
		input.close();
		output.close();
		
		openInput(tempFile);
		openOutput(userFile);
		while (input.hasNextLine()) {
			current = input.nextLine();
			output.println(current);
		}
		input.close();
		output.close();
		
		temp.delete();
	}
}
