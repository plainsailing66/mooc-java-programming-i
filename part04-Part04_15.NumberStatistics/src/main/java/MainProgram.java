
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics statTot = new Statistics();
        Statistics statEven = new Statistics();
        Statistics statOdd = new Statistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            } else if (num % 2 == 0) {
                statTot.addNumber(num);
                statEven.addNumber(num);
            } else {
                statTot.addNumber(num);
                statOdd.addNumber(num);
            }
        }
        System.out.println("Sum: " + statTot.sum());
        System.out.println("Sum of even numbers: " + statEven.sum());
        System.out.println("Sum of odd numbers: " + statOdd.sum());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
