package Myrusakov.Chapter6_UserInterface.Lesson3_Layout.Exe;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LayoutExe {

    public static final int LEFT = SwingConstants.RIGHT;

    public static void main(String[] args) {
        JFrame frame = new JFrame("My program");
        frame.setBounds(200,200, 400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20,0,0,0));
        top.setLayout(new GridBagLayout());
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        GridBagConstraints constraints = new GridBagConstraints();
        nameField.setPreferredSize(new Dimension(150,15));
        emailField.setPreferredSize(new Dimension(150,15));

        constraints.insets = new Insets(0,10,10, 0);
        constraints.gridx = 0;
        constraints.gridy = 0;
        top.add(nameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        top.add(nameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        top.add(emailLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        top.add(emailField, constraints);

        JPanel middle = new JPanel();
        middle.setLayout(new GridBagLayout());
        middle.setBorder(new EmptyBorder(0,0,0,0));
        JCheckBox html = new JCheckBox("HTML");
        JCheckBox js = new JCheckBox("JavaScript");
        JCheckBox php = new JCheckBox("PHP");
        html.setHorizontalAlignment(SwingConstants.LEFT);
        js.setHorizontalAlignment(SwingConstants.LEFT);
        php.setHorizontalAlignment(SwingConstants.LEFT);

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.insets = new Insets(0, 0, 2, 0);
        constraints1.fill = GridBagConstraints.BOTH;
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        middle.add(html, constraints1);

        constraints1.gridx = 0;
        constraints1.gridy = 1;
        middle.add(js, constraints1);

        constraints1.gridx = 0;
        constraints1.gridy = 2;
        middle.add(php, constraints1);

        JPanel bottom = new JPanel();
        JButton subscribe = new JButton("Subscribe");
        bottom.add(subscribe);

        frame.add(top, BorderLayout.NORTH);
        frame.add(middle, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
