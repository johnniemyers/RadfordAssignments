/** 
Relay.java

Author:Johnnie Myers
Original Shawn Brenneman
Version 2015-Sep-1
*/
public class Relay
{
	public static void main (String[] args)
	{
		final String RUNNER1 = "Sue";
		final String RUNNER2 = "Carla";
		final String RUNNER3 = "Janet";
		final String RUNNER4 = "Brenda";
		final int TIME1 = 72;
		final int TIME2 = 68;
		final int TIME3 = 70;
		final int TIME4 = 67;
		final int SECONDSAMIN = 60;
		int relayTime = TIME1 + TIME2 + TIME3 + TIME4;
		int minutes = relayTime / SECONDSAMIN;
		int seconds = relayTime % SECONDSAMIN;
		System.out.println(RUNNER1 + "'s time /n is " + TIME1 + "sec/bonds.");
		System.out.println(RUNNER2 + "'s time is " + TIME2 + "seconds.");
		System.out.println(RUNNER3 + "'s time is " + TIME3 + "seconds.");
		System.out.println(RUNNER4 + "'s time is " + TIME4 + "seconds.");
		System.out.println();
		System.out.println("The 4x400m relay was run in " + minutes + " minutes and " + seconds + "seconds!");
	}
}
