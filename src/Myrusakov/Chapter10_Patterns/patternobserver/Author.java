/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myrusakov.Chapter10_Patterns.patternobserver;

import java.util.ArrayList;

/**
 * @author Admin
 */
public class Author {
    Subscriber email;
    Subscriber sms;


    public ArrayList<Subscriber> listEmail = new ArrayList();
    public ArrayList<Subscriber> listSMS = new ArrayList();

    public void subscribe(Subscriber s) {
        if (s.equals(email)) listEmail.add(s);
        else listSMS.add(s);
    }

    public void unsubscribe(Subscriber s) {
        if (s.equals(email)) listEmail.remove(s);
        else listSMS.remove(s);
    }

    public void posts() {
        for (Subscriber s : listSMS) {
            s.update("Вышел новый пост на блоге");
        }
        for (Subscriber i : listEmail) {
            i.update("Вышел новый пост на блоге");
        }
    }

    public void news() {
        for (Subscriber z : listSMS) {
            z.update("Появилась новость на сайте");
        }
        for (Subscriber x : listEmail) {
            x.update("Появилась новость на сайте");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
