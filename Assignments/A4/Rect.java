/** Program: Rect - Object
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

public class Rect extends Figure {
	
	private static int length;
	private static int height;
	
	public Rect () {this(0,0);}
	public Rect (int l) {this(l,0);}
	public Rect (Rect o) {this(o.retLength(),o.retHeight());}
	public Rect (int l, int h) {
		
		super(l/2,h/2);
		length = l;
		height = h;
	}
	
	public static int retLength () {return length;}
	public static int retHeight () {return height;}
	
	public static void setLength (int n) {length=n;}
	public static void setHeight (int n) {height=n;}
	
	public static void draw (int a, int b) {
		
		for (int i=(a-(a/2)); i<height+(a-a/2); i++) {
			for (int j=(b-b/2); j<length+(b+b/2); j++) {
				if(i==(a-a/2)) {
					canvas[i][j] = "*";
				} else if (i==(height+(a-a/2)-1)) {
					canvas[i][j] = "*";
				} else {
					if (j==(b-b/2) || j==(length+(b+b/2)-1)) {
						canvas[i][j] = "*";
					} else if (canvas[i][j]!="*") {
						canvas[i][j] = " ";
					}
				}
			}
		}
	}
	
	public static void erase (int a, int b) {
		
		for (int i=(a-a/2); i<height+(a+a/2); i++) {
			for (int j=(b-b/2); j<length+(b+b/2); j++) {
				canvas[i][j] = " ";
			}
		}
	}
}
