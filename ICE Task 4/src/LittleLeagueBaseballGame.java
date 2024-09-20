public class LittleLeagueBaseballGame extends BaseballGame {
    private final int innings = 6; // Override number of innings for Little League

    public LittleLeagueBaseballGame() {
        super();
        // Adjust the innings to 6
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