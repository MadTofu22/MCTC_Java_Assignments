/** Program: Tri - object
	Author(s): Tom Stutler
	Last Date Modified: 12/2/15
*/

public class Tri extends Figure {
	
	private static int size;
	
	public Tri () {this(0);}
	public Tri (Tri o) {this(o.retSize());}
	public Tri (int n) {
		
		super(n/2,n/2);
		size = n;
	}
	
	public static int retSize () {return size;}
	
	public static void setSize (int n) {size=n;}
	
	public static void draw (int a, int b) {
		
		int c = 0;
		
		for (int i=a; i<size+(a-a/2); i++) {//(a-a/2)
			for (int j=b; j<size+(b+b/2); j++) {//(b-b/2)
				if (i==(a-a/2)) {
					if (j==(b+size/2)) {
						canvas[i][j] = "*";
					}
				} else if (i==size+(a-a/2)-1) {
					canvas[i][j] = "*";
				} else {
					if (j==(b+size/2)-c || j==(b+size/2)+c) {
						canvas[i][j] = "*";
					} else {
						if (canvas[i][j]!="*") {
							canvas[i][j] = " ";
						}
					}
				}
			}
			c++;
		}
	}
	
	public static void erase (int a, int b) {
		for (int i=(a-a/2); i<size; i++) {
			for (int j=(b-b/2); j<size; j++) {
				canvas[i][j] = " ";
			}
		}
	}
}
