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
public class PatternObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author a = new Author();
        a.subscribe(new EmailSubscriber("abc@mail.ru"));
        a.subscribe(new EmailSubscriber("xyz@mail.ru"));
        a.subscribe(new SMSSubscriber("890156"));
        EmailSubscriber es = new EmailSubscriber("123@mail.ru");
        a.email = es;
        a.subscribe(es);
        a.posts();
       // a.unsubscribe(es);
        System.out.println("---------");
        a.news();
    }
    
}
