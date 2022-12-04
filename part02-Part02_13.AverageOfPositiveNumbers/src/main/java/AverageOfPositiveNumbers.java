
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0) {
                count += 1;
                sum += num;
            } else if (num == 0 && count == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (num == 0) {
                break;
            }
        }
        System.out.println((double) sum/count);
    }
}
