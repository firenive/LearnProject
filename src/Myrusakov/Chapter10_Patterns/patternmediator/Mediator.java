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
class Mediator {
    
    public Person en, b, m;
    
    public void send(Person p, String message) {
        
        if (p == en) {
            m.notify("Товар вышел, нужен маркетинг");
            b.notify("Товар вышел, нужно учесть его в бухгалтерии");
        }
        else if (p == m) {
            en.notify("Маркетинг прошёл, нужен новый товар");
            b.notify("Маркетинг прошёл, нужен учесть его в бухгалтерии");
        }
        
    }
    
}
