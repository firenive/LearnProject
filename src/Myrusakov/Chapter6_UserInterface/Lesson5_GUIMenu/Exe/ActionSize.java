package Myrusakov.Chapter6_UserInterface.Lesson5_GUIMenu.Exe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionSize implements ActionListener {
    private JFrame frame;
    public ActionSize(JFrame frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("640x480")) frame.setSize(640,480);
        if (command.equals("800x600")) frame.setSize(800,600);
        if (command.equals("1024x768")) frame.setSize(1024,768);
        if (command.equals("Exit")) System.exit(0);
    }

}
