
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println((double)Math.sqrt(num + num1));
    }
}
