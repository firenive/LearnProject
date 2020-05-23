package Myrusakov.Chapter6_UserInterface.Lesson6_MouseListener.Exe;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseExe extends JFrame {
        JFrame frame;
    public MouseExe() {
        super("My program");
        setBounds(200,200,640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int count = 0;
                if (e.getButton() == MouseEvent.BUTTON1) {
                    count++;
                    frame.add(new JButton());
                    if (count == 10) JOptionPane.showMessageDialog(null, "Максимум 10 кнопок");
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new MouseExe();
    }
}
