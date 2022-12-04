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
public class TodoList {
    private ArrayList<String> lists;
    
    public TodoList() {
        this.lists = new ArrayList<>();
    }
    
    public void add(String task) {
        this.lists.add(task);
    }
    
    public void print() {
        for (String task: lists) {
            System.out.println(lists.indexOf(task)+1 + ": " + task);
        }
    }
    
    public void remove(int number) {
        lists.remove(lists.get(number - 1));
    }
}
