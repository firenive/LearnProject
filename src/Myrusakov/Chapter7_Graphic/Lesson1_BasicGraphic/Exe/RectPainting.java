package Myrusakov.Chapter7_Graphic.Lesson1_BasicGraphic.Exe;

import javax.swing.*;
import java.awt.*;

public class RectPainting extends JFrame {
    static int x, y, width, height;
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "You can draw a Rectangle with the  following parameters");
        String stringX = JOptionPane.showInputDialog(null,
                "Please, enter the \"x\" coordinate of the rectangle's starting point" );
        String stringY = JOptionPane.showInputDialog(null,
                "Please, enter the \"y\" coordinate of the rectangle's starting point" );

        String stringWidth = JOptionPane.showInputDialog(null, "Please, enter the width of the rectangle" );
        String stringHeight = JOptionPane.showInputDialog(null, "Please, enter the height of the rectangle" );
        x = Integer.parseInt(stringX);
        y = Integer.parseInt(stringY);
        width = Integer.parseInt(stringWidth);
        height = Integer.parseInt(stringHeight);
        new RectPainting();

    }

    public RectPainting() {
        super("");
        setBounds(200,200,640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);
        setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(x, y, width, height);
    }
}
