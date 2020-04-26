
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        ArrayList<Team> records = readRecordsFromFile(file);

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        int counter = 0;
        int wins = 0;
        int losses = 0;

        for (Team team : records) {

            if (team.getHomeTeam().contains(teamName)) {
                counter += 1;

                if (team.getHomeScore() >= team.getAwayScore()) {
                    wins += 1;
                    team.setWins();
                } else {
                    losses += 1;
                    team.setLosses();
                }

                team.playGame();
            } else if (team.getAwayTeam().contains(teamName)) {
                counter += 1;

                if (team.getAwayScore() >= team.getHomeScore()) {
                    wins += 1;
                    team.setWins();
                } else {
                    losses += 1;
                    team.setLosses();
                }

                team.playGame();
            }

        }

        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Team> readRecordsFromFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                teams.add(new Team(homeTeam, awayTeam, homeScore, awayScore));

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return teams;
    }

}
