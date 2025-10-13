/*
  Java Programming - Joyce Farrell
  Chapter 2 Exercise 5a
*/

public class MilesConversion {
    public static void main(String args[]) {
	final double INCHES_TO_MILES = 63360;
	final double FEET_TO_MILES = 5280;
	final double YARDS_TO_MILES = 1760;

	int miles = 20;

	double milesInches = miles * INCHES_TO_MILES;
	double milesFeet = miles * FEET_TO_MILES;
	double milesYards = miles * YARDS_TO_MILES;
	
	System.out.println(miles + " miles to inches is: " + milesInches);
	System.out.println(miles + " miles to feet is: " + milesFeet);
	System.out.println(miles + " miles to yards is: " + milesYards);
    }
}
