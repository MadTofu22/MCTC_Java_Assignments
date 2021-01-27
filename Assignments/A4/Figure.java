/** Program: Figure - Abstract Object
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

public class Figure {

	protected static String[][] canvas = new String[20][50];
	private int x;
	private int y;
	
	public Figure () {this(0,0);}
	public Figure (int n) {this(n,0);}
	public Figure (Figure o) {this(o.retX(),o.retY());}
	public Figure (int n, int m) {
		x=n;
		y=m;
		for (int i=0; i<20; i++) {
			for (int j=0; j<50; j++) {
				canvas[i][j] = " ";
			}
		}
	}
	
	public int retX () {return x;}
	public int retY () {return y;}
	
	public void setX (int n) {x=n;}
	public void setY (int n) {y=n;}
	
	public static void draw () {
		for (int i=0; i<20; i++) {
			System.out.print("\n");
			for (int j=0; j<50; j++) {
				System.out.print(canvas[i][j]);
			}
		}
		System.out.println();
	}
	public static void draw (Rect r) {
		
		r.draw(r.retY(), r.retX());
		draw();
	}
	public static void draw (Tri t) {
		
		t.draw(t.retY(), t.retX());
		draw();
	}
	public static void draw (Rect r, Tri t) {
		
		r.draw(r.retY(), r.retX());
		t.draw(t.retY(), t.retX());	
		draw();
	}
	
	public static void erase () {
		
		for (int i=0; i<20; i++) {
			for (int j=0; j<50; j++) {
				canvas[i][j] = " ";
			}
		}
	}
}
