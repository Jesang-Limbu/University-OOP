/*
  Java Programming - Joyce Farrell
  Chapter 5 Exercise 9
*/

import java.util.Scanner;

public class TestApartments {
    public static void main(String[] args) {
	Apartment apt1 = new Apartment(1, 4, 2, 1800.23);
	Apartment apt2 = new Apartment(1, 1, 1, 1030.12);
	Apartment apt3 = new Apartment(1, 2, 1, 1300.23);
	Apartment apt4 = new Apartment(1, 4, 3, 2013.11);
	Apartment apt5 = getApartmentData();
    }

    public static Apartment getApartmentData() {
	int aptNum;
	int bedrooms;
	int baths;
	double rent;

	Scanner inputDevice = new Scanner(System.in);

	System.out.print("Enter apartment number: ");
	aptNum = inputDevice.nextInt();
	inputDevice.nextLine();

	System.out.print("Enter bedrooms: ");
	bedrooms = inputDevice.nextInt();
	inputDevice.nextLine();

	System.out.print("Enter baths: ");
	baths = inputDevice.nextInt();
	inputDevice.nextLine();

	System.out.print("Enter rent: ");
	rent = inputDevice.nextInt();
	inputDevice.nextLine();

	return new Apartment(aptNum, bedrooms, baths, rent);
    }
    /*
    public static Apartment getIdealApartment() {
	int aptNum;
	int bedrooms;
	int baths;
	double rent;

    }
    */
}
