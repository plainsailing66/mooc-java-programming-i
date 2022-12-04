
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int fac = 1;
        int count = 1;
        while (count <= num) {
            fac *= count;
            count += 1;
        }
        System.out.println("Factorial: " + fac);
    }
}
