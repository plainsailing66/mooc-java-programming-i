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
public class Stack {
    private ArrayList<String> stacks;
    
    public Stack() {
        this.stacks = new ArrayList<>();
    }
    public boolean isEmpty() {
        return this.stacks.size() == 0;
    }
    
    public void add(String value) {
        if (!this.stacks.contains(value)) this.stacks.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stacks;
    }
    
    public String take() {
        String stack = this.stacks.get(this.stacks.size() - 1);
        this.stacks.remove(this.stacks.get(this.stacks.size() - 1));
        return stack;
    }
    
    
}
