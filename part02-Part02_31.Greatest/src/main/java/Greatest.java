
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int g1;
        if (number1 < number2) {
            g1 = number2;
        } else {
            g1 = number1;
        }
        int g2;
        if (g1 > number3) {
            g2 = g1;
        } else {
            g2 = number3;
        }
        return g2;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
