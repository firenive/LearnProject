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
public class Marketer extends Person {
    
    public Marketer(Mediator m) {
        super(m);
    }
    
    public void notify(String message) {
        System.out.println("Маркетолог получил сообщение: " + message);
    }
    
}
