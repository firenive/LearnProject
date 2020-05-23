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
abstract public class Shape implements DrawShape {
    
    public int x;
    public int y;
    
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}
