/*
  Java Programming - Joyce Farrell
  Chapter 5 Exercise 9
*/

import java.util.Scanner;

public class TestApartments {
    static Scanner inputDevice = new Scanner(System.in);
    static int numberOfBedrooms;
    static int numberOfBaths;
    static double rentAmount;

    public static void main(String[] args) {
        // initial apartments
        Apartment apt1 = new Apartment("1", 4, 2, 1800.23);
        Apartment apt2 = new Apartment("2", 1, 1, 1030.12);
        Apartment apt3 = new Apartment("3", 2, 1, 1300.23);
        Apartment apt4 = new Apartment("4", 4, 3, 2013.11);
        Apartment apt5 = new Apartment("5", 3, 2, 1308.67);

        System.out.print("Enter minimum number of bedrooms: ");
        numberOfBedrooms = inputDevice.nextInt();

        System.out.print("Enter minimum number of baths: ");
        numberOfBaths = inputDevice.nextInt();

        System.out.print("Enter the max amount of rent you are willing to pay: ");
        rentAmount = inputDevice.nextDouble();

        displayQuery(apt1);
        displayQuery(apt2);
        displayQuery(apt3);
        displayQuery(apt4);
        displayQuery(apt5);
    }

    private static boolean meetsCriteria(Apartment apartment) {
        return apartment.getNumberOfBedrooms() >= numberOfBedrooms && apartment.getNumberOfBaths() >= numberOfBaths && apartment.getRentAmount() <= rentAmount;
    }

    private static void displayQuery(Apartment apartment) {
        if (meetsCriteria(apartment)) {
            System.out.println("Apartment number " + apartment.getApartmentNumber() + " is a good match. It has " + apartment);
        }
    }

}
