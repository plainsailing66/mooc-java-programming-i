/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
import java.util.Scanner;
public class UserInterface {
    private JokeManager jokerManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokerManager, Scanner scanner) {
        this.jokerManager = jokerManager;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:" + "\n" + "1 - add a joke" + "\n" + "2 - draw a joke" + "\n" + "3 - list jokes" + "\n" + "X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokerManager.addJoke(joke);
            }
            
            if (command.equals("2")) {
                System.out.println(jokerManager.drawJoke());
            }
            
            if (command.equals("3")) {
                jokerManager.printJokes();
            }
        }
    }
}
