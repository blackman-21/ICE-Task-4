// BaseballGame.java
public class BaseballGame {
    private String team1;
    private String team2;
    private final int innings = 9; // Number of innings
    private int[][] scores;

    public BaseballGame() {
        scores = new int[2][innings];
        // Initialize with dummy values (0 for simplicity)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < innings; j++) {
                scores[i][j] = 0;
            }
        }
    }

    public void setTeamNames(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void setScore(int team, int inning, int score) {
        if (team >= 0 && team < 2 && inning >= 0 && inning < innings && score >= 0) {
            scores[team][inning] = score;
        }
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int[][] getScores() {
        return scores;
    }
}
