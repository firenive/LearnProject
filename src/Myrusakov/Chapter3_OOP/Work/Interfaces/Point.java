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
public class Point extends Shape {

    public Point(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void draw() {
        System.out.println("Рисуем точку с координатами (" + x + ", " + y + ")");
    }
    
}
