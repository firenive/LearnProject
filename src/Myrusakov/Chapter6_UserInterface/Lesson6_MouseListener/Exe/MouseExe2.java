package Myrusakov.Chapter6_UserInterface.Lesson6_MouseListener.Exe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseExe2 {
    private static int count = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("My program");
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        frame.setBounds(200,200, 640,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                count++;
                if (count > 10) JOptionPane.showMessageDialog(panel, "Максимум 10 кнопок");
                else {
                    String nameButton = "Button" + String.valueOf(count);
                    System.out.println("привет");
                    JButton button = new JButton(nameButton);
                    button.setBounds(e.getX(), e.getY(), 100, 30);
                    panel.add(button);
                    SwingUtilities.updateComponentTreeUI(frame);
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
    }
}
