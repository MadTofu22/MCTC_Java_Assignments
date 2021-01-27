/** Program: A5p6 - FindFile from Textbook display 11.11
	Author(s): Tom Stutler, Jack Stutler
	Last Date Modified: 12/10/15
*/

import java.io.File;
import java.util.Scanner;

public class A5p6 {

	private static boolean found = false;
		
	public static String searchForFile (File dir, String target) {
		
		String result="";
		
		if (!dir.isDirectory()) {
		
			return "Path is not a directory.";
		}
		
		for (File folderItem : dir.listFiles()) {
		
			if (folderItem.isDirectory()) {
			
				result = searchForFile(folderItem, target);
				if (!result.equals("")) {
					
					return result;
				}
			} else {
				
				if (folderItem.getName().equals(target)) {
					System.out.println("\nThe file " +target +" has been found in the "
						+"following folder:\n\t" +folderItem.getAbsolutePath());
					found = true;
				}
			}
		}
		
		return "";
	}
	
	public static void main (String[] args) {
		
		Scanner iStream = new Scanner(System.in);
		String dirName="", fileName="", result="";
		File rootFolder;
		
		System.out.println("\nEnter the directory / folder to search:");
		dirName = iStream.next();
		iStream.nextLine();
		
		System.out.println("\nEnter the name of the file to search for:");
		fileName = iStream.next();
		iStream.nextLine();
		
		rootFolder = new File(dirName);
		result = searchForFile(rootFolder, fileName);
		
		if (found) {
			System.out.println("End of search.");
		} else {
			System.out.println("File not found.");
		}
	}
}
