
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("First name:");
            String fn = scanner.nextLine();
            if (fn.isEmpty()) break;
            System.out.println("Last name:");
            String ln = scanner.nextLine();
            System.out.println("Identification number:");
            String inum = scanner.nextLine();
            infoCollection.add(new PersonalInformation(fn,ln,inum));
        }
        for(PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName()+ " " + info.getLastName());
        }
    }
}
