/*
  Java Programming - Joyce Farrell
  Chapter 5 Exercise 4
*/

import java.util.Scanner;

public class CellPhoneService {
    final static float PLAN_A = 49;
    final static float PLAN_B = 55;
    final static float PLAN_C = 61;
    final static float PLAN_D = 70;
    final static float PLAN_E = 79;
    final static float PLAN_F = 87;
    
    public static void main(String[] args) {
	Scanner inputDevice = new Scanner(System.in);
	
	int talkMinutes;
	int textMessages;
	int dataGB;

	System.out.print("How many minutes of talk do you need: ");
	talkMinutes = inputDevice.nextInt();
	inputDevice.nextLine();

	System.out.print("How many messages do you need: ");
	textMessages = inputDevice.nextInt();
	inputDevice.nextLine();

	System.out.print("How many gigabytes of data do you need: ");
	dataGB = inputDevice.nextInt();
	inputDevice.nextLine();

	displayPlan(talkMinutes,textMessages,dataGB);
    }

    static void displayPlan(int talkMinutes, int textMessages, int dataGB) {
	if (dataGB > 0) {
	    if (dataGB < 3) {
		System.out.println("You will be on Plan E: £" + PLAN_E + " per month");
	    } else {
		System.out.println("You will be on Plan F: £" + PLAN_F + " per month");
	    }
	} else {
	    if (talkMinutes < 500) {
		if (textMessages == 0) {
		    System.out.println("You will be on Plan A: £" + PLAN_A + " per month");
		} else {
		    System.out.println("You will be on Plan B: £" + PLAN_B + " per month");
		}
	    } else {
		if (textMessages < 100) {
		    System.out.println("You will be on Plan C: £" + PLAN_C + " per month");
		} else {
		    System.out.println("You will be on Plan D: £" + PLAN_D + " per month");
		}
	    }
	}
	
    }
}
