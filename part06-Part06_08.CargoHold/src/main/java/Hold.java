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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for(Suitcase thesuitcase: suitcases) {
            totalWeight += thesuitcase.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        int totalWeight = 0;
        for(Suitcase thesuitcase: suitcases) {
            totalWeight += thesuitcase.totalWeight();
        }
        
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
    
}
