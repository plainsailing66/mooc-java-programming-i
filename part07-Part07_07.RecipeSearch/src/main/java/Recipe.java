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
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredient;
    
    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredient = new ArrayList<>();
    }
    
    public void addIngredient(String ingredient) {
        this.ingredient.add(ingredient);
    }
    
    public boolean existOfIngredient(String word) {
        int count = 0;
        for (String ingredient: ingredient) {
            if (ingredient.equals(word)) {
                count++;
            } 
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
