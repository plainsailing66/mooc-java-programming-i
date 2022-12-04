/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class UI {
    private ArrayList<Recipe> recipes;
    private Scanner scanner;
    
    public UI(Scanner scanner) {
        this.recipes = new ArrayList<>();
        this.scanner = scanner;
    }
    
    public void readFile() {
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                int cookingTime = Integer.valueOf(scan.nextLine());
                Recipe recipe = new Recipe(name, cookingTime);
                recipes.add(recipe);
                while (scan.hasNextLine()) {
                    String ingredient = scan.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void start() {
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    System.out.println(recipe);
                }
            }
            
            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String word = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.getName().contains(word)) {
                        System.out.println(recipe);
                    }
                }
            }
            
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.getCookingTime() <= time) {
                        System.out.println(recipe);
                    }
                }
            }
            
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String word = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.existOfIngredient(word)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
        
    }
}
