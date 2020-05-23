package Myrusakov.Chapter6_UserInterface.Lesson8_CreateComponent.Exe;

import Myrusakov.Chapter3_OOP.FirstLesson.Exe.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class UserField extends JTextField {
    public UserField() {
        super("Default string");
        setPreferredSize(new Dimension(150,30));


        addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                if(getText().equals("Default string")) setText(null);

            }
            @Override
            public void focusLost(FocusEvent e) {
                if(getText().equals("")) setText("Default string");

            }
        });

    }

}
