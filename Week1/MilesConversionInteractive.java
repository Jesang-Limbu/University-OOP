/*
  Java Programming - Joyce Farrell
  Chapter 2 Exercise 5b
*/

import java.util.Scanner;

public class MilesConversionInteractive {
    public static void main(String args[]) {
	Scanner inputDevice = new Scanner(System.in);
	
	final double INCHES_TO_MILES = 63360;
	final double FEET_TO_MILES = 5280;
	final double YARDS_TO_MILES = 1760;

	System.out.print("Enter a number of miles: ");
	double miles = inputDevice.nextDouble();
	inputDevice.nextLine();

	double milesInches = miles * INCHES_TO_MILES;
	double milesFeet = miles * FEET_TO_MILES;
	double milesYards = miles * YARDS_TO_MILES;
	
	System.out.println(miles + " miles to inches is: " + milesInches);
	System.out.println(miles + " miles to feet is: " + milesFeet);
	System.out.println(miles + " miles to yards is: " + milesYards);
    }
}
