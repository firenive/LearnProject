package Myrusakov.Chapter6_UserInterface.Lesson1_CreateWindow.Exe;

import javax.swing.*;
import java.awt.*;

public class CreateWindowExe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My program");
        Point base = new Point(100,200);
        Dimension size = new Dimension(800,600);
        frame.setSize(size);
        frame.setLocation(base);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
