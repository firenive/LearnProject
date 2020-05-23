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
public class  Circle extends Shape {
    
    public int r;
    
    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public void draw() {
        String s = "Рисуем окружность с центром (" + x + ", " + y + ") ";
        s += "и радиусом " + r;
        System.out.println(s);
    }
    
}
