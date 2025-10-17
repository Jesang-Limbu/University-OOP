/*
  Java Programming - Joyce Farrell
  Chapter 4 Exercise 5D
*/

public class TestGame {
    public static void main(String[] args) {
	Team homeTeam = TestTeam.setTeamData();
	Team visitingTeam = TestTeam.setTeamData();
	String gameTime = "19:00";

	Game game1 = new Game(homeTeam, visitingTeam, gameTime);
	System.out.println(game1);
    }
}
