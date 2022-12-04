
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int count = 0;
        int count_win = 0;
        int count_lose = 0;
        
        try(Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String team_h = parts[0];
                String team_v = parts[1];
                int score_h = Integer.valueOf(parts[2]);
                int score_v = Integer.valueOf(parts[3]);
                
                if(!team_h.equals(team) && !team_v.equals(team)) {
                    continue;
                } else if (team_h.equals(team)) {
                    count++;
                    if (score_h > score_v) {
                        count_win++;
                    } else if(score_h < score_v) {
                        count_lose++;
                    }
                } else if (team_v.equals(team)) {
                    count++;
                    if (score_h < score_v) {
                        count_win++;
                    } else if(score_h > score_v) {
                        count_lose++;
                    }
                }
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + count_win);
        System.out.println("Losses: " + count_lose);
    }

}
