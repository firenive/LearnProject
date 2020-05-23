/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternfacade;

/**
 *
 * @author Admin
 */
public class PatternFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double rub = 5000;
        double usd = Facade.rubToUSD(5000);
        System.out.println(usd);
    }
    
}
