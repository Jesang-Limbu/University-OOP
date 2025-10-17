/*
  Java Programming - Joyce Farrell
  Chapter 4 Exercise 6
*/

import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
	int num1;
	double num2;
	Scanner inputDevice = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	num1 = inputDevice.nextInt();
	inputDevice.nextLine();

	System.out.print("Enter a double: ");
	num2 = inputDevice.nextDouble();
	inputDevice.nextLine();

	System.out.println("The square root of " + num1 + " is " + Math.sqrt(num1));
	System.out.println("Random number between 1-10: " + Math.round((Math.random() * 10)));

	System.out.println("Floor operation on " + num2 + " is " + Math.floor(num2));
	System.out.println("Ceiling operation on " + num2 + " is " + Math.ceil(num2));
	System.out.println("Round operation on " + num2 + " is " + Math.round(num2));

	System.out.println(Math.max(num1,num2) + " is the bigger number out of the two.");
    }
}
