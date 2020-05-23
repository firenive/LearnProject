package Myrusakov.Chapter7_Graphic.Lesson3_Animation.Exe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class DrawHumanAnimation extends JFrame implements ActionListener {
    int x;
    int basePoint;
    private Timer timer;
    boolean left = false;
    public static void main(String[] args) {
        new DrawHumanAnimation();
    }
    public DrawHumanAnimation() {
        super("It's my human");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,300,800,600);
        setLayout(new FlowLayout());
        JButton start = new JButton("Start");
        start.addActionListener((ae) -> {
            if (ae.getActionCommand().equals("Start")) {
                start.setText("Stop");
                timer.start();
            }
            if (ae.getActionCommand().equals("Stop")
            ) {
                start.setText("Start");
                timer.stop();
            }
        });

        add(start);
        setVisible(true);

        timer = new Timer(200, this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(basePoint +10 > 0&& !left) {
            basePoint +=10;
            x+= 10;
            if (basePoint + 330 > getWidth()) left = true;
        }
        else if (left ) {
            x -= 10;
            basePoint -= 10;
            if (basePoint == 0) left = false;
        }
        System.out.println(basePoint);
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        // head
        g2.drawOval(x + 100,100, 150,150);
        // ears
        Ellipse2D leftEar = new Ellipse2D.Double(x + 50,130,50,70);
        Ellipse2D rightEar = new Ellipse2D.Double( x +250,130,50,70);
        g2.draw(leftEar);
        g2.draw(rightEar);

        // eyes
        g2.setColor(new Color(0,160, 0));
        g2.fillOval(x + 130,140,30,20);
        g2.fillOval(x + 190,140,30,20);
        // nose
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(6));
        g2.drawArc(x + 160,160,20,40,90,180);
        // mouth
        g2.setColor(Color.RED);
        g2.drawArc(x + 160,200,60,20,180,90);

        // jowls
        g2.setStroke(new BasicStroke(2));
        g2.setColor(new Color(238,238,238));
        Ellipse2D leftCheek = new Ellipse2D.Double(x + 110,160,40,40);
        Ellipse2D rightCheek = new Ellipse2D.Double(x + 185,160,40,40);
        g2.draw(leftCheek);
        g2.draw(rightCheek);
        // body
        g2.setColor(Color.BLACK);
        g2.drawRoundRect(x + 85,250, 170, 200,40,30);
        // hands
        g2.drawRoundRect(basePoint + 10, 270, 75,50,40,30);
        g2.drawRoundRect(x + 255, 270, 75,50,40,30);
        // legs
        g2.drawRoundRect(x+ 105,450,50,75,40,30);
        g2.drawRoundRect(x + 185,450,50,75,40,30);

    }

}
