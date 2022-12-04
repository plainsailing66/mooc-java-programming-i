import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;
            System.out.println("Duration:");
            int num = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name,num));
        }
        
        System.out.println("Program's maximum duration?");
        int mdur = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= mdur) System.out.println(program);
        }
    }
}
