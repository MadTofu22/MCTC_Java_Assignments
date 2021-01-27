/** Program: Word Replacer
	Author(s): Tom Stutler
	Last Date Modified: 9/3/2015
*/

public class A1p3 {

	public static void main(String[] args) {

		String origLine="I hate you.", removeWord="hate"
						, newWord="love";

		System.out.println("The line of the text to be changed is:\n"
			+ origLine + "\nI have rephrased that line to read:\n"
			+ origLine.replace(removeWord, newWord));
    }
}
