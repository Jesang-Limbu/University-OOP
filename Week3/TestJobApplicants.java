/*
Java Programming - Joyce Farrell
Chapter 5 Exercise 7
*/

import java.util.Scanner;

public class TestJobApplicants {
    public static void main(String[] args) {
        JobApplicant applicant1 = getApplicant();
        JobApplicant applicant2 = getApplicant();
        JobApplicant applicant3 = getApplicant();

        displayResult(applicant1);
        displayResult(applicant2);
        displayResult(applicant3);
    }

    private static JobApplicant getApplicant() {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String name = inputDevice.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = inputDevice.nextLine();

        System.out.print("Are you proficient in word processing? (Y/N): ");
        boolean wordProcess;
        String userInput = inputDevice.nextLine().toLowerCase();
        if (userInput.equals("y") || userInput.equals("yes")) {
            wordProcess = true;
        } else {
            wordProcess = false;
        }

        System.out.print("Are you proficient in spreadsheets? (Y/N): ");
        userInput = inputDevice.nextLine().toLowerCase();
        boolean spreadsheet;
        if (userInput.equals("y") || userInput.equals("yes")) {
            spreadsheet = true;
        } else {
            spreadsheet = false;
        }

        System.out.print("Are you proficient in databases? (Y/N): ");
        userInput = inputDevice.nextLine().toLowerCase();
        boolean database;
        if (userInput.equals("y") || userInput.equals("yes")) {
            database = true;
        } else {
            database = false;
        }

        System.out.print("Are you proficient in graphics? (Y/N): ");
        userInput = inputDevice.nextLine().toLowerCase();
        boolean graphics;
        if (userInput.equals("y") || userInput.equals("yes")) {
            graphics = true;
        } else {
            graphics = false;
        }

        return new JobApplicant(name, phoneNumber, wordProcess, spreadsheet, database, graphics);
    }

    private static boolean isQualified(JobApplicant applicant) {
        int skillCount = 0;

        skillCount += applicant.canWordProcess() ? 1 : 0;
        skillCount += applicant.canSpreadsheet() ? 1 : 0;
        skillCount += applicant.canDatabase() ? 1 : 0;
        skillCount += applicant.canGraphics() ? 1 : 0;

        return skillCount > 2;
    }

    public static void displayResult(JobApplicant applicant) {
        System.out.println("Dear " + applicant.getName() + ",");
        if (isQualified(applicant)) {
            System.out.println("Congratulations! You are qualified for this role and we would like to interview you for this role. We will be in contact with you soon.");
        } else {
            System.out.println("Unfortunately you do not have the skills we are seeking for.");
        }
    }
}
