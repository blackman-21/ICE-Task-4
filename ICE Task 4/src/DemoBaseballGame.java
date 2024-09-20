// DemoBaseballGame.java
import java.util.Scanner;

public class DemoBaseballGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select game type: 1 for High School, 2 for Little League");
        int gameType = input.nextInt();
        BaseballGame game = null;

        switch (gameType) {
            case 1:
                game = new HighSchoolBaseballGame();
                break;
            case 2:
                game = new LittleLeagueBaseballGame();
                break;
            default:
                System.out.println("Invalid selection");
                return;
        }

        System.out.println("Enter team 1 name:");
        String team1 = input.next();
        System.out.println("Enter team 2 name:");
        String team2 = input.next();
        game.setTeamNames(team1, team2);

        int innings = game.getScores()[0].length;

        for (int inning = 0; inning < innings; inning++) {
            System.out.println("Enter score for " + team1 + " in inning " + (inning + 1) + ":");
            int score1 = input.nextInt();
            game.setScore(0, inning, score1);

            System.out.println("Enter score for " + team2 + " in inning " + (inning + 1) + ":");
            int score2 = input.nextInt();
            game.setScore(1, inning, score2);
        }

        int[] totals = new int[2];
        int[][] scores = game.getScores();
        for (int i = 0; i < innings; i++) {
            totals[0] += scores[0][i];
            totals[1] += scores[1][i];
        }

        System.out.println("Final Scores:");
        System.out.println(game.getTeam1() + ": " + totals[0]);
        System.out.println(game.getTeam2() + ": " + totals[1]);

        if (totals[0] > totals[1]) {
            System.out.println(game.getTeam1() + " wins!");
        } else if (totals[1] > totals[0]) {
            System.out.println(game.getTeam2() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
