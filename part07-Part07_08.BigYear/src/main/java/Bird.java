/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
public class Bird {
    private String name;
    private String nameInLatin;
    private int count;
    
    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.count = 0;
    }
    
    public void gotObserved() {
        this.count++;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + " (" + this.nameInLatin + "): " + this.count + " observations";
    }
}
