/** Program: HotDogStand - Tester
	Author(s): Tom Stutler
	Last Date Modified: 10/8/15
*/

public class A3p1{
		
		public static void main (String[] args) {
		
		System.out.println("Create three hotdog stands:");
		HotDogStand s1 = new HotDogStand();
		System.out.println("Create HotDogStand s1 with default constructor: "
			+s1);
		HotDogStand s2 = new HotDogStand(2);
		System.out.println("Create HotDogStand s2 with " +s2);
		HotDogStand s3 = new HotDogStand(3);
		System.out.println("Create HotDogStand s3 with " +s3);
		s1.setID(1);
		System.out.println("Reset s1 ID: " +s1.getID()
			+"\nInvoke s1.justSold()");
		s1.justSold();
		System.out.println("Invoke s2.justSold()");
		s2.justSold();
		System.out.println("Invoke s1.justSold()");
		s1.justSold();
		System.out.println("Stand " +s1.getID()+ " sold " +s1.getSold()
			+"\nStand " +s2.getID()+ " sold " +s2.getSold()
			+"\nStand " +s3.getID()+ " sold " +s3.getSold()
			+"\nTotal sold = " +HotDogStand.getTotal());
		System.out.println("Invoke s3.justSold()");
		s3.justSold();
		System.out.println("Invoke s1.justSold()");
		s1.justSold();
		System.out.println("Stand " +s1.getID()+ " sold " +s1.getSold()
			+"\nStand " +s2.getID()+ " sold " +s2.getSold()
			+"\nStand " +s3.getID()+ " sold " +s3.getSold()
			+"\nTotal sold = " +HotDogStand.getTotal());
	}
}
