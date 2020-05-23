/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myrusakov.Chapter3_OOP.Work.Interfaces;

/**
 *
 * @author Admin
 */
public interface DrawShape { // интерфейс по сути является перечеслением методов которые должны быть реализованы
    
    public void draw(); // будет выполняться в любом классе, который наследует интерфейс
    
    default void hello() { // при вызове любого класса, который наследует интерфейс это сообщение печатается оп умолчанию
        System.out.println("Hello World!");
    }
    
}
