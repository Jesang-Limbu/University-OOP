/*
  Java Programming - Joyce Farrell
  Chapter 3 Exercise 3
*/

import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {
	Scanner inputDevice = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int num1 = inputDevice.nextInt();

	System.out.print("Enter another integer: ");
	int num2 = inputDevice.nextInt();

	displayTwiceTheNumber(num1);
	displayTwiceTheNumber(num2);

	displayNumberPlusFive(num1);
	displayNumberPlusFive(num2);

	displayNumberSquared(num1);
	displayNumberSquared(num2);
    }

    public static void displayTwiceTheNumber(int n) {
	System.out.println(n*2);
    }

    public static void displayNumberPlusFive(int n) {
	System.out.println(n+5);
    }

    public static void displayNumberSquared(int n) {
	System.out.println(n*n);
    }
}
