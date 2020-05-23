package Myrusakov.Chapter6_UserInterface.Lesson7_KeyListener.Exe;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowsMove {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,640,480);
        JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, "Use the arrows to move the button");
        panel.setLayout(null);
        JButton button = new JButton("Move me");
        button.setBounds(200,200,100,30);

        panel.add(button);

        button.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int y = button.getY();
                int x = button.getX();
                if (e.getKeyCode()==40) button.setLocation(x, y+ 5);
                else if(e.getKeyCode()==38) button.setLocation(x, y-5);
                else if(e.getKeyCode()==37) button.setLocation(x-5, y);
                else if (e.getKeyCode()== 39) button.setLocation(x+5,y);
                int frameY = frame.getHeight();
                int frameX = frame.getWidth();
                System.out.println(y);
                System.out.println(frameY);

                if(y +70 >= frameY) button.setLocation(x,y-5);
                else if(y <= 0) button.setLocation(x,y+5);

                if(x +110 >= frameX) button.setLocation(x-5,y);
                if(x<=0) button.setLocation(x+5,y);


                SwingUtilities.updateComponentTreeUI(frame);

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(panel);
        frame.setVisible(true);


    }
}
