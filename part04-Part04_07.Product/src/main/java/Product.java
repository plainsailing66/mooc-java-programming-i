/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
public class Product {
    private String name;
    private double price;
    private int num;
    
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.num = initialQuantity;
    }
    
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + num + "pcs" );
    }
}
