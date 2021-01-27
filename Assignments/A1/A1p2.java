/** Program: Coupon Divider
	Author(s): Tom Stutler
	Last Date Modified: 9/3/2015
*/

public class A1p2 {

	public static void main(String[] args) {

		int totalTickets=25, costCandy=10, costGum=3, numCandy
			, numGum, remTickets;

		//Calculate how many candy bars and gum can be purchased
		numCandy = (totalTickets/costCandy);
		numGum = ((totalTickets%costCandy)/costGum);
		remTickets = ((totalTickets/costCandy)%costGum);

		System.out.println("Your 25 coupons can be redeemed for "
			+ numCandy + " candy bars and "+numGum+" gumballs with "
			+ remTickets + " coupons leftover.");
	}
}
