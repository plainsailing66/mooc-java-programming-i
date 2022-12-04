/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
public class Debt {
    private double balance;
    private double ir;
    
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.ir = initialInterestRate;
    }
    
    public void printBalance() {
        System.out.println(balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * this.ir;
    }
}
