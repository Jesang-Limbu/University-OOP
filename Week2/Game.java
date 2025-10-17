/*
  Java Programming - Joyce Farrell
  Chapter 4 Exercise 5C
*/

public class Game {
    Team homeTeam;
    Team visitingTeam;
    String gameTime;

    public Game(Team homeTeam, Team visitingTeam, String time) {
	this.homeTeam = homeTeam;
	this.visitingTeam = visitingTeam;
	this.gameTime = time;
    }
    
    public static void main(String[] args) {
	
    }

    public String toString() {
	return homeTeam.getTeamName() + " (home) vs (away) " + visitingTeam.getTeamName() + "\n" + homeTeam.getSchoolName() + " vs " + visitingTeam.getSchoolName() + "\nAt " + gameTime;

    }
}
