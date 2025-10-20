/*
  Java Programming - Joyce Farrell
  Chapter 5 Exercise 2

  Note: There are more efficient ways to do this however
  since the chapter is about control statements I chose
  to do it this way
*/

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
	Scanner inputDevice = new Scanner(System.in);
		
	System.out.print("Enter an integer: ");
	int num1 = inputDevice.nextInt();
	inputDevice.nextLine();

	System.out.print("Enter an integer: ");
	int num2 = inputDevice.nextInt();
	inputDevice.nextLine();

	System.out.print("Enter an integer: ");
	int num3 = inputDevice.nextInt();
	inputDevice.nextLine();

	int current_low;

	if (num1 < num2 && num1 < num3) {
	    System.out.println(num1);
	    if (num2>num3) {
		System.out.println(num3);
		System.out.println(num2);
	    } else {
		System.out.println(num2);
		System.out.println(num3);
	    }
	} else if (num2 < num3) {
	    System.out.println(num2);
	    if (num1>num3) {
		System.out.println(num3);
		System.out.println(num1);
	    } else {
		System.out.println(num1);
		System.out.println(num3);
	    }
	} else {
	    System.out.println(num3);
	    if (num1>num2) {
		System.out.println(num2);
		System.out.println(num1);
	    } else {
		System.out.println(num1);
		System.out.println(num2);
	    }
        }
    }
}
