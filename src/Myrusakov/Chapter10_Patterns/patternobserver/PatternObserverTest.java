/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myrusakov.Chapter10_Patterns.patternobserver;

/**
 * @author Admin
 */
public class PatternObserverTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author a = new Author();
        Subscriber es1 = new EmailSubscriber("abc@mail.ru");
        Subscriber es2 = new EmailSubscriber("xyz@mail.ru");
        Subscriber es3 = new EmailSubscriber("123@mail.ru");

        Subscriber ss1 = new SMSSubscriber("8910");
        Subscriber ss2 = new SMSSubscriber("8800");
        Subscriber ss3 = new SMSSubscriber("8953666");

        a.email = es1;
        a.subscribe(es1);

        a.email = es2;
        a.subscribe(es2);

        a.email = es3;
        a.subscribe(es3);

        a.sms = ss1;
        a.subscribe(ss1);
        a.sms = ss2;
        a.subscribe(ss2);
        a.sms = ss3;
        a.subscribe(ss3);

        a.subscribe(new SMSSubscriber("999999"));

        a.posts();
//      a.unsubscribe(es);
        System.out.println("---------");
        a.news();
    }

}
