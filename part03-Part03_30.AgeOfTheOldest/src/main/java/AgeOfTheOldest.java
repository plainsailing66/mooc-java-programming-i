
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) break;
            String[] list = sentence.split(",");
            if (greatest < Integer.valueOf(list[1])) {
                greatest = Integer.valueOf(list[1]);
            }
        }
        System.out.println("Age of the oldest: " + greatest);

    }
}
