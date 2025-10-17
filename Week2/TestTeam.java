/*
  Java Programming - Joyce Farrell
  Chapter 4 Exercise 5B
*/

import java.util.Scanner;

public class TestTeam {
    public static void main(String[] args) {
	/*
	Team team1 = setTeamData();
	Team team2 = setTeamData();
	Team team3 = setTeamData();

	System.out.println(team1);
	System.out.println(team2);
	System.out.println(team3);
	*/
    }

    public static Team setTeamData() {
	Scanner inputDevice = new Scanner(System.in);
	String schoolName;
	String teamName;
	String sport;
	System.out.print("Enter the high school name: ");
	schoolName = inputDevice.nextLine();

	System.out.print("Enter sport name: ");
	sport = inputDevice.nextLine();

	System.out.print("Enter the team name: ");
	teamName = inputDevice.nextLine();
	
	return new Team(schoolName, sport, teamName);
    }
}
