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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items = new ArrayList<>();
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        int totalWeight = 0;
        for(Item theitem: items) {
            totalWeight += theitem.getWeight();
        }
        if (totalWeight + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }
    
    public String toString() {
        int totalWeight = 0;
        for(Item item: items) {
            totalWeight += item.getWeight();
        }
        if(items.size() == 0) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        }else {
            return items.size() + " items (" + totalWeight + " kg)";
        }      
    }
    
    public void printItems() {
        for(Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for(Item item: items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        int weight = 0;
        Item item = new Item("", 0);
        for(Item theitem: items) {
            if (theitem.getWeight() >= weight) {
                weight = theitem.getWeight();
                item = theitem;
            }
        }
        if (items.isEmpty()) {
            return null;
        }
        return item;
    }

}
