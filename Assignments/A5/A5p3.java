/** Program: A5p3 - Text Sorter Script
	Author(s): Tom Stutler
	Last Date Modified: 12/6/15
*/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class A5p3 {
	
	private static Scanner iStream = new Scanner(System.in);
	private static Scanner input;
	private static PrintWriter output;
	private static String[] wordsList;
	private static String inFile;
	private static String outFile;
	private static int wordCount;
	private static int punctCount;
	private static int letterCount;
	private static int shortLen;
	private static int longLen;
	private static double avgLen;
	
	public static void main (String[] args) {
		
		int sel=0;
		boolean repeat;
		
		try {
			System.out.println("\nEnter output file name:");
			outFile = iStream.next();
			iStream.nextLine();
			System.out.println("Filename entered: " +outFile);
			
			output = new PrintWriter(new FileOutputStream(outFile));
		
			System.out.println("\nEnter input file name:");
			inFile = iStream.next();
			iStream.nextLine();
			System.out.println("Filename entered: " +inFile);
			
			do {
				sel = menu();
			
				switch (sel) {
			
					case 1:
						analyzeFile();
						repeat = true;
						break;
					
					case 2:
						listShort();
						repeat = true;
						break;
					
					case 3:
						listLong();
						repeat = true;
						break;
					
					case 4:
						searchForWord();
						repeat = true;
						break;
					
					case 5:
						System.out.println("Thank you come again!\n\n");
						repeat = false;
						break;
			
					default:
						System.out.println("Enter a valid selection!\n\n");
						repeat = true;
						break;
				}
			} while (repeat);
		}
		catch (InputMismatchException e) {
			
			System.out.println("Invalid entry! \nClosing program...\n\n");
			System.exit(0);
		}
		catch (FileNotFoundException e) {
			
			System.out.println("File " +outFile +" was not found.");
			System.exit(0);
		}
	}
	
	private static int menu () {
		
		int n=0;
		
		System.out.println("\n\nSelect an option:"
			+"\n\t1 - Determine word statistics"
			+"\n\t2 - List shortest words"
			+"\n\t3 - List longest words"
			+"\n\t4 - Search for a word"
			+"\n\t5 - Exit");
		
		n = iStream.nextInt();
		iStream.nextLine();
		
		return n;
	}
	
	private static void openFile () {
		
		try {
			input = new Scanner(new FileInputStream(inFile));
		}
		catch (FileNotFoundException e) {
			
			System.out.println("File " +inFile +" was not found or could not be opened.");
			System.exit(0);
		}
	}
	
	private static void analyzeFile () {
		
		int count=0;
		String current="", temp="";
		
		punctCount = 0;
		letterCount = 0;
		wordCount = 0;
		
		openFile();
		while (input.hasNext()) {
			wordCount++;
			input.next();
		}
		input.close();
		wordsList = new String[wordCount];
		
		openFile();
		
		current = input.next();
		shortLen = current.length();
		longLen = current.length();
		
		while (count<wordCount) {
			
			temp = "";
			
			if (current.equals("\n")) {
			} else {
				if (!Character.isLetter(current.charAt(0))
				&& !Character.isLetter(current.charAt(current.length()-1))) {
				
					temp = current.substring(1, (current.length()-1));
					punctCount += 2;
				
				} else if (!Character.isLetter(current.charAt(0))
				&& Character.isLetter(current.charAt(current.length()-1))) {
				
					temp = current.substring(1);
					punctCount += 1;
				
				} else if (Character.isLetter(current.charAt(0))
				&& !Character.isLetter(current.charAt(current.length()-1))) {
				
					temp = current.substring(0, (current.length()-1));
					punctCount += 1;
				
				} else {
				
					temp = current;
				}
			
				letterCount += temp.length();
			
				shortLen = (shortLen<temp.length()) ? shortLen : temp.length();
				longLen = (longLen>temp.length()) ? longLen : temp.length();
			
				wordsList[count] = temp;
				count++;
			}
			
			if (input.hasNext()) {
				current = input.next();
			}
		}
		
		System.out.println("\n\n\n");
			for (int i=0; i<wordCount; i++) {
				System.out.println(wordsList[i]);
			}
			System.out.println("\n\n\n");
		input.close();
		
		avgLen = (double)letterCount/(double)wordCount;
		
		System.out.println("Total number of words = " +wordCount
			+"\nAverage word length = " +avgLen +" characters"
			+"\nTotal number of word characters = " +letterCount
			+"\nTotal number of punctuation characters = " +punctCount
			+"\nShortest word length = " +shortLen
			+"\nLongest word length = " +longLen
			+"\n\n\n");
			
		output.println("Total number of words = " +wordCount
			+"\nAverage word length = " +avgLen +" characters"
			+"\nTotal number of word characters = " +letterCount
			+"\nTotal number of punctuation characters = " +punctCount
			+"\nShortest word length = " +shortLen
			+"\nLongest word length = " +longLen
			+"\n\n\n");
	}
	
	private static void listShort () {
		
		System.out.println("\nShortest words in file:");
		output.println("\nShortest words in fie:");
		
		for (int i=0; i<wordCount; i++) {
			if (wordsList[i].length() == shortLen) {
				System.out.println(wordsList[i]);
				output.println(wordsList[i]);
			}
		}
	}
	
	private static void listLong () {
		
		System.out.println("\nLongest words in file:");
		output.println("\nLongest words in file:");
		
		for (int i=0; i<wordCount; i++) {
			if (wordsList[i].length() == longLen) {
				System.out.println(wordsList[i]);
				output.println(wordsList[i]);
			}
		}
	}
	
	private static void searchForWord () throws InputMismatchException {
		
		int count=0;
		String searchWord="";
		
		System.out.println("Enter word to find in file:");
		searchWord = iStream.next();
		iStream.nextLine();
		
		System.out.println("\nSearch word: " +searchWord);
		output.println("\nSearch word: " +searchWord);
		
		for (int i=0; i<wordCount; i++) {
			if (wordsList[i].equalsIgnoreCase(searchWord)) {
				count++;
			}
		}
		
		System.out.println("This word appears " +count +" time(s) in the file.");
		output.println("This word appears " +count +" time(s) in the file.");
	}
}
