/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myrusakov.Chapter10_Patterns.patternobserver;

/**
 *
 * @author Admin
 */
public class EmailSubscriber implements Subscriber {
    
    public String email;
    
    public EmailSubscriber(String email) {
        this.email = email;
    }
    public EmailSubscriber() {

    }
    
    public void update(String message) {
        System.out.println("Отправка на e-mail (" + email + ") сообщения: " + message);
    }
    
}
