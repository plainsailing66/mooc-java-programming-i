
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) break;
            String[] list = sentence.split(" ");
            System.out.println(list[list.length - 1]);
        }

    }
}
