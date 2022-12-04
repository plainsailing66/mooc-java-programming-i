/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
import java.util.ArrayList;
import java.util.Scanner;
public class UI {
    private ArrayList<Bird> birds;
    private Scanner scanner;
    
    public UI(Scanner scanner) {
        this.birds = new ArrayList<>();
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String nameInLatin = scanner.nextLine();
                Bird bird = new Bird(name, nameInLatin);
                birds.add(bird);
            }
            
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                int count = 0;
                for(Bird birdOB: birds) {
                    if (birdOB.getName().equals(bird)) {
                        birdOB.gotObserved();
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("Not a bird!");
                }
            }
            
            if (command.equals("All")) {
                for (Bird bird: birds) {
                    System.out.println(bird);
                }
            }
            
            if (command.equals("One")) {
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                for (Bird onebird: birds) {
                    if (onebird.getName().equals(bird)) {
                        System.out.println(onebird);
                    }
                }
            }
        }
    }
}
