/*
  Java Programming - Joyce Farrell
  Chapter 4 Exercise 5A
*/

public class Team {
    private String schoolName;
    private String sport;
    private String teamName;
    public final static String MOTTO = "Sportsmanship!";

    public Team(String schoolName, String sport, String teamName) {
	this.schoolName = schoolName;
	this.sport = sport;
	this.teamName = teamName;
    }
    
    public static void main(String[] args) {

    }

    public String toString() {
	return "High School Name: " + schoolName + "\nSport: " + sport + "\nTeam Name: " + teamName + "\nOur motto: " + MOTTO;
    }

    public String getSchoolName() {
	return schoolName;
    }

    public String getSport() {
	return sport;
    }

    public String getTeamName() {
	return teamName;
    }
}
