
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> lines = new ArrayList<>();

        // we create a scanner for reading the file
        try (Scanner scan = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if (lines.isEmpty()) {
            System.out.println("Reading the file " + file + " failed.");
        } else if(lines.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
