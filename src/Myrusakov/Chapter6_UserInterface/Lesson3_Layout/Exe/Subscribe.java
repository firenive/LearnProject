package Myrusakov.Chapter6_UserInterface.Lesson3_Layout.Exe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Subscribe extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox HTMLCheckBox;
    private JCheckBox javaScriptCheckBox;
    private JCheckBox PHPCheckBox;
    private JButton subscribeButton;
    private JPanel rootPanel;

    public Subscribe() {
        add(rootPanel);
        setTitle("This is my form");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        subscribeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "I am click the button");

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

}
