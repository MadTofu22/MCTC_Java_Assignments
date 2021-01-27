/**
Assignment 5 Problem 3, Text File Anaylsis
Author: Jack Stutler
Last date modified: 12/4/15
*/
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A5p3{
	private static PrintWriter outputStream = null;
	private static Scanner inputStream = null;
	private static String[] wordArry;
	private static String fileNameOut, fileNameIn;
	private static int menuOpt, totPunctCh, totWordCh, sWordLen, lWordLen, numWords;
	private static double avgWordLen;
	private static boolean loop = true;
	
	public static void main(String[] args){
		getFileNameIn();
		openFileOut();
		wordStats();
		do{
			menuDisp();
		}while (checkOpt());
		inputStream.close();
	}
	
	private static void menuDisp(){
		Scanner istream = new Scanner(System.in);
		
		while (loop){
			try{
				System.out.println("\n1 - Determine word statistics"
						+"\n2 - List shortest words"
						+"\n3 - List longest words"
						+"\n4 - Search for a word"
						+"\n5 - Exit");
				menuOpt = istream.nextInt();
				switch (menuOpt){
					case 1:
						printStats();
						break;
					case 2:
						printShortestWords();
						break;
					case 3:
						printLongestWords();
						break;
					case 4:
						searchForWord();
						break;
					case 5:
						loop = false;
						break;
					default:
						throw new InputMismatchException("Please select 1, 2, 3, 4, or 5 to exit.");
				}
			}
			catch (InputMismatchException e){
				istream.nextLine();
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static void searchForWord(){
		Scanner istream = new Scanner(System.in);
		int findCount=0;
		
		outputStream.println("\nEnter word to find in file: ");
		System.out.println("\nEnter word to find in file: ");
		String findWord = istream.nextLine();
		System.out.println("\nSearch word: "+findWord);
		outputStream.println("\nSearch word: "+findWord);
		
		for (int i=0; i<wordArry.length; i++){
			if (findWord.equalsIgnoreCase(wordArry[i])){
				findCount++;
			}
		}
		
		System.out.println("\nThis word appears "+findCount+" time(s) in the file.");
		outputStream.println("\nThis word appears "+findCount+" time(s) in the file.");
	}
	
	private static void printLongestWords(){
		System.out.println("\nFilename: "+fileNameIn);
		outputStream.println("\nFilename: "+fileNameIn);
		for (int i=0; i<numWords; i++){
			if (wordArry[i].length()==lWordLen){
				System.out.println();
				System.out.println(wordArry[i]);
				outputStream.println();
				outputStream.println(wordArry[i]);
			}
		}
	}
	
	private static void printShortestWords(){
		System.out.println("\nFilename: "+fileNameIn);
		outputStream.println("\nFilename: "+fileNameIn);
		for (int i=0; i<numWords; i++){
			if (wordArry[i].length()==sWordLen){
				System.out.println();
				outputStream.println();
				System.out.println(wordArry[i]);
				outputStream.println(wordArry[i]);
			}
		}
	}
	
	private static void printStats(){
		System.out.println("\nFilename: "+fileNameIn
				+"\nTotal Number of words = "+numWords
				+"\nAverage word length = "+avgWordLen
				+"\nTotal number of word characters = "+totWordCh
				+"\nTotal number of punctuation characters = "+totPunctCh
				+"\nShortest word length = "+sWordLen
				+"\nLongest word length = "+lWordLen);
		outputStream.println("\nFilename: "+fileNameIn
				+"\nTotal number of words = "+numWords
				+"\nAverage word length = "+avgWordLen
				+"\nTotal number of word characters = "+totWordCh
				+"\nTotal number of punctuation characters = "+totPunctCh
				+"\nShortest word length = "+sWordLen
				+"\nLongest word length = "+lWordLen);
	}
	
	private static void wordStats(){
		String word;
		int count=0, sum=0;
		String[] temp;
		char[] charsInWords;
		
		openFileIn();
		while(inputStream.hasNext()){
			inputStream.next();
			numWords++;
		}
		inputStream.close();
		
		temp = new String[numWords+1];
		wordArry = new String[numWords+1];
		for (int k=0; k<wordArry.length; k++){
			wordArry[k] = "";
		}
		
		openFileIn();
		temp[count] = inputStream.next();
		sWordLen = temp[count].length();
		lWordLen = temp[count].length();
		
		do{
			
			charsInWords = temp[count].toCharArray();
			
			if (!Character.isLetter(charsInWords[0]) 
				&& !Character.isLetter(charsInWords[charsInWords.length-1])){
				totPunctCh += 2;
				for (int i=1; i<(charsInWords.length-2); i++){
					wordArry[count] += Character.toString(charsInWords[i]);
				}
			}else if (Character.isLetter(charsInWords[0])
				&& !Character.isLetter(charsInWords[charsInWords.length-1])){
				totPunctCh++;
				for (int i=0; i<(charsInWords.length-2); i++){
					wordArry[count] += Character.toString(charsInWords[i]);
				}
			}else if (!Character.isLetter(charsInWords[0])
				&& Character.isLetter(charsInWords[charsInWords.length-1])){
				totPunctCh++;
				for (int i=1; i<(charsInWords.length-1); i++){
					wordArry[count] += Character.toString(charsInWords[i]);
				}
			}else if (Character.isLetter(charsInWords[0])
				&& Character.isLetter(charsInWords[charsInWords.length-1])){
				for (int i=0; i<(charsInWords.length-1); i++){
					wordArry[count] += Character.toString(charsInWords[i]);
				}	
			}
	
			if (sWordLen > wordArry[count].length()){
				sWordLen = wordArry[count].length();
			}else if (lWordLen < wordArry[count].length()){
				lWordLen = wordArry[count].length();
			}
			for (int y=0; y<wordArry.length; y++){
				sum += wordArry[y].length();
			}
			avgWordLen = sum/(double)numWords;
			count++;
			temp[count] = inputStream.next();
		}while (inputStream.hasNext());
		inputStream.close();
	}
	
	private static boolean checkOpt(){
		if (menuOpt==5){
			return false;
		}else{
			return true;
		}
	}
	
	private static void openFileIn(){
		try{
			inputStream = new Scanner(new FileInputStream(fileNameIn));
		}catch (FileNotFoundException e){
			System.out.println("File "+fileNameIn+" could not be found "
				+"or opened.  Exiting Program.");
			System.exit(0);
		}
	}
	
	private static void openFileOut(){
		try{
			getFileNameOut();
			outputStream = new PrintWriter(new FileOutputStream(fileNameOut, true));
		}
		catch (FileNotFoundException e){
			System.out.println("Error opening the file "+fileNameOut+".  Exiting program.");
			System.exit(0);
		}
	}
	
	private static void getFileNameOut(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\nEnter output file name: ");
		fileNameOut = keyboard.nextLine();
	}
	
	private static void getFileNameIn(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\nEnter input file name:");
		fileNameIn = keyboard.nextLine();
	}
}