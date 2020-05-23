/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myrusakov.Chapter10_Patterns.patternmediator;

/**
 *
 * @author Admin
 */
public class PatternMediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mediator mediator = new Mediator();
        Person en = new Engineer(mediator);
        Person m = new Marketer(mediator);
        Person b = new Booker(mediator);
        mediator.en = en;
        mediator.m = m;
        mediator.b = b;
        
        en.send("Я сделал новый продукт");
        m.send("Я завершил маркетинг");
    }
    
}
