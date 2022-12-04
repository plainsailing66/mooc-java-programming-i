
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int num1 = Integer.valueOf(scanner.nextLine());
        int sum =0;
        while (num <= num1) {
            sum += num;
            num += 1;
        }
        System.out.println("The sum is " + sum);
    }
}
