package Myrusakov.Chapter7_Graphic.Lesson2_DrawFigure.Exe;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawHuman extends JFrame {
    public static void main(String[] args) {
        new DrawHuman();
    }
    public DrawHuman() {
        super("It's my human");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,300,800,600);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        // head
        g2.drawOval(100,100, 150,150);
        // ears
        Ellipse2D leftEar = new Ellipse2D.Double(50,130,50,70);
        Ellipse2D rightEar = new Ellipse2D.Double(250,130,50,70);
        g2.draw(leftEar);
        g2.draw(rightEar);

        // eyes
        g2.setColor(new Color(0,160, 0));
        g2.fillOval(130,140,30,20);
        g2.fillOval(190,140,30,20);
        // nose
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(6));
        g2.drawArc(160,160,20,40,90,180);
        // mouth
        g2.setColor(Color.RED);
        g2.drawArc(160,200,60,20,180,90);

        // jowls
        g2.setStroke(new BasicStroke(2));
        g2.setColor(new Color(238,238,238));
        Ellipse2D leftCheek = new Ellipse2D.Double(110,160,40,40);
        Ellipse2D rightCheek = new Ellipse2D.Double(185,160,40,40);
        g2.draw(leftCheek);
        g2.draw(rightCheek);

        // body
        g2.setColor(Color.BLACK);
        g2.drawRoundRect(85,250, 170, 200,40,30);
        // hands
        g2.drawRoundRect(10, 270, 75,50,40,30);
        g2.drawRoundRect(255, 270, 75,50,40,30);
        // legs
        g2.drawRoundRect(105,450,50,75,40,30);
        g2.drawRoundRect(185,450,50,75,40,30);

        // Ellipse2D leftCheck = new Ellipse2D.Double(300, 150, 60, 70);
        //        Ellipse2D rightCheck = new Ellipse2D.Double(470, 150, 60, 70);

        // freckles
        // left cheek 25 freckles
        g2.setColor(new Color(255,136,0));
        g2.setStroke(new BasicStroke(5));
        for (int i = 0; i < 25; i++) {
            int x = (int) Math.ceil(Math.random() * (40) + 110);
            int y = (int) Math.ceil(Math.random() * (40) + 170);
            g2.fillOval(x, y, 5, 5);
        }
        // right cheek 25 freckles
        for (int i = 0; i < 25; i++) {
            int x = (int) Math.ceil(Math.random() * (leftCheek.getWidth()) + 185);
            int y = (int) Math.ceil(Math.random() * (leftCheek.getHeight()) + 170);
            g2.fillOval(x, y, 5, 5);
        }



    }
}
