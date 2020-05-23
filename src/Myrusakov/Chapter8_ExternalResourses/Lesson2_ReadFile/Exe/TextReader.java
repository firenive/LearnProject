package Myrusakov.Chapter8_ExternalResourses.Lesson2_ReadFile.Exe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader extends JFrame {
    private JPanel main;
    private JTextField pathToTheTextTextField;
    private JButton showTextButton;
    private JTextArea textArea1;

    public TextReader() {
        super("My program");
        add(main);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 640, 480);
        setVisible(true);
        showTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String path = pathToTheTextTextField.getText();
                    String line;
                    BufferedReader reader = new BufferedReader(new FileReader(path));
                    // ArrayList<String> text = new ArrayList<>();
                    while ((line = reader.readLine()) != null) {
                        textArea1.append(line);
                        textArea1.append("\n");
                    }
                    reader.close();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        pathToTheTextTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (pathToTheTextTextField.getText().equals("path to the text file"))
                    pathToTheTextTextField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (pathToTheTextTextField.getText().equals(""))
                    pathToTheTextTextField.setText("path to the text file");

            }
        });

    }


    public static void main(String[] args) {
        new TextReader();
    }

}
