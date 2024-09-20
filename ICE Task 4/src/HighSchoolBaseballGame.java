// HighSchoolBaseballGame.java
public class HighSchoolBaseballGame extends BaseballGame {
    private final int innings = 7; // Override number of innings for High School

    public HighSchoolBaseballGame() {
        super();
        // Adjust the innings to 7
        // Initialize with dummy values (0 for simplicity)
        int[][] newScores = new int[2][innings];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < innings; j++) {
                newScores[i][j] = 0;
            }
        }
        setScores(newScores);
    }

    private void setScores(int[][] scores) {
        // Set scores with new innings count
    }
}

// LittleLeagueBaseballGame.java

