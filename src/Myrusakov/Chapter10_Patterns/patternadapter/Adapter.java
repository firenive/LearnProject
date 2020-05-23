/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternadapter;

/**
 *
 * @author Admin
 */
public class Adapter {
    
    private BankAccount b;
    final double RATIO = 60;
    
    public Adapter(BankAccount b) {
        this.b = b;
    }
    
    public double getSummaUSD() {
        double summa = b.getSumma();
        return ((double) Math.round(summa * 100 / RATIO)) / 100;
    }
    
}
