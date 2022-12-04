
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Grade Grades = new Grade();
        UI userInterface = new UI(Grades, scanner);
        userInterface.start();
    }
}
