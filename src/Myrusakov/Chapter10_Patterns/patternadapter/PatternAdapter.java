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
public class PatternAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Adapter a = new Adapter(new BankAccount());
        System.out.println("Баланс в долларах: " + a.getSummaUSD());
    }
    
}
