
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int num = Integer.valueOf(parts[1]);
                if (num == 1) {
                    System.out.println(name + ", " + "age: " + num + " year");
                }else {
                    System.out.println(name + ", " + "age: " + num + " years");
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
