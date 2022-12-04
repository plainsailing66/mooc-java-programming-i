
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int longestName = 0;
        int sum = 0;
        int count = 0;
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) break;
            String[] list = sentence.split(",");
            sum += Integer.valueOf(list[1]);
            count++;
            if (longestName < list[0].length()) {
                longestName = list[0].length();
                name = list[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + ((double) sum / count));

    }
}
