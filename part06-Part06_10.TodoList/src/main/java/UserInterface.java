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
    private TodoList lists;
    private Scanner scanner;
    
    public UserInterface(TodoList lists, Scanner scanner) {
        this.lists = lists;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                lists.add(task);
                continue;
            }
            
            if(command.equals("list")) {
                lists.print();
                continue;
            }
            
            if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                int num = Integer.valueOf(scanner.nextLine());
                lists.remove(num);
                continue;
            }
        }
    }
    
}
