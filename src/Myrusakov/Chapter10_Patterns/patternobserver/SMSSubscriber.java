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
public class SMSSubscriber implements Subscriber {
    
    public String phone;
    
    public SMSSubscriber(String phone) {
        this.phone = phone;
    }
    
    public void update(String message) {
        System.out.println("Отправка на телефон (" + phone + ") сообщения: " + message);
    }
    
}
