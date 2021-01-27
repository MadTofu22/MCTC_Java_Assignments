/** Program: A4P3 - Figure driver
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

public class A4p3 {
	
	public static void main (String[] args) {
		
		Rect r1 = new Rect();
		Tri t1 = new Tri();
		
		r1.setLength(5);
		r1.setHeight(10);
		Figure.draw(r1);
		r1.erase();
		
		t1.setSize(9);
		Figure.draw(t1);
		t1.erase();
		
		Figure.draw(r1, t1);
		Figure.erase();
		
		r1.setX(10);
		r1.setY(10);
		t1.setX(30);
		t1.setY(10);
		Figure.draw(r1, t1);
		Figure.erase();
		
		r1.setX(20);
		t1.setX(20);
		Figure.draw();
	}
}
