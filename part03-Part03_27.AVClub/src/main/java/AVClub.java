
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) break;
            String[] list = sentence.split(" ");
            for (int i = 0; i < list.length; i++) {
                if (list[i].contains("av")) {
                    System.out.println(list[i]);
                }
            }
        }

    }
}
