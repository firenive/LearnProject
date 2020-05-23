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
abstract public class Person {
    
    Mediator m;
    
    public Person(Mediator m) {
        this.m = m;
    }
    
    public void send(String message) {
        m.send(this, message);
    }
    
    abstract public void notify(String message);
    
}
