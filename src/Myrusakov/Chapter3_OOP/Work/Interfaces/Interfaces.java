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
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle(10, 20, 15);
        c.draw();
        Point p = new Point(5, 7);
        p.draw();
        c.hello();
        p.hello();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, 7, 10);
        shapes[1] = new Circle(7, 8, 15);
        shapes[2] = new Point(15, 17);
        for (Shape s : shapes) {
            /* !!!ПЛОХОЙ КОД!!!
            if (s instanceof Circle) s.draw();
            else if (s instanceof Point) s.draw();
            */
            s.draw();
        }
    }
    
}
