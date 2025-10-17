/*
  Java Programming - Joyce Farrell
  Chapter 4 Exercise 2B
*/

import java.util.Scanner;

public class TestLease {
    public static void main(String[] args) {

	Lease lease1 = getData();
	Lease lease2 = getData();
	Lease lease3 = getData();
	Lease lease4 = new Lease();

	System.out.println(lease1);
	lease1.addPetFee();
	System.out.println(lease1);

	System.out.println(lease2);
	System.out.println(lease3);
	System.out.println(lease4);
    }

    private static Lease getData() {
	Scanner inputDevice = new Scanner(System.in);
	Lease returnData = new Lease();
	System.out.print("Enter name: ");
	returnData.setTenantName(inputDevice.nextLine());

	System.out.print("Enter apartment number: ");
	returnData.setApartmentNumber(inputDevice.nextLine());

	System.out.print("Enter your monthly rent: ");
	returnData.setMonthlyRent(inputDevice.nextDouble());
	inputDevice.nextLine();

	System.out.print("Enter your lease term in months: ");
	returnData.setLeaseTermMonths(inputDevice.nextInt());
	inputDevice.nextLine();

	return returnData;
    }
}
