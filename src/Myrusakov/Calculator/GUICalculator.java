package Myrusakov.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICalculator extends JFrame {
    private JPanel CalcPanel;
   // private JButton display;

    private JPanel ActionPanel;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton division;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton multiplication;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton subtraction;
    private JButton a0Button;
    private JButton dot;
    private JButton equally;
    private JButton addition;
    private JButton cButton;
    private JButton sqrtButton;
    private JButton powButton;
    private JButton deleteButton;
    private JTextField display;

    private boolean start;
    private double result;
    private String lastCommand;

    public GUICalculator() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 330, 310, 350);
       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        //display.setForeground(Color.BLACK);

        start = true;
        lastCommand = "=";


        InsertAction insert = new InsertAction();
        CommandAction command = new CommandAction();

        a7Button.addActionListener(insert);
        a8Button.addActionListener(insert);
        a9Button.addActionListener(insert);
        a4Button.addActionListener(insert);
        a5Button.addActionListener(insert);
        a6Button.addActionListener(insert);
        a1Button.addActionListener(insert);
        a2Button.addActionListener(insert);
        a3Button.addActionListener(insert);
        a0Button.addActionListener(insert);
        dot.addActionListener(insert);

        division.addActionListener(command);
        multiplication.addActionListener(command);
        subtraction.addActionListener(command);
        addition.addActionListener(command);
        equally.addActionListener(command);
        cButton.addActionListener(command);
        sqrtButton.addActionListener(command);
        powButton.addActionListener(command);
        deleteButton.addActionListener(command);


        add(CalcPanel);
        setVisible(true);
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        new GUICalculator();
    }

    private class InsertAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            if (!input.equals(".") || display.getText().indexOf(".") == -1) {
                display.setText(display.getText() + input);
            }

        }
    }
    private class CommandAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (start) lastCommand = command;
            else if (command.equals("sqrt") ||command.equals("pow")) {
                lastCommand = command;
                someFunction(Double.parseDouble(display.getText()));
                start = true;
            }
            else {
                calc(Double.parseDouble(display.getText()));
                lastCommand = command;
                 start = true;
            }
        }
    }
    private void calc(double x) {
        if (lastCommand.equals("+")) result +=x;
        else if (lastCommand.equals("-")) result -=x;
        else if (lastCommand.equals("*")) result *=x;
        else if (lastCommand.equals("/")) result /=x;

        else if (lastCommand.equals("C")) result = 0;
        else if (lastCommand.equals("=")) result =x;
        display.setText(Double.toString(result));
    }
    private void someFunction(double x) {
        if (lastCommand.equals("sqrt")) result = Math.sqrt(x);
        else if (lastCommand.equals("pow")) result = Math.pow(x, 2);
        display.setText(Double.toString(result));

    }



}
