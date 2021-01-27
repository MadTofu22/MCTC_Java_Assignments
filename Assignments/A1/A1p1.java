/** Program: Calorie Calc
	Author(s): Tom Stutler
	Last Date Modified: 9/3/2015
*/

public class A1p1 {

	public static void main(String[] args) {

		int runningMet=10, bballMet=8, sleepMet=1;
		double userWeight=150.0, calTotal=0, calRunning=0, calBBall=0
				, calSleep=0;

		userWeight /= 2.2; //convert user weight from lb to kg

		//calulate calories/min for each activity
		calRunning = 0.0175 * runningMet * userWeight;
		calBBall = 0.0175 * bballMet * userWeight;
		calSleep = 0.0175 * sleepMet * userWeight;

		//calculate user burned calories
		calRunning *= 30; //30min running
		calBBall *= 30; //30min playing basketball
		calSleep *= 360; //6hr spent sleeping
		calTotal = calRunning + calBBall + calSleep;

		//display caluclations to the user
		System.out.println("Welcome to the calorie calculator.\n"
			+ "For a 150.0lb person:\nThis person burned aproximately "
			+ calRunning+" calories running at 6mph.\n"
			+ "This person burned aproximately " + calBBall
			+ " calories playing basketball.\n"
			+ "This person burned aproximately " + calSleep
			+ " calories sleeping.\n"
			+ "This person burned a estimated total of " + calTotal
			+ " calories.\n");
	}
}
