/*
  Java Programming - Joyce Farrell
  Chapter 3 Exercise 10
*/

public class FormLetterWriter {
    public static void main(String[] args) {
	String firstName = "John";
	String secondName = "Smith";

	displaySalutations(firstName);
	displaySalutations(firstName, secondName);
    }

    public static void displaySalutations(String firstName) {
	System.out.println("Dear " + firstName + ",\nThank you for your order.");
    }

    public static void displaySalutations(String firstName, String secondName) {
	System.out.println("Dear " + firstName + " " + secondName + ",\nThank you for your order.");
    }    
}
