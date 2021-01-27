/** Program: A4p4 - Driver
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

import java.util.Scanner;

public class A4p4 {

	private static final int MAX = 20;
	private static Shape[] shapes = new Shape[MAX];
	private static Scanner iStream = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		String repeat = "y";
		boolean full = false;
		int sel = 0;
		
		do {
			sel = getSelection();
			
			if (Shape.retNumOfShapes()<20) {
				createShape(sel);
			} else {
				full = true;
			}
			
			if (!full) {
				System.out.println("Select another shape? (y or n):");
				repeat = iStream.next();
				iStream.nextLine();
			}
		} while (repeat.equalsIgnoreCase("y"));
		
		displayShapes();
	}
	
	public static int getSelection () {
		
		int s = 0;
		
		System.out.println("It's time to enter your shape selection and dimensions."
			+"\nEnter the number of the shape type:"
			+"\n\t1 - Rectangle"
			+"\n\t2 - Circle"
			+"\n\t3 - Triangle"
			+"\n\t4 - Box"
			+"\n\t5 - Can"
			+"\n\t6 - Cone"
			+"\n\t7 - Ball"
			+"\n=>");
		s = iStream.nextInt();
		iStream.nextLine();
		
		return s;
	}
	
	public static void createShape (int s) {
		
		switch (s) {
			
			case 1:	shapes[Shape.retNumOfShapes()] = new Rectangle();
					shapes[Shape.retNumOfShapes()-1].getDimensions();
					break;
			
			case 2:	shapes[Shape.retNumOfShapes()] = new Circle();
					shapes[Shape.retNumOfShapes()-1].getDimensions();
					break;
			
			case 3:	shapes[Shape.retNumOfShapes()] = new Triangle();
					shapes[Shape.retNumOfShapes()-1].getDimensions();
					break;
					
			case 4:	shapes[Shape.retNumOfShapes()] = new Box();
					shapes[Shape.retNumOfShapes()-1].getDimensions();
					break;
					
			case 5:	shapes[Shape.retNumOfShapes()] = new Can();
					shapes[Shape.retNumOfShapes()-1].getDimensions();
					break;
					
			case 6:	shapes[Shape.retNumOfShapes()] = new Cone();
					shapes[Shape.retNumOfShapes()-1].getDimensions();
					break;
			
			case 7:	shapes[Shape.retNumOfShapes()] = new Ball();
					shapes[Shape.retNumOfShapes()-1].getDimensions();
					break;
			
			default:System.out.println("Invalid entry - try again");
					break;
		}
	}
	
	public static void displayShapes () {
		
		System.out.println("\nNext, a display of your selected shapes, dimensions, "
			+"and other data.");
			
		for (int i=0; i<Shape.retNumOfShapes(); i++) {
			System.out.println("\n");
			shapes[i].display();
		}
	}
}
