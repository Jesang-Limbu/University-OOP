import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
	Scanner inputDevice = new Scanner(System.in);
	float MINUTES_TO_HOURS = 60;
	int MINUTES_TO_DAYS = 86400;

	System.out.print("Enter an integer: ");
	int minutes = inputDevice.nextInt();
	inputDevice.nextLine();

	float hours = minutes / MINUTES_TO_HOURS;
	float days = hours / 24;

	System.out.println(minutes + " minutes is " + hours + " hours.");
	System.out.println(minutes + " minutes is " + days + " days.");
    }
}
