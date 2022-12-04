
import javax.lang.model.SourceVersion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
public class Container {
    private int contain;
    
    public Container() {
        this.contain = 0;
    }
    
    public int contains() {
        return this.contain;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            this.contain = this.contain;
        } else {
            if (this.contain + amount >= 100) {
            this.contain = 100;
        } else {
            this.contain += amount;
        }
        }
        
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            this.contain = this.contain;
        } else {
            if (amount >= this.contain) {
            this.contain = 0;
        } else {
            this.contain -= amount;
        }
        }
        
    }
    
    public String toString() {
        return this.contain + "/100";
    }
    
}
