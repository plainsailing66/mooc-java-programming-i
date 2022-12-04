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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if(command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
                continue;
            }
            
            if(command.equals("search")) {
                System.out.println("To be translated:");
                String totranslate = scanner.nextLine();
                if(!simpleDictionary.contain(totranslate)) {
                    System.out.println("Word " + totranslate + " was not found");
                    continue;
                }
                System.out.println("Translation: " + simpleDictionary.translate(totranslate));
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
