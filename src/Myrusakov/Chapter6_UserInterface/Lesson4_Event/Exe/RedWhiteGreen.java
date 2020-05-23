package Myrusakov.Chapter6_UserInterface.Lesson4_Event.Exe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RedWhiteGreen extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton redButton;
    private JButton whiteButton;
    private JButton greenButton;

    public static void main(String[] args) {
        RedWhiteGreen frame = new RedWhiteGreen();
        frame.setVisible(true);
    }

    public RedWhiteGreen() {
        add(mainPanel);
        setBounds(200, 200, 400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        redButton.addActionListener(this);
        whiteButton.addActionListener(this);
        greenButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Red")) mainPanel.setBackground(Color.RED);
        else if (e.getActionCommand().equals("White")) mainPanel.setBackground(Color.WHITE);
        else if (e.getActionCommand().equals("Green")) mainPanel.setBackground(Color.GREEN);
    }

}
