
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int greatest = 0;
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) break;
            String[] list = sentence.split(",");
            if (greatest < Integer.valueOf(list[1])) {
                greatest = Integer.valueOf(list[1]);
                name = list[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
