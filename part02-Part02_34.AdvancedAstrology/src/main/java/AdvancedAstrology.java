
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int a = 0;
        while (a < number) {
            System.out.print("*");
            a++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int a = 0;
        while (a < number) {
            System.out.print(" ");
            a++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            printStars(i + 1);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 0; i < height; i++) {
            printSpaces(height - i - 1);
            printStars(2 * i + 1);
        }
        int longest = height * 2 - 1;
        printSpaces((longest - 3)/2);
        printStars(3);
        printSpaces((longest - 3)/2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
