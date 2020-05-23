package Myrusakov.Chapter6_UserInterface.Lesson8_CreateComponent.Exe;

import Myrusakov.Chapter3_OOP.FirstLesson.Exe.User;

import javax.swing.*;
import java.awt.*;

public class FocusMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,400,250);


        JPanel panel = new JPanel();

        UserField field = new UserField();
        UserField field1 = new UserField();
        JTextField defaultField = new JTextField("Text");
        defaultField.setPreferredSize(new Dimension(150,30));

        panel.add(field);
        panel.add(field1);
        panel.add(defaultField);

        frame.add(panel);
        frame.setVisible(true);
    }
}
