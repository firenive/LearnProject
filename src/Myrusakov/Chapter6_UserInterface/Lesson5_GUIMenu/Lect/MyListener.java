package Myrusakov.Chapter6_UserInterface.Lesson5_GUIMenu.Lect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    JFrame frame;
    public MyListener (JFrame frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Exit")) System.exit(0);
        else if (command.equals("Blue")) {
            frame.getContentPane().setBackground(Color.BLUE);
        }
        else if(command.equals("Yellow")) {
            frame.getContentPane().setBackground(Color.YELLOW);
        }
        else if(command.equals("Select me")) JOptionPane.showMessageDialog(null,
                "Congratulations!!! You select me. Thank you ^_^ ");
    }
}
